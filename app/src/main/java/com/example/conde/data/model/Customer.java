package com.example.conde.data.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String firstName;
    String lastName;
    String identification;
    String gender;
    String address;
    String phone;

    public Customer(String firstName, String lastName, String identification, String gender, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    static public List<Customer> sampleCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            customers.add(sampleCustomer());
        }
        return customers;
    }

    /*static public Customer sampleCustomer() {
        Faker faker = new Faker();
        return new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().digits(10), "Masculino", faker.address().fullAddress(), faker.phoneNumber().cellPhone());
    }*/

    static public Customer sampleCustomer() {
        return new Customer(
                "Alejandro",
                "Char",
                "3106011243",
                "Masculino",
                "Calle 12+1 #60-50",
                "31060123190"
        );
    }
}
