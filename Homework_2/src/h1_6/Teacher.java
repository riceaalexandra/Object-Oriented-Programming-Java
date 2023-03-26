package h1_6;

public class Teacher extends Person {
    private String specialization;

    public Teacher(String name, Address address, String specialization) {
        super(name, address);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return
                "specialization='" + specialization + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
