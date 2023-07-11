package cours.apprentissage.scheduleddemo.manifeste.dtos;

public class ManifesteDTO {
    private Long id;
    private String annee;
    private String bureau;
    private Long numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "ManifesteDTO{" +
                "id=" + id +
                ", annee='" + annee + '\'' +
                ", bureau='" + bureau + '\'' +
                ", numero=" + numero +
                '}';
    }
}
