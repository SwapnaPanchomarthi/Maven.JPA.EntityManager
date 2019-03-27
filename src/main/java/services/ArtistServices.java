package services;

import entities.ArtistTableEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ArtistServices {

    public class ArtistService {
        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("publishing");
        private EntityManager em = emf.createEntityManager();
        private EntityTransaction tx = em.getTransaction();


        public ArtistService() {
        this.em = em;
        this.tx = em.getTransaction();
        }

        public ArtistTableEntity createArtist(String first_name, String lastName, String instrument){
            tx.begin();
            // Artist artist = new Artist();
            entities.ArtistTableEntity artist = new entities.ArtistTableEntity();

            //artist.setId(id);
            artist.setFirstName(first_name);
            artist.setLastName(lastName);
            artist.setInstrument(instrument);


            em.persist(artist);
            tx.commit();

            return artist;
        }

//        public static void main(String[] args) {
//
//            ArtistService artistService =  new ArtistService();
//            artistService.createArtist(1,"Swapna", "Latha", "Piano");
//        }
    }

}
