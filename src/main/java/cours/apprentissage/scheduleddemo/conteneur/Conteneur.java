package cours.apprentissage.scheduleddemo.conteneur;

import cours.apprentissage.scheduleddemo.article.Article;

import javax.persistence.*;

@Entity
@Table(name = "conteneurs")
public class Conteneur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroConteneur;
    private String typeConteneur;
    private String tailleConteneur;
    private String numeroPlomb;
    @ManyToOne
    private Article article;

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

    public String getTypeConteneur() {
        return typeConteneur;
    }

    public void setTypeConteneur(String typeConteneur) {
        this.typeConteneur = typeConteneur;
    }

    public String getTailleConteneur() {
        return tailleConteneur;
    }

    public void setTailleConteneur(String tailleConteneur) {
        this.tailleConteneur = tailleConteneur;
    }

    public String getNumeroPlomb() {
        return numeroPlomb;
    }

    public void setNumeroPlomb(String numeroPlomb) {
        this.numeroPlomb = numeroPlomb;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
