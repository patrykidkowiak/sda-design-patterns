package pl.sda.poznan.factory.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String surname;
    private String email;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String email, double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
