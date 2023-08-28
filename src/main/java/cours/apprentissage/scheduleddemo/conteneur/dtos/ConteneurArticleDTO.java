package cours.apprentissage.scheduleddemo.conteneur.dtos;

public class ConteneurArticleDTO {
    private String conteneur;
    private String type;
    private String taille;
    private String plomb;

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
}
