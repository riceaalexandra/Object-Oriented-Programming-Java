package h1_8;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private Address address;
    private ArrayList<Tourist> tourists;

    public Hotel(String name, Address address) {
        tourists = new ArrayList();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Tourist> getOccupants() {
        return tourists;
    }

    public void setOccupants(ArrayList<Tourist> tourists) {
        this.tourists = tourists;
    }

    public void checkIn(Tourist tourist) {
        tourists.add(tourist);
    }

    public void checkOut(Tourist tourist) {
        tourists.remove(tourist);
    }
    public boolean isOccupiedBy(Tourist tourist) {
        return tourists.contains(tourist);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", tourists=" + tourists +
                '}';
    }
}
