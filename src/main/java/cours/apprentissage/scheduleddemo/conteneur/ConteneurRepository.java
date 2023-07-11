package cours.apprentissage.scheduleddemo.conteneur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConteneurRepository extends JpaRepository<Conteneur,Long> {
}
