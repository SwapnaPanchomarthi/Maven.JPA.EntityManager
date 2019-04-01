package entitymanagerjpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cd_table", schema = "Music")
public class CdTableEntity {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column
    private String artist;
    @Basic
    @Column
    private String description;
    @Basic
    @Column
    private Double price;
    @Basic
    @Column
    private String title;
    @Basic
    @Column
    private Integer year;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = ArtistTableEntity.class)
    @JoinTable(name = "artist_cd",
            joinColumns = @JoinColumn(name = "cd_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id"))
    public Set<ArtistTableEntity> artistSet;

    @Override
    public String toString() {
        return "CdTableEntity{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CdTableEntity that = (CdTableEntity) o;

        if (id != that.id) return false;
        if (artist != null ? !artist.equals(that.artist) : that.artist != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    public void addArtist(ArtistTableEntity artist) {
        if (artistSet == null) {
            artistSet = new HashSet<ArtistTableEntity>();
        }
        artistSet.add(artist);
    }
}
