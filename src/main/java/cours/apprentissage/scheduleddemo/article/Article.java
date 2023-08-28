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
    private Long art;
    private Long prec1;
    private Long prec2;
    private Date date_emb;
    private String lieu_emb;
    private String pays_dest;
    private String ville_dest;
    private String connaissement;
    private String expediteur;
    private String destinataire;
    private String voie_dest;
    private String ordre;
    @Column(columnDefinition = "LONGTEXT", length = 2000)
    private String marchandise;
    private String poids;
    private String nbre_colis;
    @Column(columnDefinition = "LONGTEXT", length = 2000)
    private String marque;
    private String mode_cond;
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

    public Date getDate_emb() {
        return date_emb;
    }

    public void setDate_emb(Date date_emb) {
        this.date_emb = date_emb;
    }

    public String getLieu_emb() {
        return lieu_emb;
    }

    public void setLieu_emb(String lieu_emb) {
        this.lieu_emb = lieu_emb;
    }

    public String getPays_dest() {
        return pays_dest;
    }

    public void setPays_dest(String pays_dest) {
        this.pays_dest = pays_dest;
    }

    public String getVille_dest() {
        return ville_dest;
    }

    public void setVille_dest(String ville_dest) {
        this.ville_dest = ville_dest;
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

    public String getVoie_dest() {
        return voie_dest;
    }

    public void setVoie_dest(String voie_dest) {
        this.voie_dest = voie_dest;
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

    public String getNbre_colis() {
        return nbre_colis;
    }

    public void setNbre_colis(String nbre_colis) {
        this.nbre_colis = nbre_colis;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMode_cond() {
        return mode_cond;
    }

    public void setMode_cond(String mode_cond) {
        this.mode_cond = mode_cond;
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
