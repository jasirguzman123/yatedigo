package com.example.yatedigo.data.model;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Customer {

    Customer cutomer;
    float debt;

    public Employee(String firstName, String lastName, String identification, String gender, String address, String phone, Customer customer, float debt) {
        super(firstName, lastName, identification, gender, address, phone);

        this.cutomer = customer;
        this.debt = debt;
    }

    public Customer getCutomer() {
        return cutomer;
    }

    public float getDebt() {
        return debt;
    }

    static public List<Employee> sampleEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            employees.add(sampleEmployee());
        }
        return employees;
    }

    /* static public Employee sampleEmployee() {
        Faker faker = new Faker();
        return new Employee(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.number().digits(10),
                "Masculino",
                faker.address().fullAddress(),
                faker.phoneNumber().cellPhone(),
                Customer.sampleCustomer(),
                faker.number().randomNumber()
        );
    } */
    static public Employee sampleEmployee() {
        return new Employee(
                "Alejandro",
                "Char",
                "3106011243",
                "Masculino",
                "Calle 12+1 #60-50",
                "31060123190",
                Customer.sampleCustomer(),
                31231
        );
    }
}
