package cours.apprentissage.scheduleddemo.manifeste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifesteRepository extends JpaRepository<Manifeste,Long> {
}
