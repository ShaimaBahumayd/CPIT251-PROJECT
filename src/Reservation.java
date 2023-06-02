
public class Reservation {

    int resID = (int) (1000 + Math.round(0) * 200);
    Attraction attr[][];
    Hotel hotel[][][];
    Resturant rest[][];
    int hotelNUM, attraNUM, restNUM;
    int cityNum;
    int service, numOfRoomType;
    String city[];
    Tourist user;

    public Reservation(Attraction[][] attr, int attraNUM, int service, String[] city, Tourist user) {
        this.attr = attr;
        this.attraNUM = attraNUM;
        this.service = service;
        this.city = city;
        this.user=user;
    }

    public Reservation(Hotel[][][] hotel, int hotelNUM, int cityNum, int service, int numOfRoomType, Tourist user) {
        this.hotel = hotel;
        this.hotelNUM = hotelNUM;
        this.cityNum = cityNum;
        this.service = service;
        this.numOfRoomType = numOfRoomType;
        this.user=user;
    }

    public Reservation(Resturant[][] rest, int restNUM, int cityNum, int service, String[] city, Tourist user) {
        this.rest = rest;
        this.restNUM = restNUM;
        this.cityNum = cityNum;
        this.service = service;
        this.city = city;
        this.user=user;
    }

    public void toStringHotel() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---RESERVATION");
        System.out.println("\n Reservation ID: "+resID);
        System.out.println("Reserve Name: "+user.tNFame+" "+user.tNLame);
        System.out.println("Hotel: " + hotel[cityNum][hotelNUM][numOfRoomType].hotelName);
        System.out.println("Location: " + hotel[cityNum][hotelNUM][numOfRoomType].address);
        System.out.println("Checkin day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkin);
        System.out.println("Checkout day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkout);
        System.out.println("Number of days :" + hotel[cityNum][hotelNUM][numOfRoomType].numberOfDays(hotel[cityNum][hotelNUM][numOfRoomType].checkout, hotel[cityNum][hotelNUM][numOfRoomType].checkin));
        System.out.println("price (per day) : " + hotel[cityNum][hotelNUM][numOfRoomType].price + " SR (includes tax 15%)");
        System.out.println("Total price :" + hotel[cityNum][hotelNUM][numOfRoomType].totalPrice() + " SR (includes tax 15%)");
        System.out.println("-------------------------------------------------------");

    }

    public void toStringAttraction() {
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------RESERVATION---------------------");
        System.out.println("\n Reservation ID: "+resID);
        System.out.println("Reserve Name: "+user.tNFame+" "+user.tNLame);
        System.out.println("City: " + city[cityNum]);
        System.out.println("Location: " + attr[cityNum][attraNUM].location);
        System.out.println("Attraction Name:" + attr[cityNum][attraNUM].attrName);
        System.out.println("Date: " + attr[cityNum][attraNUM].now);
        System.out.println("Number of Ticket: " + attr[cityNum][attraNUM].numOfTickrt);
        System.out.println("Price per Ticket: " + attr[cityNum][attraNUM].ticketPrice + " SR (includes tax 15%)");
        System.out.println("Total price: " + attr[cityNum][attraNUM].total() + " SR (includes tax 15%)");
        System.out.println("-------------------------------------------------------");

    }

    public void toStringResturant() {

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------RESERVATION---------------------");
        System.out.println("\n Reservation ID: "+resID);
        System.out.println("Reserve Name: "+user.tNFame+" "+user.tNLame);
        System.out.println("City: " + city[cityNum]);
        System.out.println("Location: " + rest[cityNum][restNUM].location);
        System.out.println("Attraction Name:" + rest[cityNum][restNUM].restName);
        System.out.println("Date: " + rest[cityNum][restNUM].now);
        System.out.println("-------------------------------------------------------");
    }

  /*  public void allResrvation() {
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------RESERVATION---------------------");
        System.out.println("\nCity: " + city[cityNum]);
        System.out.println("***>Hotels");
        System.out.println("\n Hotel: " + hotel[cityNum][hotelNUM][numOfRoomType].hotelName + "   Location: " + rest[cityNum][restNUM].location);
        System.out.println("Checkin day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkin + "  Checkout day :" + hotel[cityNum][hotelNUM][numOfRoomType].checkout);
        System.out.println("Total price :" + hotel[cityNum][hotelNUM][numOfRoomType].totalPrice() + " SR (includes tax 15%)");
        System.out.println("\n***>Attraction ");
        System.out.println("\nAttraction Name:" + attr[cityNum][attraNUM].attrName);
        System.out.println("Date: " + attr[cityNum][attraNUM].now);
        System.out.println("Attraction Name:" + rest[cityNum][restNUM].restName);
        System.out.println("Date: " + rest[cityNum][restNUM].now);
        System.out.println("Total price: " + attr[cityNum][attraNUM].total() + " SR (includes tax 15%)");
        System.out.println("\n***>Resturant ");
        System.out.println("Attraction Name:" + rest[cityNum][restNUM].restName);
        System.out.println("Location: " + rest[cityNum][restNUM].location + "   Date: " + rest[cityNum][restNUM].now);
        System.out.println("-------------------------------------------------------");
        System.out.println("Total price: "+(hotel[cityNum][hotelNUM][numOfRoomType].totalPrice()+attr[cityNum][attraNUM].total()));

    }*/

}

    
     
     
      

     

