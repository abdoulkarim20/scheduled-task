package cours.apprentissage.scheduleddemo.manifeste.dtos;

import cours.apprentissage.scheduleddemo.article.Article;
import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManifestePostDTO {
    private String annee;
    private String bureau;
    private Long numero;
    private String consignataire;
    private String numeroRepertoire;
    private String navire;
    private String typeNavire;
    private String origine;
    private String provenance;
    private String pavillon;
    private Date dateArrivee;
    private Double volume;
    private Long nombreArticle;
    private String ppmDeclarant;
    private String ppmBeneficiaire;
    List<Article>articles=new ArrayList<>();

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
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

    public String getTypeNavire() {
        return typeNavire;
    }

    public void setTypeNavire(String typeNavire) {
        this.typeNavire = typeNavire;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
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

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Long getNombreArticle() {
        return nombreArticle;
    }

    public void setNombreArticle(Long nombreArticle) {
        this.nombreArticle = nombreArticle;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public String getPpmDeclarant() {
        return ppmDeclarant;
    }

    public void setPpmDeclarant(String ppmDeclarant) {
        this.ppmDeclarant = ppmDeclarant;
    }

    public String getPpmBeneficiaire() {
        return ppmBeneficiaire;
    }

    public void setPpmBeneficiaire(String ppmBeneficiaire) {
        this.ppmBeneficiaire = ppmBeneficiaire;
    }
}
