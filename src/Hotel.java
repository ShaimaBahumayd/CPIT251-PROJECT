
public class Hotel {

    String hotelName;
    String roomType;
    String address;
    double price;
     String rate;
   
    String description;
    int checkin;
    int checkout;
    int numOfRoom;
    

    public Hotel(String hotelName, String address, double price,  String rate, int checkin, int checkout) {
        this.hotelName = hotelName;
        this.roomType = roomType;
        this.address = address;
        this.price = price;
        this.rate = rate;
        this.checkin = checkin;
        this.checkout = checkout;
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
    
    

}
