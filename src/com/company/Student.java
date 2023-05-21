package com.company;

public class Student extends Person {

    private int id;
    private String telephoneNumber;

    Student(String firstName,String lastname,int age,String email,String telephoneNumber) {
        super(firstName,lastname,age,email);
        this.setTelephoneNumber(telephoneNumber);

    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTelephoneNumber () {
        return this.telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        String phone = "359" + telephoneNumber;
        this.telephoneNumber = phone;
    }
    public String toString() {
        return this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " + this.getEmail() + ", " + this.getTelephoneNumber();
    }









}




