package org.example;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private String field;

    public StudentComparator(String field) {
        this.field = field;
    }

    public int compare(Student o1, Student o2){
        switch(field) {
            case "name":
                return o1.getName().compareTo(o2.getName());
            case "ID":
                return Integer.compare(o1.getID(), o2.getID());
            case "GPA":
                return Double.compare(o1.getGPA(), o2.getGPA());
            case "email":
                return o1.getEmail().compareTo(o2.getEmail());
        }
        return 0;
    }
}
