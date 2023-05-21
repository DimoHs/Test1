package com.company;

import java.time.LocalDate;

public class Teacher extends Person {

    private int salaryBgn;
    private LocalDate hireDate;

    Teacher(String firstname,String lastname,int age,String email) {
        super(firstname,lastname,age,email);
    }

    public int getSalaryBgn() {
        return this.salaryBgn;
    }
    public void setSalaryBgn(int salaryBgn) {
        if (Validator.SalaryMinimumPay(salaryBgn)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.salaryBgn = salaryBgn;
    }
    public LocalDate getHireDate() {
        return this.hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public String toString() {
        return this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + ", " + this.getEmail() + ", " + getSalaryBgn() + ", " + getHireDate();
    }




}
