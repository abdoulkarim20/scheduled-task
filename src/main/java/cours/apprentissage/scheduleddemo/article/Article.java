package cours.apprentissage.scheduleddemo.article;

import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.manifeste.Manifeste;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String connaissement;
    @ManyToOne
    private Manifeste manifeste;
    @OneToMany(mappedBy = "article")
    private List<Conteneur>conteneurs=new ArrayList<>();

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

    public Manifeste getManifeste() {
        return manifeste;
    }

    public void setManifeste(Manifeste manifeste) {
        this.manifeste = manifeste;
    }

    public List<Conteneur> getConteneurs() {
        return conteneurs;
    }

    public void setConteneurs(List<Conteneur> conteneurs) {
        this.conteneurs = conteneurs;
    }
}
