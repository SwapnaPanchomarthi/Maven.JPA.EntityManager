package services;

import entities.CdTableEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CDServices {
    EntityManager em=null;
    EntityTransaction et = null;

    public CDServices(){
        this.em=em;
        this.et=em.getTransaction();

    }

    public CDServices(EntityManager em){
        this.em=em;
        this.et=em.getTransaction();

    }



    public CdTableEntity createCD(Integer id, String title, String description, Integer year, String artist, Double price)
    {
        CdTableEntity cdtable = new CdTableEntity();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //create record
        entities.CdTableEntity cd_table = new entities.CdTableEntity();
        cd_table.setId(id);
        cd_table.setArtist(artist);
        cd_table.setDescription(description);
        cd_table.setYear(year);
        cd_table.setPrice(price);
        cd_table.setTitle(title);

        em.persist(cd_table);
        tx.commit();

        return cdtable;
    }


    public CdTableEntity findID(Integer id)
    {
       // EntityTransaction tx = em.getTransaction();
        et.begin();

        CdTableEntity cdtable1 = em.find(CdTableEntity.class, id);
        return cdtable1;

    }
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityTransaction getEt() {
        return et;
    }

    public void setEt(EntityTransaction et) {
        this.et = et;
    }


}
