import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cd_table {
    @Id
    private Integer  id;
    private String  title;
    private String description;
    private Integer year;
    private String artist;
    private Double price;

    public cd_table()
    {

    }

    public cd_table(Integer id, String title, String description, Integer year, String artist, Double price){
        this.id=id;
        this.title=title;
        this.description=description;
        this.year=year;
        this.artist=artist;
        this.price=price;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cd_table{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
}
