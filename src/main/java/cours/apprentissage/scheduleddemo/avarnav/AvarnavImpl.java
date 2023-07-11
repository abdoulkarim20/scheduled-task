package cours.apprentissage.scheduleddemo.avarnav;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Transactional
public class AvarnavImpl implements IAvarnav {
    public AvarnavImpl(AvarnavRepository avarnavRepository) {
        this.avarnavRepository = avarnavRepository;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    private final AvarnavRepository avarnavRepository;

    @Override
    public void getAllAvarnavFromDouane() {
        String url = "http://localhost:8082/avarnavs/liste";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Avarnav>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        List<Avarnav> listesAvarnav = response.getBody();
        for (Avarnav avarnav : listesAvarnav) {
            /*avarnav.setEscale("Guinee Conakry");*/
            save(avarnav);
        }
    }

    @Override
    public Avarnav save(Avarnav avarnav) {
        return avarnavRepository.save(avarnav);
    }
}
