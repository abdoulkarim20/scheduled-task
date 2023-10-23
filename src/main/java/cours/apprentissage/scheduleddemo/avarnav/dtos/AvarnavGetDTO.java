package cours.apprentissage.scheduleddemo.avarnav.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AvarnavGetDTO {
    private Long id;
    private String escale;
    private LocalDate dateMouvement;
    private String navire;
    private String consignataire;
    private String cargaison;
    private String typeMouvement;
    private String posteQuaiDemande;
    private String dateArrivee;

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

    public LocalDate getDateMouvement() {
        return dateMouvement;
    }

    public void setDateMouvement(LocalDate dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
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
}
