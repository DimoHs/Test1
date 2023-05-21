package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Georgi","Ivanov",25,"");
        Student student1 = new Student("Atanas","Petrov",19,"","988981236");

        CourseInstance courseInstance1 = new CourseInstance("Programing with Java",800,teacher1);
        courseInstance1.enroll(student1);
        System.out.println("Test");



        System.out.print(courseInstance1);





    }
}
