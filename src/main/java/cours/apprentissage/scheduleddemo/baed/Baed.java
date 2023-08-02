package cours.apprentissage.scheduleddemo.baed;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "baed")
public class Baed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateBaed;
    private String numeroDeclaration;
    private String connaissement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateBaed() {
        return dateBaed;
    }

    public void setDateBaed(Date dateBaed) {
        this.dateBaed = dateBaed;
    }

    public String getNumeroDeclaration() {
        return numeroDeclaration;
    }

    public void setNumeroDeclaration(String numeroDeclaration) {
        this.numeroDeclaration = numeroDeclaration;
    }

    public String getConnaissement() {
        return connaissement;
    }

    public void setConnaissement(String connaissement) {
        this.connaissement = connaissement;
    }
}
