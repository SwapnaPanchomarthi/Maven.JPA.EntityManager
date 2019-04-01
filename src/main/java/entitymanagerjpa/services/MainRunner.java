package entitymanagerjpa.services;


import entitymanagerjpa.entities.ArtistTableEntity;
import entitymanagerjpa.entities.CdTableEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainRunner {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
        EntityManager em = emf.createEntityManager();
//        CdTableEntity cd_table2 = new CdTableEntity();

        CDServices cdServices = new CDServices(em);
        //Long id = System.currentTimeMillis();
//        cd.createCD(5,"New","New Collections", 2019, "Smith", 67.0);
//        cd.createCD(6,"Pop","Pop Collections", 2013, "Troop", 47.0);
//        CdTableEntity classicCd = cd.createCD(172,"Classic","Classic Collections", 2011, "Pups", 67.0);



        ArtistTableEntity artistTableEntity = new ArtistTableEntity();
        ArtistServices artistServices = new ArtistServices(em);
        //int id = (int) System.currentTimeMillis();
//        artistServices.createArtist(1, "Latha", "Panch", "Guitar");
//        artistServices.createArtist(2,"Swapna","Tela", "Piano");
//        artistServices.createArtist(3, "Gowri","Tela", "Trumpet");


        ArtistTableEntity artist = new ArtistTableEntity();
        artist.setId(1114);
        artist.setFirstName("aaaa");


        CdTableEntity cd = new CdTableEntity();
        cd.setId(14);
        cd.setArtist("a1");


        cd.addArtist(artist);
        cdServices.createCD(cd);

//        artist.addCD(cd);
//        artistServices.createArtist(artist);


//        CdTableEntity cdtable1 = em.find(CdTableEntity.class, 1);
//        System.out.println(cdtable1.toString());

        //update records
        /*cdtable1.setYear(2009);*/

        //create record
//
        //Remove record
        // em.remove(cdtable1);

        //Findall

//        TypedQuery<entities.cd_table> query = em.createQuery("select c from entities.cd_table c", entities.cd_table.class);
//        List<entities.cd_table> results = query.getResultList();
        // System.out.println(results.toString());
        //tx.commit();




    }
}