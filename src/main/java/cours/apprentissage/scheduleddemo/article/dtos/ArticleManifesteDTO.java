package cours.apprentissage.scheduleddemo.article.dtos;

import cours.apprentissage.scheduleddemo.conteneur.dtos.ConteneurArticleDTO;
import cours.apprentissage.scheduleddemo.manifeste.dtos.ManifesteDTO;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleManifesteDTO {
    private Long art;
    private Long prec1;
    private Long prec2;
    private Date dateEmbarquement;
    private String lieuEmbarquement;
    private String paysDestination;
    private String villeDestination;
    private String connaissement;
    private String expediteur;
    private String destinataire;
    private String voieDestinataire;
    private String ordre;
    @Column(columnDefinition = "LONGTEXT", length = 1000)
    private String marchandise;
    private String poids;
    private String nombreColis;
    private String marque;
    private String modeConditionnement;
    private ManifesteDTO manifeste;
    List<ConteneurArticleDTO>conteneurs=new ArrayList<>();

    public Long getArt() {
        return art;
    }

    public void setArt(Long art) {
        this.art = art;
    }

    public Long getPrec1() {
        return prec1;
    }

    public void setPrec1(Long prec1) {
        this.prec1 = prec1;
    }

    public Long getPrec2() {
        return prec2;
    }

    public void setPrec2(Long prec2) {
        this.prec2 = prec2;
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

    public String getConnaissement() {
        return connaissement;
    }

    public void setConnaissement(String connaissement) {
        this.connaissement = connaissement;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getVoieDestinataire() {
        return voieDestinataire;
    }

    public void setVoieDestinataire(String voieDestinataire) {
        this.voieDestinataire = voieDestinataire;
    }

    public String getOrdre() {
        return ordre;
    }

    public void setOrdre(String ordre) {
        this.ordre = ordre;
    }

    public String getMarchandise() {
        return marchandise;
    }

    public void setMarchandise(String marchandise) {
        this.marchandise = marchandise;
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

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModeConditionnement() {
        return modeConditionnement;
    }

    public void setModeConditionnement(String modeConditionnement) {
        this.modeConditionnement = modeConditionnement;
    }

    public ManifesteDTO getManifeste() {
        return manifeste;
    }

    public void setManifeste(ManifesteDTO manifeste) {
        this.manifeste = manifeste;
    }

    public List<ConteneurArticleDTO> getConteneurs() {
        return conteneurs;
    }

    public void setConteneurs(List<ConteneurArticleDTO> conteneurs) {
        this.conteneurs = conteneurs;
    }
}
