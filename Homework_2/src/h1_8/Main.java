package h1_8;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        City city1= new City("Craiova");
        City city2= new City("Bucuresti");
        Address addressTourist1 = new Address("Raului", 123, city1);
        Address addressTourist2 = new Address("Pelendava", 456,city1);
        Address addressTourist3 = new Address("Soarelui", 123, city1);
        Address addressTourist4 = new Address("Calinescu", 456,city1);
        Address addressHotel1 = new Address("Maren", 123,city2);
        Address addressHotel2 = new Address("Poligonului", 456,city1);
        Hotel hotel1= new Hotel("Cas",addressHotel1);
        Hotel hotel2=new Hotel("Perla",addressHotel2);
        Tourist tourist1 = new Tourist("Popescu Andrei", addressTourist1, hotel1,city1);
        Tourist tourist2 = new Tourist("Mirciulea Mihaela", addressTourist2, hotel2, city2);
        Tourist tourist3 = new Tourist("Catanescu Andrei", addressTourist3, hotel1,city2);
        Tourist tourist4 = new Tourist("Sandulescu Andrei", addressTourist4, hotel2,city1);
        hotel1.checkIn(tourist1);
        hotel2.checkIn(tourist2);
        hotel1.checkIn(tourist3);
        hotel2.checkIn(tourist4);
        tourist1.moveHotel(hotel2);
        tourist2.changeAddress("Fulger", 456, city2);
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        for(Hotel hotel:hotels){
            if(hotel.getAddress().getCity().getName().equals("Craiova")){
                System.out.println(hotel);
            }
        }
    }
}
