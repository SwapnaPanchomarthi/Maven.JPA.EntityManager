import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class CDService {
    EntityManager em=null;
    EntityTransaction et = em.getTransaction();


    public cd_table createCD(Integer id, String title, String description, Integer year, String artist, Double price)
    {
        cd_table cdtable = new cd_table();
        cdtable.setTitle(title);
        cdtable.setYear(year);
        cdtable.setPrice(price);
        cdtable.setDescription(description);
        cdtable.setArtist(artist);
        et.begin();
        em.persist(cdtable);
        et.commit();
        return cdtable;
    }

    public cd_table createCD(cd_table cdtable)
    {
        et.begin();
        em.persist(cdtable);
        et.commit();
        return cdtable;
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



    public CDService(EntityManager em)
    {
      this.em=em;

    }
}

