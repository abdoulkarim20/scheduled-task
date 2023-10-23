package cours.apprentissage.scheduleddemo.avarnav;

import com.fasterxml.jackson.core.JsonProcessingException;
import cours.apprentissage.scheduleddemo.avarnav.dtos.AvarnavDTO;
import cours.apprentissage.scheduleddemo.avarnav.dtos.AvarnavPostDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avarnavs")
@CrossOrigin("*")
public class AvarnavController {
    private final IAvarnav iAvarnav;

    public AvarnavController(IAvarnav iAvarnav) {
        this.iAvarnav = iAvarnav;
    }

    @PostMapping("/save-avarnav")
    public void save(@RequestBody AvarnavDTO data) {
        System.out.println(data);
        for (AvarnavPostDTO avarnav:data.getData()){
            System.out.println(avarnav.getCARGAISON());
            /*iAvarnav.save(avarnav);*/
        }
    }
    @GetMapping("/liste")
    public List<Avarnav>getAll(){
        return iAvarnav.getAll();
    }


    @PostMapping("/save")
    public Avarnav save(@RequestBody Avarnav avarnav){
        return iAvarnav.save(avarnav);
    }

}
