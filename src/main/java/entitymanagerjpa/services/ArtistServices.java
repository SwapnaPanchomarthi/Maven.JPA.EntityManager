package entitymanagerjpa.services;

import entitymanagerjpa.entities.ArtistTableEntity;

import javax.persistence.*;
import java.util.List;


public class ArtistServices {
        private EntityManager em;
        private EntityTransaction tx;


        public ArtistServices(EntityManager em)
        {
            this.em=em;
            this.tx=em.getTransaction();
        }

        public ArtistTableEntity createArtist(Integer id, String first_name, String lastName, String instrument){
           // tx.begin();
           // tx=em.getTransaction();

            ArtistTableEntity artist = new ArtistTableEntity();
            artist.setId(id);
            artist.setFirstName(first_name);
            artist.setLastName(lastName);
            artist.setInstrument(instrument);
            tx.begin();
            em.persist(artist);
            tx.commit();
            return artist;
        }


    public ArtistTableEntity createArtist(ArtistTableEntity artist){
        // tx.begin();
        // tx=em.getTransaction();

        tx.begin();
        em.persist(artist);
        tx.commit();
        return artist;
    }

        public ArtistTableEntity findId(Integer id)
        {
            ArtistTableEntity artistTableEntity= em.find(ArtistTableEntity.class, id);
            return artistTableEntity;
        }

        public ArtistTableEntity updateArtist(Integer id, String lastName)
        {
          ArtistTableEntity artistTableEntity=em.find(ArtistTableEntity.class, id);
          em.getTransaction().begin();
          artistTableEntity.setLastName(lastName);
          em.getTransaction().commit();
          return artistTableEntity;
        }

        public List<ArtistTableEntity> findall()
        {
            TypedQuery<ArtistTableEntity> query=em.createQuery("select a from artist_table a ", ArtistTableEntity.class);
            List<ArtistTableEntity> results=query.getResultList();
            System.out.println(results);
            return results;
        }

        public void removeArtist(Integer id)
        {
            ArtistTableEntity artistTableEntity=em.find(ArtistTableEntity.class, id);
            tx.begin();
            em.remove(artistTableEntity);
           // em.persist(artistTableEntity);
            tx.commit();

        }

    }


