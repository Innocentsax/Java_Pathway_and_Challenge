package org.example.SchoolModel;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    private List<Course> courses = new ArrayList<>();
    private School school;

    public Teacher(int id, String name, int age, double wallet) {
        super(id, name, age, wallet);
        this.school = school;

    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "} " + super.toString();
    }

    public String getName() {
        return "";
    }
}
