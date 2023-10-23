package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteArticleDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/liste")
    public List<ManifesteArticleDTO>getAll(){
        return iManifeste.getAllManifeste();
    }

    @PostMapping("/save-all-manifeste-from-douane")
    public void saveALlManifeste(@RequestBody List<ManifesteArticleDTO> list){
        for (ManifesteArticleDTO manifesteArticleDTO : list) {
            iManifeste.saveTest(manifesteArticleDTO);
        }
    }
}
