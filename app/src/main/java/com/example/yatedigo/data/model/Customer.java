package com.example.yatedigo.data.model;

import com.github.javafaker.Faker;

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
        for (int i = 0; i < 10; i++) {
            customers.add(sampleCustomer());
        }
        return customers;
    }

    static public Customer sampleCustomer() {
        Faker faker = new Faker();
        return new Customer(faker.name().firstName(), faker.name().lastName(), faker.number().digits(10), "Masculino", faker.address().fullAddress(), faker.phoneNumber().cellPhone());
    }
}
