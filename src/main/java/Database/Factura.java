package Database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
  @Id
    public int NrFactura;
    private Cumparator cumparator;
    private Furnizor furnizor;

}
