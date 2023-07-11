package cours.apprentissage.scheduleddemo.conteneur.dtos;

import cours.apprentissage.scheduleddemo.article.dtos.ArticleDTO;

public class ConteneurDTO {
    private Long id;
    private String numeroConteneur;
    private ArticleDTO article;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroConteneur() {
        return numeroConteneur;
    }

    public void setNumeroConteneur(String numeroConteneur) {
        this.numeroConteneur = numeroConteneur;
    }

    public ArticleDTO getArticle() {
        return article;
    }

    public void setArticle(ArticleDTO article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "ConteneurDTO{" +
                "id=" + id +
                ", numeroConteneur='" + numeroConteneur + '\'' +
                ", article=" + article +
                '}';
    }
}
