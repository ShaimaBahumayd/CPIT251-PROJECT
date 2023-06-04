
import java.util.ArrayList;

public class Reservation {

    ArrayList<Reservation> reser = new ArrayList<Reservation>();

    int resID = (int) (1000 + Math.round(0) * 200);
    Attraction attr[][];
    Hotel hotel[][][];
    Resturant rest[][];
    int hotelNUM, attraNUM, restNUM;
    int cityNum;
    int service, numOfRoomType;
    String city[];
    Tourist user;

    public Reservation() {
    }

    public Reservation(Attraction[][] attr, int attraNUM, int service, String[] city, Tourist user) {
        this.attr = attr;
        this.attraNUM = attraNUM;
        this.service = service;
        this.city = city;
        this.user = user;
    }

    public Reservation(Hotel[][][] hotel, int hotelNUM, int cityNum, int service, int numOfRoomType, Tourist user) {
        this.hotel = hotel;
        this.hotelNUM = hotelNUM;
        this.cityNum = cityNum;
        this.service = service;
        this.numOfRoomType = numOfRoomType;
        this.user = user;
    }

    public Reservation(Resturant[][] rest, int restNUM, int cityNum, int service, String[] city, Tourist user) {
        this.rest = rest;
        this.restNUM = restNUM;
        this.cityNum = cityNum;
        this.service = service;
        this.city = city;
        this.user = user;
    }

    public String toStringHotel() {
      
        return "-------------------------------------------------------"
                + "\n---RESERVATION"
                + "\n Reservation ID: " + resID
                + "\nReserve Name: " + user.tNFame + " " + user.tNLame
                + "\nHotel: " + hotel[cityNum][hotelNUM][numOfRoomType].hotelName
                + "\nLocation: " + hotel[cityNum][hotelNUM][numOfRoomType].address
                + "\nCheckin day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkin
                + "\nCheckout day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkout
                + "\nNumber of days :" + hotel[cityNum][hotelNUM][numOfRoomType].numberOfDays(hotel[cityNum][hotelNUM][numOfRoomType].checkout, hotel[cityNum][hotelNUM][numOfRoomType].checkin)
                + "\nprice (per day) : " + hotel[cityNum][hotelNUM][numOfRoomType].price + " SR (includes tax 15%)"
                + "\nTotal price :" + hotel[cityNum][hotelNUM][numOfRoomType].totalPrice() + " SR (includes tax 15%)"
                + "\n-------------------------------------------------------";

    }

    public String toStringAttraction() {
        return "-------------------------------------------------------"
                + "\n-------------------RESERVATION---------------------"
                + "\n Reservation ID: " + resID
                + "\nReserve Name: " + user.tNFame + " " + user.tNLame
                + "\nCity: " + city[cityNum]
                + "\nLocation: " + attr[cityNum][attraNUM].location
                + "\nAttraction Name:" + attr[cityNum][attraNUM].attrName
                + "\nDate: " + attr[cityNum][attraNUM].now
                + "\nNumber of Ticket: " + attr[cityNum][attraNUM].numOfTickrt
                + "\nPrice per Ticket: " + attr[cityNum][attraNUM].ticketPrice + " SR (includes tax 15%)"
                + "\nTotal price: " + attr[cityNum][attraNUM].total() + " SR (includes tax 15%)"
                + "\n-------------------------------------------------------";

    }

    public String toStringResturant() {
 return "-------------------------------------------------------\n" + "-------------------RESERVATION---------------------\n" + "\n Reservation ID: " + resID + "\nReserve Name: " + user.tNFame + " " + user.tNLame + "\nCity: " + city[cityNum] + "\nLocation: " + rest[cityNum][restNUM].location + "\nResturant Name:" + rest[cityNum][restNUM].restName + "\nDate: " + rest[cityNum][restNUM].userSelectDate + " JUN 2023" + "\n-------------------------------------------------------";
    }

   }

   
