package entities;

import javax.persistence.*;

@Entity
@Table(name = "cd_table", schema = "Music", catalog = "")
public class CdTableEntity {
    private int id;
    private String artist;
    private String description;
    private Double price;
    private String title;
    private Integer year;

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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "artist")
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "year")
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
}
