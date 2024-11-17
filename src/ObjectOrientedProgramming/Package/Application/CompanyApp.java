package ObjectOrientedProgramming.Package.Application;

import ObjectOrientedProgramming.Package.Data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Saiful");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
