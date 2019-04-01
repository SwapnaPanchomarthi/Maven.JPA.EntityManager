package entitymanagerjpa.services;

import entitymanagerjpa.entities.ArtistTableEntity;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ArtistServicesTest {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

   @Test
    public void createArtistTest() {

       ArtistTableEntity artistTableEntity = new ArtistTableEntity();
       ArtistServices artistServices = new ArtistServices(em);
       int id = (int) System.currentTimeMillis();
       artistServices.createArtist(id, "Latha", "Panch", "Guitar");
       em.persist(artistTableEntity);
   }
   @Test
        public void findIdTest()

        {
            ArtistServices artistServices=new ArtistServices(em);
            System.out.println( artistServices.findId(2));
        }
    @Test
    public void updateTest()
    {
        ArtistTableEntity artistTableEntity=new ArtistTableEntity();
        ArtistServices artistServices=new ArtistServices(em);
        artistServices.updateArtist(2,"Telaprolu");
        em.persist(artistTableEntity);
    }

    @Test
    public void findAllTest()
    {
     ArtistServices artistServices = new ArtistServices(em);
     artistServices.findall();
    }

    @Test
    public void removeTest()
    {
        ArtistServices artistServices= new ArtistServices(em);
        artistServices.removeArtist(-1043883606);
    }
}