package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifestePostDTO;

public interface IManifeste {
    ManifesteDTO save(ManifestePostDTO manifesteDTO);
}
