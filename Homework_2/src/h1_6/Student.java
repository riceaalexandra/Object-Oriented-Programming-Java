package h1_6;

public class Student extends Person {
    private int year;
    private String faculty;
    public Student(String name, Address address, int year, String faculty) {
        super(name,address);
        this.year = year;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return
                "year=" + year +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
