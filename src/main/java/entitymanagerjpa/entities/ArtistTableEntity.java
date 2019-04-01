package entitymanagerjpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artist_table", schema = "Music")
public class ArtistTableEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column
    private String firstName;
    @Basic
    @Column
    private String lastName;
    @Basic
    @Column
    private String instrument;

    @ManyToMany(mappedBy = "artistSet", cascade = CascadeType.ALL)
    public Set<CdTableEntity> cds= new HashSet<CdTableEntity>();

    @Override
    public String toString() {
        return "ArtistTableEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", instrument='" + instrument + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistTableEntity that = (ArtistTableEntity) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (instrument != null ? !instrument.equals(that.instrument) : that.instrument != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (instrument != null ? instrument.hashCode() : 0);
        return result;
    }

    public void addCD(CdTableEntity cd) {
        cds.add(cd);
    }
}
