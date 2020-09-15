package Database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cumparator")
public class Cumparator {
    @Id
    private int cif;
    private String numeFurnizor;
    private String sediu;
    private String banca;
    private int iban;

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNumeFurnizor() {
        return numeFurnizor;
    }

    public void setNumeFurnizor(String numeFurnizor) {
        this.numeFurnizor = numeFurnizor;
    }

    public String getSediu() {
        return sediu;
    }

    public void setSediu(String sediu) {
        this.sediu = sediu;
    }


    public String getBanca() {
        return banca;
    }

    public void setBanca(String banca) {
        this.banca = banca;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }
}
