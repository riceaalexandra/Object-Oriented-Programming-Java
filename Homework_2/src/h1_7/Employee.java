package h1_7;

public class Employee extends Person {
    Company company;

    public Employee(String name, Address address, Company company) {
        super(name, address);
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company=" + company.getName() +
                ", name='" + name +
                ", address=" + address +
                '}';
    }
}
