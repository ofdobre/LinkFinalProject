package Database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cheltuieli")
public class Cheltuieli {
    private double salarii;
    private double chirie;
    private double facturi;
    private double combustibil;
    private double produseDeConsum;
    private double alteCheltuieli;

    public double getSalarii() {
        return salarii;
    }

    public void setSalarii(double salarii) {
        this.salarii = salarii;
    }

    public double getChirie() {
        return chirie;
    }

    public void setChirie(double chirie) {
        this.chirie = chirie;
    }

    public double getFacturi() {
        return facturi;
    }

    public void setFacturi(double facturi) {
        this.facturi = facturi;
    }

    public double getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(double combustibil) {
        this.combustibil = combustibil;
    }

    public double getProduseDeConsum() {
        return produseDeConsum;
    }

    public void setProduseDeConsum(double produseDeConsum) {
        this.produseDeConsum = produseDeConsum;
    }

    public double getAlteCheltuieli() {
        return alteCheltuieli;
    }

    public void setAlteCheltuieli(double alteCheltuieli) {
        this.alteCheltuieli = alteCheltuieli;
    }
}