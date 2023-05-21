package com.company;

public class Person {

    private String firstName = "da";
    private String lastName;
    private int age;
    private String email;


    public Person(String firstName,String lastname, int age, String email) {
        this.setFirstName(firstName);
        this.setLastName(lastname);
        this.setAge(age);
        this.setEmail(email);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (Validator.TextLength(firstName) || Validator.NoSymbols(firstName)) {
            throw new IllegalArgumentException("Error");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (Validator.TextLength(lastName) || Validator.NoSymbols(lastName)) {
            throw new IllegalArgumentException("Error");
        }

        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (Validator.TeacherIsAdult(age)) {
            throw new IllegalArgumentException("Error");
        }
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        String Emailfull = this.firstName + this.lastName + "@gmail.com";
        this.email = Emailfull;
    }
}
