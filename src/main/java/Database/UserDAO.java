package Database;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
 @Entity
public class UserDAO {

     @PersistenceContext
     EntityManager entityManager;


     public List findByEmail(String email) {
         Query query = entityManager.createNativeQuery("select * from users where email='" + email + "';", User.class);
     return query.getResultList();

 }
 @Transactional
    public void save(String email, String password, String lastName, String name) {
     User user = new User();
     user.setEmail(email);
     user.setPassword(password);
     user.setLastName(lastName);
     user.setName(name);

     entityManager.persist(user);
 }
}
