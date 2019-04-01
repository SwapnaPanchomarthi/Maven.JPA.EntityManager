package entitymanagerjpa.services;

import entitymanagerjpa.entities.CdTableEntity;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class CDServicesTest {

        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
        private EntityManager em = emf.createEntityManager();
        //private EntityTransaction tx = em.getTransaction();


        @Test
        public void findIDTest()
        {

            CDServices cd =  new CDServices(em);
            System.out.println(cd.findID(1));

        }

        @Test
        public void createCDTest()
        {
//            tx.begin();
            CdTableEntity cd_table2 = new CdTableEntity();
            CDServices cd = new CDServices(em);
            Long id = System.currentTimeMillis();
            cd.createCD(id.intValue(),"New","New Collections", 2019, "Smith", 67.0);
            em.persist(cd_table2);
//            tx.commit();
        }

        @Test
        public void updateCDTest()
        {
            CdTableEntity cd_table2 = new CdTableEntity();
            CDServices cd =  new CDServices(em);
            cd.updateCD(3, 2009);
            em.persist(cd_table2);

        }

        @Test
    public void findAllTest()
        {
            CDServices cd =  new CDServices(em);
          //  List<CdTableEntity> cdTableEntityList = new ArrayList<CdTableEntity>();
            cd.findAll();
        }
@Test
        public void removeTest()
        {
            CDServices cd = new CDServices(em);
            cd.removeCd(-1069021708);

        }
    }

