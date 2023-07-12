package cours.apprentissage.scheduleddemo.manifeste;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifesteRepository extends JpaRepository<Manifeste,Long> {
    Page<Manifeste> findAll(Specification<ManifesteDTO> manifesteDTO);
}
