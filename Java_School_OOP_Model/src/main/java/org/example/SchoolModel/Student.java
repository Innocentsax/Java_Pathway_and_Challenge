package org.example.SchoolModel;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Course> courses = new ArrayList<>();
    private int grade;
    private int feesPaid;
    private int feesTotal;
    private int noOfStrikes = 0;



    public Student(int id, String name, int age, double wallet) {
        super(id, name, age, wallet);
    }


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getNoOfStrikes() {
        return noOfStrikes;
    }

    public void setNoOfStrikes(int noOfStrikes) {
        this.noOfStrikes = noOfStrikes;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                '}';
    }
}
