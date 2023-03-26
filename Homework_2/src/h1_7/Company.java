package h1_7;
import java.util.ArrayList;

public class Company {
    private String name;
    private Address address;
    private ArrayList<Employee> employees;


    public Company(Address address, String name) {
        employees = new ArrayList();
        this.address = address;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public void moveEmployee(Employee employee, Company newCompany) {
        this.employees.remove(employee);
        newCompany.addEmployee(employee);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name +
                ", address=" + address +
                ", employees=" + employees +
                '}';
    }
}
