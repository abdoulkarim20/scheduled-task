package cours.apprentissage.scheduleddemo.manifeste.dtos;

import cours.apprentissage.scheduleddemo.article.Article;

import java.util.ArrayList;
import java.util.List;

public class ManifestePostDTO {
    private String annee;
    private String bureau;
    private Long numero;
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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "ManifestePostDTO{" +
                "annee='" + annee + '\'' +
                ", bureau='" + bureau + '\'' +
                ", numero=" + numero +
                ", articles=" + articles +
                '}';
    }
}
