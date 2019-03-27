package services;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CDServicesTest {

        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
        private EntityManager em = emf.createEntityManager();
        private EntityTransaction tx = em.getTransaction();


        @Test
        public void findIDTest()
        {
            // tx.begin();
            CDServices cd =  new CDServices(em);
            System.out.println(cd.findID(1));

        }

        @Test
        public void createCDTest()
        {
            tx.begin();
            entities.CdTableEntity cd_table2 = new entities.CdTableEntity();
            CDServices cd = new CDServices(em);
            cd.createCD(9,"New","New Collections", 2019, "Smith", 67.0);
            em.persist(cd_table2);
            tx.commit();
        }

        @Test
        public void updateCDTest()
        {
            tx.begin();

            entities.CdTableEntity cd_table2 = new entities.CdTableEntity();
            CDServices cd =  new CDServices(em);
            cd.findID(3);
            cd_table2.setYear(2009);
            em.persist(cd_table2);
            tx.commit();

        }

    }

