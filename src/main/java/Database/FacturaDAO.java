package Database;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Entity
public class FacturaDAO {

    @PersistenceContext
    EntityManager entityManager;


    public List<Factura> findByNrFactura(int Nrfactura) {
        Query query = entityManager.createNativeQuery("select * from users where NrFactura='" + Nrfactura + "';", Factura.class);
        return query.getResultList();

    }
    @Transactional
    public void save(String Furnizor, String Cumparator) {
        Factura Factura = new Factura();
        entityManager.persist(Factura);
    }
    }