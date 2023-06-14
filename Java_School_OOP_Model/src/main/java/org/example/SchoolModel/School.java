package org.example.SchoolModel;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> student = new ArrayList<>();
    private final List<Applicant> applicants;
    private Principal principal;
    private double wallet;

    public School(String name, Principal principal) {
        this.name = name;
        this.teachers = teachers;
        this.student = student;
        this.principal = principal;
        this.wallet = wallet;
        this.applicants = new ArrayList<>();

    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudent() {
        return student;
    }

    public String addStudent(Student student) {
        return student.getName();
    }


    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", student=" + student +
                '}';
    }
}
