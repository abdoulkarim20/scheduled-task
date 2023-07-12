package cours.apprentissage.scheduleddemo.conteneur.dtos;

public class ConteneurArticleDTO {
    private Long id;
    private String numeroConteneur;
    private String typeConteneur;
    private String tailleConteneur;
    private String numeroPlomb;

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
}
