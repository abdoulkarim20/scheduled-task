package cours.apprentissage.scheduleddemo.conteneur.dtos;

import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;

public class ConteneurDTO {
    private Long id;
    private String conteneur;
    private String type;
    private String taille;
    private String plomb;
    private ArticleDTO article;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteneur() {
        return conteneur;
    }

    public void setConteneur(String conteneur) {
        this.conteneur = conteneur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getPlomb() {
        return plomb;
    }

    public void setPlomb(String plomb) {
        this.plomb = plomb;
    }

    public ArticleDTO getArticle() {
        return article;
    }

    public void setArticle(ArticleDTO article) {
        this.article = article;
    }
}
