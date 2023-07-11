package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manifestes")
@CrossOrigin("*")
public class ManifesteController {
    private final IManifeste iManifeste;

    public ManifesteController(IManifeste iManifeste) {
        this.iManifeste = iManifeste;
    }
    @PostMapping()
    public ManifesteDTO manifesteDTO(@RequestBody ManifestePostDTO object){
        return iManifeste.save(object);
    }
}
