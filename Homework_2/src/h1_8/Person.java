package h1_8;


public class Person {
    protected String name;
    protected Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void changeAddress(String street, int number, City city){
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setNumber(number);

    }
}
