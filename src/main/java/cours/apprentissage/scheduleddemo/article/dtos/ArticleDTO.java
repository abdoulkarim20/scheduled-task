package cours.apprentissage.scheduleddemo.article.dtos;

import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;

public class ArticleDTO {
    private Long id;
    private String connaissement;
    private ManifesteDTO manifeste;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConnaissement() {
        return connaissement;
    }

    public void setConnaissement(String connaissement) {
        this.connaissement = connaissement;
    }

    public ManifesteDTO getManifeste() {
        return manifeste;
    }

    public void setManifeste(ManifesteDTO manifeste) {
        this.manifeste = manifeste;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "id=" + id +
                ", connaissement='" + connaissement + '\'' +
                ", manifeste=" + manifeste +
                '}';
    }
}
