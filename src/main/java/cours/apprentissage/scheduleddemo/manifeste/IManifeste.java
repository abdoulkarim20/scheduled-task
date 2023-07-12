package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteArticleDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface IManifeste {
    ManifesteDTO save(ManifestePostDTO manifesteDTO);
    Page<ManifesteDTO> getManifesteBySpecification(String annee, String bureau, String navire, Date dateArrivee, String connaissement);
    List<ManifesteArticleDTO>getAllManifeste();
    void getAllManfiesteAndSave();
}
