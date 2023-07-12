package cours.apprentissage.scheduleddemo.manifeste.specification;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class ManifesteSpecification {
    public static Specification<ManifesteDTO> getManifesteBySpecification(String annee, String bureau, String navire, Date dateArrivee, String connaissement) {
        Specification<ManifesteDTO> specifications = Specification.where(
                        annee == null ? null : getManifesteByAnnee(annee))
                .and(bureau == null ? null : getManifesteByBureau(bureau))
                .and(navire == null ? null : getManifesteByNavire(navire))
                .and(dateArrivee == null ? null : getManifesteByDateArrivee(dateArrivee))
                .and(connaissement == null ? null : getManifesteByConnaissement(connaissement)

                );
        return specifications;
    }

    private static Specification<ManifesteDTO> getManifesteByConnaissement(String connaissement) {
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .equal(root.get("connaissement"), connaissement.trim());
    }

    private static Specification<ManifesteDTO> getManifesteByDateArrivee(Date dateArrivee) {
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .equal(root.get("dateArrivee"), dateArrivee);
    }

    private static Specification<ManifesteDTO> getManifesteByNavire(String navire) {
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .equal(root.get("navire"), navire.trim());
    }

    private static Specification<ManifesteDTO> getManifesteByBureau(String bureau) {
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .equal(root.get("bureau"), bureau.trim());
    }

    private static Specification<ManifesteDTO> getManifesteByAnnee(String annee) {
        return (root, query, criteriaBuilder) -> criteriaBuilder
                .equal(root.get("annee"), annee.trim());
    }
}
