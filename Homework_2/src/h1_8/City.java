package h1_8;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Hotel> hotels;
    private ArrayList<Tourist> tourists;

    public City(String name) {
        hotels =new ArrayList<>();
        tourists=new ArrayList<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName()
              //  "hotels=" + hotels +
               // ", tourists=" + tourists
        ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
