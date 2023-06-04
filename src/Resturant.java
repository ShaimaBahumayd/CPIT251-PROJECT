import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import  java.util.Random;
public class Resturant {

    int userSelectDate;

    
    String restName;
    String location;
    String rate;
    int numberOfPeople;
    String type;
    int [] date = {15,16,17,18,19,20};
    
    DateTimeFormatter attrDate = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
    LocalDateTime now = LocalDateTime.now();
    Random rd = new Random();
    public Resturant(String restName, String location, String rate, String type) {
        this.restName = restName;
        this.location = location;
        this.rate = rate;
        this.type = type;
    }

    public Resturant(int userSelectDate, String restName, String location, String rate, String type) {
        this.userSelectDate = userSelectDate;
        this.restName = restName;
        this.location = location;
        this.rate = rate;
        this.type = type;
    }
    
    

    public int getUserSelectDate() {
        return userSelectDate;
    }

    public void setUserSelectDate(int userSelectDate) {
        this.userSelectDate = userSelectDate;
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
  
    
    public void availableDate(){
        System.out.println("         AVAILABLE DATES");
        System.out.println("-----------------------------------");
        for (int i = 0; i < date.length; i++) {
            //int n=1+(int)(Math.random()*27);
            System.out.println(date[i]+" JUN 2023");
            //date[i]=n;
          }
        System.out.println("-----------------------------------");
        System.out.print(">>Enter date : ");
    
    
    }
    
    public boolean cheackDate(){
        for (int i = 0; i < date.length; i++) {
            if(userSelectDate==date[i])
                return true;
        }
        return false;
    }
    
////

}
