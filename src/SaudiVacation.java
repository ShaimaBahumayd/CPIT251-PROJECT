
import java.util.Scanner;

public class SaudiVacation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(">> Enter First Name :");
        String fn = input.next();
        System.out.print(">> Enter Last Name :");
        String ln = input.next();
        System.out.print(">> Enter Email :");
        String email = input.next();
        System.out.print(">> Enter Phone Number  :");
        String phone = input.next();
        Tourist user = new Tourist(fn, ln, email, phone);
        System.out.println("-----------------------------------------------------");

        String city[] = {"Jeddah", "Alula", "Riyadh"};// to select city to vist
        Hotel hotel = new Hotel();
        hotel.ADDhotel();
        Attraction attr[][] = new Attraction[city.length][];
        Resturant rest[][] = new Resturant[city.length][3];
        attr[0] = new Attraction[3];
        attr[1] = new Attraction[4];
        attr[2] = new Attraction[2];
      //  Reservation [] userAllRese= new Reservation[5];
        Reservation userAllRese = new Reservation();
        
        

        
        AddAttraction(attr);
        ADDResturant(rest);
        //User chose city 
        cityMenu();
        int cityNum;//number of city the user chose
        String cityName = input.next().toUpperCase();

        if (checkCityName(cityName).equals("JEDDAH")||checkCityName(cityName).equals("RIYADH")||checkCityName(cityName).equals("ALULA")) {
            if (cityName.equals("JEDDAH")) {
                cityNum = 0;
            } else if (cityName.equals("ALULA")) {
                cityNum = 1;
            } else {
                cityNum = 2;
            }

            String toComplete, otherService = "ok";
            int hotelNUM, attraNUM, restNUM, service, numOfRoomType, numberOfservices = 0;
            boolean serviceLoop = true;

         // while (serviceLoop) {
              for (int i = 0; i < 10 && serviceLoop; i++) {
                  
              
                ServiceMenu(city, cityNum);//User select the service like : hotels,event and restaurent
                service = input.nextInt() - 1;// user chose

                if (service == 0) {
                    System.out.print(">>Enter number of people: ");
                    int numOFPeople = input.nextInt();

                    AllHotels(hotel.getH(), cityNum, city);
                    hotel.userChoose = input.nextInt() - 1;
                    if (hotel.checkHotel()) {
                        hotelSe(hotel.getH(), hotel.userChoose, cityNum);
                        toComplete = input.next().toUpperCase();
                        selectRoom(hotel.getH(), hotel.userChoose, cityNum);
                        numOfRoomType = input.nextInt() - 1;
                        System.out.print("Enter checkin day: ");
                        hotel.getH()[cityNum][hotel.userChoose][numOfRoomType].checkin = input.nextInt();
                        System.out.print("Enter checkout day: ");
                        hotel.getH()[cityNum][hotel.userChoose][numOfRoomType].checkout = input.nextInt();  
                        Reservation s1 = new Reservation(hotel.getH(), hotel.userChoose, cityNum, service, numOfRoomType, user);
                        userAllRese.reser.add(s1);
                        //userAllRese.reser.add(hotel.getH(), hotel.userChoose, cityNum, service, numOfRoomType, user);// = new Reservation(hotel.getH(), hotel.userChoose, cityNum, service, numOfRoomType, user);
                        System.out.println(userAllRese.reser.get(i).toStringHotel());
                        
                        System.out.print("DO YOU WANT TO VIWE/BOOK OTHER SERVICES(YES/NO) ?");
                        otherService = input.next();

                        if ("NO".equals(otherService) || "no".equals(otherService)) {
                            System.out.println("THANKS YOU TO USING SAUDI VACATION APP!");
                            serviceLoop = false;

                        }
                        if ("YES".equals(otherService) || "yse".equals(otherService)) {
                            serviceLoop = true;

                        }
                    }

                } else if (service == 1) {
                    displayCityAttraction(cityNum, attr, city);
                    System.out.print(">>Enter number of Attraction :");
                    attraNUM = input.nextInt() - 1;
                    System.out.print(">>Enter number of ticket : ");
                    attr[cityNum][attraNUM].setNumOfTickrt(input.nextInt());
                    Reservation s1 = new Reservation(attr, attraNUM, service, city, user);
                    userAllRese.reser.add(s1);

                    System.out.println( userAllRese.reser.get(i).toStringAttraction());
                    
                    System.out.print("DO YOU WANT TO VIWE/BOOK OTHER SERVICES(YES/NO) ?");
                    otherService = input.next().toLowerCase();
                    if ("NO".equals(otherService) || "no".equals(otherService)) {
                        System.out.println("THANKS YOU TO USING SAUDI VACATION APP!");
                        serviceLoop = false;

                    }
                    if ("YES".equals(otherService) || "yse".equals(otherService)) {
                        serviceLoop = true;

                    }

                } else if (service == 2) {
                    displayCityResturant(cityNum, rest, city);
                    System.out.print(">>Enter number of Resturant :");
                    restNUM = input.nextInt() - 1;
                    System.out.print(">>Enter number of People : ");
                    rest[cityNum][restNUM].numberOfPeople = input.nextInt();
                    rest[cityNum][restNUM].availableDate();
                    rest[cityNum][restNUM].setUserSelectDate(input.nextInt());
                    if (rest[cityNum][restNUM].cheackDate()) {
                         Reservation s1  = new Reservation(rest, restNUM, cityNum, service, city, user);
                         userAllRese.reser.add(s1);
                        System.out.println(userAllRese.reser.get(i).toStringResturant());
                        System.out.print("DO YOU WANT TO VIWE/BOOK OTHER SERVICES(YES/NO) ?");
                        otherService = input.next().toLowerCase();
                        if ("NO".equals(otherService) || "no".equals(otherService)) {
                            System.out.println("THANKS YOU TO USING SAUDI VACATION APP!");
                            serviceLoop = false;

                        }
                        if ("YES".equals(otherService) || "yse".equals(otherService)) {
                            serviceLoop = true;

                        }
                                
                    }

                } else {
                    System.out.println("WRONG NUMBER TRY AGAIN !");
                    break;
                }
                //

                //---------------------------
            }

        }
    }

    public static void cityMenu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---SELECT YOUR DISTNATION");
        System.out.println("-------------------------------------------------------");
        System.out.println("1- JEDDAH");
        System.out.println("2- ALULA");
        System.out.println("3- RIYADH");
        System.out.println("-------------------------------------------------------");
        System.out.print("-Enter name of distnation >>");
    }

    public static void ServiceMenu(String city[], int cityNum) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---WELCOME TO " + city[cityNum]);
        System.out.println("-------------------------------------------------------");
        System.out.println("1- HOTELS");
        System.out.println("2- EVENTS");
        System.out.println("3- RESTAURANTS");
        System.out.println("-------------------------------------------------------");
        System.out.print("-Enter number of service >>");
    }

    public static void AllHotels(Hotel hotel[][][], int cityNum, String city[]) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---" + city[cityNum].toUpperCase() + " HOTEL");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "- " + hotel[cityNum][i][0].hotelName);
            if (i != (i - 1)) {
                System.out.println("**********");
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("-Enter number of Hotel >>");
    }

    public static void ADDResturant(Resturant rest[][]) {
        //jaddah
        rest[0][0] = new Resturant("MYAZU", "Albasateen mall", "4.3", "Japanese");
        rest[0][1] = new Resturant("Beit Ward", "Atelier La Vie", "3.9", "Lebanese");
        rest[0][2] = new Resturant("San Carlo Cicchetti", "Albasateen mall", "3.8", "Italian");
        //ALULA
        rest[1][0] = new Resturant("OKTO ", "King abdulaziz park", "4.3", "Japanese");
        rest[1][1] = new Resturant("Maraya social", "aluthaib", "4.2", "Fine Dining");
        rest[1][2] = new Resturant("MYAZU", "SAY8556", "4.7", "Japanese");
        //Riyadh
        rest[2][0] = new Resturant("OKTO ", "King abdulaziz park", "4.3", "Japanese");
        rest[2][1] = new Resturant("Maraya social", "aluthaib", "4.2", "Fine Dining");
        rest[2][2] = new Resturant("MYAZU", "SAY8556", "4.7", "Japanese");

    }

    public static void AddAttraction(Attraction attr[][]) {
        //jeddah

        attr[0][0] = new Attraction("City Walk", "SA28886", 55, "A recreational zone for the whole family, various activities some of which are for the first time in Jeddah and the whole world, its shops and restaurants are diverse that satisfy all tastes.");
        attr[0][1] = new Attraction("Full Day Jeddah Tour", "SA27786", 180, "This is your best opportunity to enjoy Jeddah \"the Bride of the Red Sea\" in a one of kind full-day trip.");
        attr[0][2] = new Attraction("Jeddah Pier", "SA29686", 75, "The largest amusement park on the Red Sea coast in Jeddah, with more than 40 games and a variety of activities and events.");

        //ALULA
        attr[1][0] = new Attraction("STARGAZING AT GHARAMEEL", "SA59675", 350, "Far from city lights, vast open spaces in remote desert lands create some of the world’s most enviable dark skies, making AlUla an idyllic locale for star watching.");
        attr[1][1] = new Attraction("ALULA ZIPLINE EXPERIENCE", "SA55575", 180, "Operated by: The Warrior Group Experience the Kingdom’s most thrilling zipline, racing a total of 1.5km at up to 120 km/h speed while enjoying the incredible scenery of the AlUla mountains.");
        attr[1][2] = new Attraction("TOP OF AL HARRAT", "SA59555", 216, "A short but challenging hike to the top of Madakhel with stunning views as far as the eye can see.");
        attr[1][3] = new Attraction("HELICOPTER TOUR", "SA59215", 750, "Take to the skies to experience the breath-taking views of stunning desert vistas and iconic landmarks such as Elephant Rock and the World UNESCO site, Hegra.");

        //Riyadh
        attr[2][0] = new Attraction("Boulevard Riyadh City", "SA85296", 0, "Boulevard Riyadh City will to take you beyond your imagination, there is always something exciting for everyone!");
        attr[2][1] = new Attraction("Via Riyadh", "SA85556", 50, " Salmani-style designed area, in a harmony with the"
                + "Riyadh’s local culture. It has one of the most popular"
                + "five-star hotels, The St. Regis Riyadh, as well as seven"
                + "luxurious cinema halls and several restaurants, cafes,"
                + "and boutiques for the first time in KSA.");

    }

    public static void hotelSe(Hotel hotel[][][], int hotelNUM, int cityNum) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---" + hotel[cityNum][hotelNUM][1].hotelName.toUpperCase() + " HOTEL");
        System.out.println("-------------------------------------------------------");
        System.out.println("Location: " + hotel[cityNum][hotelNUM][0].address + "\n");
        System.out.println("Rate :" + hotel[cityNum][hotelNUM][0].rate + "/5" + "\n");
        System.out.println("Price: " + hotel[cityNum][hotelNUM][0].price + " (per day + include tax)" + "\n");
        System.out.println("About Hotel :\n " + hotel[cityNum][hotelNUM][0].description);
        System.out.println("-------------------------------------------------------");
        System.out.print(">>Do you want to complete reservation (yes/no)? ");

    }

    public static void selectRoom(Hotel hotel[][][], int hotelNUM, int cityNum) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---SELECT ROOM TYPE");
        System.out.println("N | Type    |Price");
        System.out.println("--------------------");
        System.out.println("1 | Single  |" + hotel[cityNum][hotelNUM][0].price + " SR (includes tax 15%)");
        System.out.println("2 | Double  |" + hotel[cityNum][hotelNUM][1].price + " SR (includes tax 15%)");
        System.out.println("3 | Suite   |" + hotel[cityNum][hotelNUM][2].price + " SR (includes tax 15%)");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>number of room type? ");

    }

    public static void displayCityAttraction(int cityNum, Attraction attr[][], String city[]) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---" + city[cityNum].toUpperCase() + " ATTRACTION");
        System.out.println("-------------------------------------------------------");

        for (int j = 0; j < attr[cityNum].length; j++) {
            System.out.println("|> Attraction Num: " + (j + 1));
            System.out.println("|> Attraction Name: " + attr[cityNum][j].attrName);
            System.out.println("|> Attraction Price: " + attr[cityNum][j].ticketPrice + " SR(includes tax 15%)");
            System.out.println("|> Attraction Date: " + attr[cityNum][j].now);
            System.out.println("|> Attraction Location: " + attr[cityNum][j].location);
            System.out.println("|> Attraction Attraction: " + attr[cityNum][j].attracDescription);
            System.out.println("***************************");
        }
    }

    public static void displayCityResturant(int cityNum, Resturant rest[][], String city[]) {
        System.out.println("-------------------------------------------------------");
        System.out.println("---" + city[cityNum].toUpperCase() + " RESTURANT");
        System.out.println("-------------------------------------------------------");

        //  System.out.println("-------------------------------------------------------------------------------------------------");
        for (int j = 0; j < rest[cityNum].length; j++) {
            System.out.println("|> Resturant Num: " + (j + 1));
            System.out.println("|> Resturant Name: " + rest[cityNum][j].restName);
            System.out.println("|> Attraction Date: " + rest[cityNum][j].now);
            System.out.println("|> Attraction Location: " + rest[cityNum][j].location);
            System.out.println("|> Resturant Type: " + rest[cityNum][j].type);
            System.out.println("***************************");
        }
    }

    public static String checkCityName(String name) {
        if (name.equals("JEDDAH") || name.equals("ALULA") || name.equals("RIYADH")) {
            return name;
        } else {
            return "WRONG NAME ";
        }
    }

    public static boolean checkHotel(int hotelNum) {
        if (hotelNum == 0 || hotelNum == 1 || hotelNum == 2) {
            return true;
        } else {
            System.out.println("WRONG SELECTION !!\nENTER AGAIN");
        }
        return false;

    }

}
