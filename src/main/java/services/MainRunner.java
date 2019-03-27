package services;


import entities.CdTableEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainRunner {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        CdTableEntity cdtable1 = em.find(CdTableEntity.class, 1);
        System.out.println(cdtable1.toString());

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