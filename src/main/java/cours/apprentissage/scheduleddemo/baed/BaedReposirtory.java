package cours.apprentissage.scheduleddemo.baed;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaedReposirtory extends JpaRepository<Baed,Long> {
}
