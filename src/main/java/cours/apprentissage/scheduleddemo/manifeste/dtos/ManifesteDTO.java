package cours.apprentissage.scheduleddemo.manifeste.dtos;

import java.util.Date;

public class ManifesteDTO {
    private String anneeManif;
    private String bureauManif;
    private Long numeroManif;
    private String consignataire;
    private String numeroRepertoire;
    private String navire;
    private String provenance;
    private String pavillon;
    private Date dateArrivee;
    private Double valapprox;
    private Long nombreArticle;
    /** Les attributs qui a ete ajouter par l'app GUP et qui ne provient pas de la douane*/
    private String codeConsignataire;
    private String codeManutentionnaire;

    public String getAnneeManif() {
        return anneeManif;
    }

    public void setAnneeManif(String anneeManif) {
        this.anneeManif = anneeManif;
    }

    public String getBureauManif() {
        return bureauManif;
    }

    public void setBureauManif(String bureauManif) {
        this.bureauManif = bureauManif;
    }

    public Long getNumeroManif() {
        return numeroManif;
    }

    public void setNumeroManif(Long numeroManif) {
        this.numeroManif = numeroManif;
    }

    public String getConsignataire() {
        return consignataire;
    }

    public void setConsignataire(String consignataire) {
        this.consignataire = consignataire;
    }

    public String getNumeroRepertoire() {
        return numeroRepertoire;
    }

    public void setNumeroRepertoire(String numeroRepertoire) {
        this.numeroRepertoire = numeroRepertoire;
    }

    public String getNavire() {
        return navire;
    }

    public void setNavire(String navire) {
        this.navire = navire;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getPavillon() {
        return pavillon;
    }

    public void setPavillon(String pavillon) {
        this.pavillon = pavillon;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Double getValapprox() {
        return valapprox;
    }

    public void setValapprox(Double valapprox) {
        this.valapprox = valapprox;
    }

    public Long getNombreArticle() {
        return nombreArticle;
    }

    public void setNombreArticle(Long nombreArticle) {
        this.nombreArticle = nombreArticle;
    }

    public String getCodeConsignataire() {
        return codeConsignataire;
    }

    public void setCodeConsignataire(String codeConsignataire) {
        this.codeConsignataire = codeConsignataire;
    }

    public String getCodeManutentionnaire() {
        return codeManutentionnaire;
    }

    public void setCodeManutentionnaire(String codeManutentionnaire) {
        this.codeManutentionnaire = codeManutentionnaire;
    }
}
