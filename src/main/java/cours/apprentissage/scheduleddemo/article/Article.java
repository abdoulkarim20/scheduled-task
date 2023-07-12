package cours.apprentissage.scheduleddemo.article;

import cours.apprentissage.scheduleddemo.conteneur.Conteneur;
import cours.apprentissage.scheduleddemo.manifeste.Manifeste;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String connaissement;
    private Date dateEmbarquement;
    private String lieuEmbarquement;
    private String paysDestination;
    private String villeDestination;
    private String expediteur;
    private String nomDestinataire;
    private String nomVoieDestinataire;
    private String villeDestinataire;
    private String aOrdre;
    @Column(columnDefinition = "LONGTEXT", length = 1000)
    private String marchandise;
    private String paysProvenance;
    private String destinationDefinitive;
    private String poids;
    private String nombreColis;
    private String marqueColis;
    private String modeConditionnement;
    private String nombreConteneur;
    @ManyToOne
    private Manifeste manifeste;
    @OneToMany(mappedBy = "article")
    private List<Conteneur> conteneurs = new ArrayList<>();

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

    public Date getDateEmbarquement() {
        return dateEmbarquement;
    }

    public void setDateEmbarquement(Date dateEmbarquement) {
        this.dateEmbarquement = dateEmbarquement;
    }

    public String getLieuEmbarquement() {
        return lieuEmbarquement;
    }

    public void setLieuEmbarquement(String lieuEmbarquement) {
        this.lieuEmbarquement = lieuEmbarquement;
    }

    public String getPaysDestination() {
        return paysDestination;
    }

    public void setPaysDestination(String paysDestination) {
        this.paysDestination = paysDestination;
    }

    public String getVilleDestination() {
        return villeDestination;
    }

    public void setVilleDestination(String villeDestination) {
        this.villeDestination = villeDestination;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

    public String getNomVoieDestinataire() {
        return nomVoieDestinataire;
    }

    public void setNomVoieDestinataire(String nomVoieDestinataire) {
        this.nomVoieDestinataire = nomVoieDestinataire;
    }

    public String getVilleDestinataire() {
        return villeDestinataire;
    }

    public void setVilleDestinataire(String villeDestinataire) {
        this.villeDestinataire = villeDestinataire;
    }

    public String getaOrdre() {
        return aOrdre;
    }

    public void setaOrdre(String aOrdre) {
        this.aOrdre = aOrdre;
    }

    public String getMarchandise() {
        return marchandise;
    }

    public void setMarchandise(String marchandise) {
        this.marchandise = marchandise;
    }

    public String getPaysProvenance() {
        return paysProvenance;
    }

    public void setPaysProvenance(String paysProvenance) {
        this.paysProvenance = paysProvenance;
    }

    public String getDestinationDefinitive() {
        return destinationDefinitive;
    }

    public void setDestinationDefinitive(String destinationDefinitive) {
        this.destinationDefinitive = destinationDefinitive;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getNombreColis() {
        return nombreColis;
    }

    public void setNombreColis(String nombreColis) {
        this.nombreColis = nombreColis;
    }

    public String getMarqueColis() {
        return marqueColis;
    }

    public void setMarqueColis(String marqueColis) {
        this.marqueColis = marqueColis;
    }

    public String getModeConditionnement() {
        return modeConditionnement;
    }

    public void setModeConditionnement(String modeConditionnement) {
        this.modeConditionnement = modeConditionnement;
    }

    public String getNombreConteneur() {
        return nombreConteneur;
    }

    public void setNombreConteneur(String nombreConteneur) {
        this.nombreConteneur = nombreConteneur;
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
