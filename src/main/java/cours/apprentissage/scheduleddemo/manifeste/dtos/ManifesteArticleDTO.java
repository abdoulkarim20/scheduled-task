package cours.apprentissage.scheduleddemo.manifeste.dtos;

import cours.apprentissage.scheduleddemo.article.dtos.ArticleManifesteDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManifesteArticleDTO {
    private String annee_manif;
    private String bureau_manif;
    private Long numero_manif;
    private String consignataire;
    private String repertoire;
    private String navire;
    private String provenance;
    private String pavillon;
    private Date date_arrivee;
    private Double valapprox;
    private Long nbre_article;
    /**
     * Les attributs qui a ete ajouter par l'app GUP et qui ne provient pas de la douane
     */
    private String codeConsignataire;
    private String codeManutentionnaire;
    private List<ArticleManifesteDTO> articles = new ArrayList<>();

    public String getAnnee_manif() {
        return annee_manif;
    }

    public void setAnnee_manif(String annee_manif) {
        this.annee_manif = annee_manif;
    }

    public String getBureau_manif() {
        return bureau_manif;
    }

    public void setBureau_manif(String bureau_manif) {
        this.bureau_manif = bureau_manif;
    }

    public Long getNumero_manif() {
        return numero_manif;
    }

    public void setNumero_manif(Long numero_manif) {
        this.numero_manif = numero_manif;
    }

    public String getConsignataire() {
        return consignataire;
    }

    public void setConsignataire(String consignataire) {
        this.consignataire = consignataire;
    }

    public String getRepertoire() {
        return repertoire;
    }

    public void setRepertoire(String repertoire) {
        this.repertoire = repertoire;
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

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Double getValapprox() {
        return valapprox;
    }

    public void setValapprox(Double valapprox) {
        this.valapprox = valapprox;
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

    public List<ArticleManifesteDTO> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleManifesteDTO> articles) {
        this.articles = articles;
    }

    public Long getNbre_article() {
        return nbre_article;
    }

    public void setNbre_article(Long nbre_article) {
        this.nbre_article = nbre_article;
    }

}

