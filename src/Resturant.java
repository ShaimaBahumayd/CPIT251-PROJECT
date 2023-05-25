import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Resturant {

    String restName;
    String location;
    String rate;
    int numberOfPeople;
    String type;
    DateTimeFormatter attrDate = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
    LocalDateTime now = LocalDateTime.now();

    public Resturant(String restName, String location, String rate, String type) {
        this.restName = restName;
        this.location = location;
        this.rate = rate;
        this.type = type;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    

}
