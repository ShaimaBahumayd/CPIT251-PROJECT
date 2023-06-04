
public class Hotel {

    String hotelName;
    String roomType;
    String address;
    double price;
    String rate;
    Hotel [][][] hotel=new Hotel[3][3][3];
    String description;
    int checkin;
    int checkout;
    int userChoose;

   
    int numOfRoom;
     
    public Hotel[][][] getH() {
        return hotel;
    }

    public Hotel() {
    }
     

    public Hotel(String hotelName, String address, double price, String rate, String description,String roomType) {
        this.hotelName = hotelName;
         this.roomType = roomType;
        this.address = address;
        // this.reviwe = reviwe;
        this.price = price;
        this.rate = rate;
        this.description=description;

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public int numberOfDays(int checkout, int checkin) {
        int numberOfDays = checkout - checkin;
        return numberOfDays;
    }

    public double totalPrice() {
        double total = numberOfDays(checkout, checkin)*price;
        return total ; 
    }
    
    public void ADDhotel() {
        //JEDDAH
        hotel[0][0][0] = new Hotel("Hilton", "hh368", 2600, "5", "This upscale hotel is located across the road from Jeddah's waterfront, 3 km from the Red Sea Mall and 14 km from King Abdulaziz International Airport.", "single room");
        hotel[0][1][0] = new Hotel("Sheraton Jeddah", "hs789", 1500, "3.6", "This elegant hotel is located 5 km from Jeddah Waterfront, 6 km from the Floating Mosque and 7 km from the Globe Roundabout.", "single room");
        hotel[0][2][0] = new Hotel("Hyatt Park Jeddah Hotel", "hp356", 1500, "4.5", "A busy neighborhood with walking paths by the sea, promenades in the Central Corniche promenade, and restaurants overlooking King Fahd's Fountain", "single room");
        hotel[0][0][1] = new Hotel("Hilton", "hh368", 3600, "5", "This upscale hotel is located across the road from Jeddah's waterfront, 3 km from the Red Sea Mall and 14 km from King Abdulaziz International Airport.", "double  room");
        hotel[0][1][1] = new Hotel("Sheraton Jeddah", "hs789", 2200, "3.6", "This elegant hotel is located 5 km from Jeddah Waterfront, 6 km from the Floating Mosque and 7 km from the Globe Roundabout.", "double  room");
        hotel[0][2][1] = new Hotel("Hyatt Park Jeddah Hotel", "hp356", 2500, "4.5", "A busy neighborhood with walking paths by the sea, promenades in the Central Corniche promenade, and restaurants overlooking King Fahd's Fountain", "double  room");
        hotel[0][0][2] = new Hotel("Hilton", "hh368", 5000, "5", "This upscale hotel is located across the road from Jeddah's waterfront, 3 km from the Red Sea Mall and 14 km from King Abdulaziz International Airport.", "suite");
        hotel[0][1][2] = new Hotel("Sheraton Jeddah", "hs789", 2600, "3.6", "This elegant hotel is located 5 km from Jeddah Waterfront, 6 km from the Floating Mosque and 7 km from the Globe Roundabout.", "suite");
        hotel[0][2][2] = new Hotel("Hyatt Park Jeddah Hotel", "hp356", 3800, "4.5", "A busy neighborhood with walking paths by the sea, promenades in the Central Corniche promenade, and restaurants overlooking King Fahd's Fountain", "suite");
        //ALULA
        hotel[1][0][0] = new Hotel("HABITAS", "SW749", 1700, "5", "Habitas brings luxury living to AlUla in an eco-friendly way, Large Infinity Swimming Pool!Desert X Art Installations,Thuraya Wellness Center,Tama Restaurant & Ashar Deck ,Desert Arts Club", "Single");
        hotel[1][1][0] = new Hotel("SHADEN RESORT", "CF347", 1250, "4.5", "Shaden Resort offers a wide choice of lodgings,free Wi-Fi,swimming pool ", "single");
        hotel[1][2][0] = new Hotel("Cloud7", "VB247", 150, "5", "L-shaped pool, which is large enough for a swim and with plenty of poolside space to unwind including a shaded communal dining area", "single");
        hotel[1][0][1] = new Hotel("HABITAS", "SW749", 2850, "5", "Habitas brings luxury living to AlUla in an eco-friendly way, Large Infinity Swimming Pool!Desert X Art Installations,Thuraya Wellness Center,Tama Restaurant & Ashar Deck ,Desert Arts Club", "double");
        hotel[1][1][1] = new Hotel("SHADEN RESORT", "CF347", 1950, "4.5", "Shaden Resort offers a wide choice of lodgings,free Wi-Fi,swimming pool ", "double");
        hotel[1][2][1] = new Hotel("Cloud7", "VB247", 750, "5", "L-shaped pool, which is large enough for a swim and with plenty of poolside space to unwind including a shaded communal dining area", "double");
        hotel[1][0][2] = new Hotel("HABITAS", "SW749", 3000, "5", "Habitas brings luxury living to AlUla in an eco-friendly way, Large Infinity Swimming Pool!Desert X Art Installations,Thuraya Wellness Center,Tama Restaurant & Ashar Deck ,Desert Arts Club", "suite");
        hotel[1][1][2] = new Hotel("SHADEN RESORT", "CF347", 2250, "4.5", "Shaden Resort offers a wide choice of lodgings,free Wi-Fi,swimming pool ", "suite");
        hotel[1][2][2] = new Hotel("Cloud7", "VB247", 750, "5", "L-shaped pool, which is large enough for a swim and with plenty of poolside space to unwind including a shaded communal dining area", "suite");
        //Riyadh
        hotel[2][0][0] = new Hotel("voco", "AB123", 1500, "4.5", "this new 5-star hotel features a year-round outdoor pool with views of the city", "0");
        hotel[2][1][0] = new Hotel("Radison", "AC123", 2000, "5", "Group is one of the world's largest hotel groups with nine distinctive hotel brands, and more than 1,400 hotels ", "0");
        hotel[2][2][0] = new Hotel("interContental", "AD123", 2100, "3", "Next to Al-Faisaliah Tower with a wonderful view", "0");

        hotel[2][0][1] = new Hotel("voco", "AB123", 2000, "4.5", "this new 5-star hotel features a year-round outdoor pool with views of the city ", "1");
        hotel[2][1][1] = new Hotel("Radison", "AC123", 2500, "5", "Group is one of the world's largest hotel groups with nine distinctive hotel brands, and more than 1,400 hotels ", "1");
        hotel[2][2][1] = new Hotel("interContental", "AD123", 2600, "3", "Next to Al-Faisaliah Tower with a wonderful view", "1");

        hotel[2][0][2] = new Hotel("voco", "AB123", 4000, "4.5", " this new 5-star hotel features a year-round outdoor pool with views of the city", "2");
        hotel[2][1][2] = new Hotel("Radison", "AC123", 4500, "5", "Group is one of the world's largest hotel groups with nine distinctive hotel brands, and more than 1,400 hotels ", "2");
        hotel[2][2][2] = new Hotel("interContental", "AD123", 4600, "3", "Next to Al-Faisaliah Tower with a wonderful view", "2");

    }
    
    public  boolean checkHotel(int hotelNum) {
        if (hotelNum == 0 || hotelNum == 1 || hotelNum == 2) {
            return true;
        } else {
            System.out.println("WRONG SELECTION !!\nENTER AGAIN");
        }
        return false;

    }

}
