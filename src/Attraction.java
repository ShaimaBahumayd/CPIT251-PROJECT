
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Attraction {

    public Attraction(int numOfTickrt, double ticketPrice) {
        this.numOfTickrt = numOfTickrt;
        this.ticketPrice = ticketPrice;
    }

    
    

    DateTimeFormatter attrDate = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
    LocalDateTime now = LocalDateTime.now();
    int attrID = (int) (1000 + Math.round(0) * 200);
    String attrName;
    String location;
    int numOfTickrt;
    double ticketPrice;
    String attracDescription;
   

    public Attraction(String attrName, String location, double ticketPrice, String attracDescription) {

        this.attrName = attrName;
        this.location = location;
        this.ticketPrice = ticketPrice;
        this.attracDescription = attracDescription;
    }

    public DateTimeFormatter getAttrDate() {
        return attrDate;
    }

    public void setAttrDate(DateTimeFormatter attrDate) {
        this.attrDate = attrDate;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public int getAttrID() {
        return attrID;
    }

    public void setAttrID(int attrID) {
        this.attrID = attrID;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfTickrt() {
        return numOfTickrt;
    }

    public void setNumOfTickrt(int numOfTickrt) {
        this.numOfTickrt = numOfTickrt;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getAttracDescription() {
        return attracDescription;
    }

    public void setAttracDescription(String attracDescription) {
        this.attracDescription = attracDescription;
    }
    public double total(){
    return (ticketPrice*numOfTickrt)+((ticketPrice*numOfTickrt)*0.15);
    }
    

    
}
 