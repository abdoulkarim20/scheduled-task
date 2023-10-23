package cours.apprentissage.scheduleddemo.avarnav.dtos;

import java.time.LocalDateTime;

public class AvarnavPostDTO {
    private String ESCALE;
    private LocalDateTime DATE;
    private String NAVIRE;
    private String CONSIGNATAIRE;
    private String CARGAISON;
    private String MOUVEMENTS;
    private String PAVILLON;

    public String getESCALE() {
        return ESCALE;
    }

    public void setESCALE(String ESCALE) {
        this.ESCALE = ESCALE;
    }

    public LocalDateTime getDATE() {
        return DATE;
    }

    public void setDATE(LocalDateTime DATE) {
        this.DATE = DATE;
    }

    public String getNAVIRE() {
        return NAVIRE;
    }

    public void setNAVIRE(String NAVIRE) {
        this.NAVIRE = NAVIRE;
    }

    public String getCONSIGNATAIRE() {
        return CONSIGNATAIRE;
    }

    public void setCONSIGNATAIRE(String CONSIGNATAIRE) {
        this.CONSIGNATAIRE = CONSIGNATAIRE;
    }

    public String getCARGAISON() {
        return CARGAISON;
    }

    public void setCARGAISON(String CARGAISON) {
        this.CARGAISON = CARGAISON;
    }

    public String getMOUVEMENTS() {
        return MOUVEMENTS;
    }

    public void setMOUVEMENTS(String MOUVEMENTS) {
        this.MOUVEMENTS = MOUVEMENTS;
    }

    public String getPAVILLON() {
        return PAVILLON;
    }

    public void setPAVILLON(String PAVILLON) {
        this.PAVILLON = PAVILLON;
    }

    @Override
    public String toString() {
        return "AvarnavPostDTO{" +
                "ESCALE='" + ESCALE + '\'' +
                ", DATE=" + DATE +
                ", NAVIRE='" + NAVIRE + '\'' +
                ", CONSIGNATAIRE='" + CONSIGNATAIRE + '\'' +
                ", CARGAISON='" + CARGAISON + '\'' +
                ", MOUVEMENTS='" + MOUVEMENTS + '\'' +
                ", PAVILLON='" + PAVILLON + '\'' +
                '}';
    }
}
