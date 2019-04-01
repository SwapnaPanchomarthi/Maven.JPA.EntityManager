package entitymanagerjpa.services;

import entitymanagerjpa.entities.ArtistTableEntity;
import entitymanagerjpa.entities.CdTableEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CDServices {
    //EntityManager em=null;
    //EntityTransaction et = null;
    EntityManager em;
    EntityTransaction tx;

    public CDServices(EntityManager em){
        this.em=em;
        this.tx=em.getTransaction();


    }


    public CdTableEntity createCD(Integer id, String title, String description, Integer year, String artist, Double price)
    {

        //create record
        CdTableEntity cdTableEntity = new CdTableEntity();
        cdTableEntity.setId(id);
        cdTableEntity.setArtist(artist);
        cdTableEntity.setDescription(description);
        cdTableEntity.setYear(year);
        cdTableEntity.setPrice(price);
        cdTableEntity.setTitle(title);
        tx.begin();
        em.persist(cdTableEntity);
        tx.commit();

        return cdTableEntity;
    }

    public CdTableEntity updateCD(Integer id,Integer year)
    {
        CdTableEntity cdtable = em.find(CdTableEntity.class, id);
        em.getTransaction().begin();
        cdtable.setYear(year);
        em.getTransaction().commit();
        return cdtable;
    }

    public CdTableEntity findID(Integer id)
    {
        CdTableEntity cdtable1 = em.find(CdTableEntity.class, id);
        return cdtable1;

    }

    public List<CdTableEntity> findAll(){
        TypedQuery<CdTableEntity> query = em.createQuery("select c from CdTableEntity c", CdTableEntity.class);
        List<CdTableEntity> results = query.getResultList();
        System.out.println(results.toString());
        return results;
    }

    public void removeCd(Integer id){
        tx.begin();
        CdTableEntity cdTableEntity=em.find(CdTableEntity.class, id);
        em.remove(cdTableEntity);
        em.getTransaction().commit();
    }
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityTransaction getEt() {
        return tx;
    }

    public void setEt(EntityTransaction et) {
        this.tx = et;
    }


    public void createCD(CdTableEntity cd) {
        tx.begin();
        em.persist(cd);
        tx.commit();

    }
}
