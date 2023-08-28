package cours.apprentissage.scheduleddemo.conteneur;

import cours.apprentissage.scheduleddemo.article.Article;

import javax.persistence.*;

@Entity
@Table(name = "conteneurs")
public class Conteneur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conteneur;
    private String type;
    private String taille;
    private String plomb;
    @ManyToOne
    private Article article;

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

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
