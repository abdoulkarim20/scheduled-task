package cours.apprentissage.scheduleddemo.baed;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bons-delivrer-douane")
@CrossOrigin("*")
public class BaedController {
    private final BaedReposirtory baedReposirtory;

    public BaedController(BaedReposirtory baedReposirtory) {
        this.baedReposirtory = baedReposirtory;
    }
    @GetMapping("/liste")
    public List<Baed>getAll(){
        return baedReposirtory.findAll();
    }
}
