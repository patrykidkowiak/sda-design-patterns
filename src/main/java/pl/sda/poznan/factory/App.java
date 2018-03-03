package pl.sda.poznan.factory;

import pl.sda.poznan.factory.model.Company;
import pl.sda.poznan.factory.model.Employee;
import pl.sda.poznan.factory.writer.CompanyWriter;
import pl.sda.poznan.factory.writer.TxtCompanyWriter;
import pl.sda.poznan.factory.writer.XmlCompanyWriter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Employee dyrektor = new Employee("Jan", "Nowak","nowak@gmail.com",10000);
        Employee kierownik= new Employee("Jan", "Andrzejewski","andrzejewski@gmail.com",8000);

        Company company=new Company();
        company.addEmppployee(dyrektor);
        company.addEmppployee(kierownik);

        Scanner scanner = new Scanner(System.in);
        System.out.print("File name: ");
        String filename = scanner.next();

        CompanyWriterFactory companyWriter = new CompanyWriterFactory();
        try {
            CompanyWriter writer = companyWriter.create(filename);
            writer.write(company);
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
