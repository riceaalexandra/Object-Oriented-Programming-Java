package h1_8;

public class Tourist extends Person{
    private Hotel hotel;
    private City city;

    public Tourist(String name, Address address, Hotel hotel, City city) {
        super(name, address);
        this.hotel = hotel;
        this.city = city;
    }

    public void moveHotel(Hotel newHotel){
        this.hotel.checkOut(this);
        newHotel.checkIn(this);
        this.hotel = newHotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "hotel=" + hotel.getName() +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
