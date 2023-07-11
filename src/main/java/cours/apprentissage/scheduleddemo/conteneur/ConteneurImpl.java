package cours.apprentissage.scheduleddemo.conteneur;

import cours.apprentissage.scheduleddemo.conteneur.dtos.ConteneurDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ConteneurImpl implements IConteneur {

    private final ConteneurRepository conteneurRepository;

    public ConteneurImpl(ConteneurRepository conteneurRepository) {
        this.conteneurRepository = conteneurRepository;
    }

    @Override
    public ConteneurDTO save(ConteneurDTO conteneurDTO) {
        return null;
    }
}
