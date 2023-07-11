package cours.apprentissage.scheduleddemo.avarnav;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "avarnavs")
public class Avarnav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String escale;
    private LocalDateTime dateMouvement;
    private String navire;
    private String consignataire;
    private String cargaison;
    private String typeMouvement;
    private String posteQuaiDemande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscale() {
        return escale;
    }

    public void setEscale(String escale) {
        this.escale = escale;
    }

    public LocalDateTime getDateMouvement() {
        return dateMouvement;
    }

    public void setDateMouvement(LocalDateTime dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getConsignataire() {
        return consignataire;
    }

    public void setConsignataire(String consignataire) {
        this.consignataire = consignataire;
    }

    public String getCargaison() {
        return cargaison;
    }

    public void setCargaison(String cargaison) {
        this.cargaison = cargaison;
    }

    public String getTypeMouvement() {
        return typeMouvement;
    }

    public void setTypeMouvement(String typeMouvement) {
        this.typeMouvement = typeMouvement;
    }

    public String getPosteQuaiDemande() {
        return posteQuaiDemande;
    }

    public void setPosteQuaiDemande(String posteQuaiDemande) {
        this.posteQuaiDemande = posteQuaiDemande;
    }

    @Override
    public String toString() {
        return "Avarnav{" +
                "id=" + id +
                ", escale='" + escale + '\'' +
                ", dateMouvement=" + dateMouvement +
                ", navire='" + navire + '\'' +
                ", consignataire='" + consignataire + '\'' +
                ", cargaison='" + cargaison + '\'' +
                ", typeMouvement='" + typeMouvement + '\'' +
                ", posteQuaiDemande='" + posteQuaiDemande + '\'' +
                '}';
    }
}
