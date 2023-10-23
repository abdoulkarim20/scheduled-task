package cours.apprentissage.scheduleddemo.avarnav;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Transactional
@EnableScheduling
public class AvarnavImpl implements IAvarnav {
    public AvarnavImpl(AvarnavRepository avarnavRepository) {
        this.avarnavRepository = avarnavRepository;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    private final AvarnavRepository avarnavRepository;
    @Scheduled(cron = "0 5 17 * * *")
    @Override
    public void getAllAvarnavFromDouane() {
        String url = "http://192.168.2.16:8082/backendgateway/avarnavs/liste";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Avarnav>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        List<Avarnav> listesAvarnav = response.getBody();
        for (Avarnav avarnav : listesAvarnav) {
            System.out.println("les avarnaves sont: "+avarnav.getEscale());
            save(avarnav);
        }
    }

    @Override
    public Avarnav save(Avarnav avarnav) {
        return avarnavRepository.save(avarnav);
    }

    @Override
    public List<Avarnav> getAll() {
        return avarnavRepository.findAll();
    }
}
