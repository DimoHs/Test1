package com.company;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CourseInstance {

    private String name;
    private int priceBgn;
    private int startDate;
    private List<Teacher> teacher;
    private String studentsIds;
    private List<Student> students;

    public CourseInstance(String name, int priceBgn,Teacher teacher) {
        this.setName(name);
        this.setPriceBgn(priceBgn);
        this.teacher = new ArrayList<Teacher>();
        this.students = new ArrayList<Student>();

    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (Validator.CourseNames(name)) {
            throw new IllegalArgumentException("Error");
        }
        this.name = name;
    }
    public int getPriceBgn(){
        return this.priceBgn;
    }
    public void setPriceBgn(int priceBgn){
        this.priceBgn = priceBgn;
    }
    public void joinTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }
    public String getStudentsIds(){
        return this.studentsIds;
    }
    public void setStudentsIds(String studentsIds){
        this.studentsIds = studentsIds;
    }
    public void enroll(Student student) {
        this.students.add(student);
    }
    public String toString() {
        return this.getName() + ", " + this.getPriceBgn() + ", " + this.teacher;
    }


}
