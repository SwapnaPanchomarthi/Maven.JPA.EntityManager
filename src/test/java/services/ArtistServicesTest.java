package services;

import entities.CdTableEntity;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ArtistServicesTest {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Music");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();



}