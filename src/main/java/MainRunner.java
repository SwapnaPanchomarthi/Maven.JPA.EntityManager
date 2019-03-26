import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("publishing");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        cd_table cdtable1 = em.find(cd_table.class, 3);

        //update records
        /*cdtable1.setYear(2009);*/


        //create record
//            cd_table cd_table2 = new cd_table();
//            cd_table2.setId(3);
//            cd_table2.setArtist("Lisa");
//            cd_table2.setDescription("Pop Singer");
//            cd_table2.setPrice(55.0);
//            cd_table2.setTitle("Popmusic");
//             em.persist(cd_table2);

                //Remove record
               // em.remove(cdtable1);

        //Findall

        TypedQuery<cd_table> query = em.createQuery("select c from cd_table c", cd_table.class);
        List<cd_table> results = query.getResultList();

        System.out.println(results.toString());
        //tx.commit();




    }
}
