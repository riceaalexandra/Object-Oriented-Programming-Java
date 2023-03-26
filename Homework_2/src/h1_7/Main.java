package h1_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address addressEmployee1 = new Address("Raului", 123, "Craiova");
        Address addressEmployee2 = new Address("Pelendava", 456, "Bucuresti");
        Address addressEmployee3 = new Address("Soarelui", 123, "Craiova");
        Address addressEmployee4 = new Address("Calinescu", 456, "Bucuresti");
        Address addressCompany1 = new Address("Maren", 123, "Craiova");
        Address addressCompany2 = new Address("Poligonului", 456, "Bucuresti");
        Company company1 = new Company(addressCompany1, "Peom");
        Company company2 = new Company(addressCompany2, "Ceom");
        Employee employee1 = new Employee("Popescu Andrei", addressEmployee1, company1);
        Employee employee2 = new Employee("Mirciulea Mihaela", addressEmployee2, company1);
        Employee employee3 = new Employee("Catanescu Andrei", addressEmployee3, company2);
        Employee employee4 = new Employee("Sandulescu Andrei", addressEmployee4, company2);
        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company2.addEmployee(employee3);
        company2.addEmployee(employee4);
        //System.out.println(company1);
        ArrayList<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        company1.moveEmployee(employee1,company2);
        Address addressSearch = new Address("Maren", 123, "Craiova");
        for (Company company : companies) {
            if (company.getAddress().equals(addressSearch)) {
                System.out.println(company);
            }
        }
        System.out.println("The name of the company you are searching:");
        String nameSearch= "Peom";
        for (Company company : companies) {
            if (company.getName().equals(nameSearch)) {
                System.out.println(company);
            }
        }
    }
}
