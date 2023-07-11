package cours.apprentissage.scheduleddemo.avarnav;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvarnavRepository extends JpaRepository<Avarnav,Long> {
}
