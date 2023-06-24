package org.example;

public class Student {
    private String name;
    private String email;
    private int ID;
    private int age;
    private double GPA;

    public Student(String name, String email,
                   int ID, int age, double GPA) {
        this.name = name;
        this.email = email;
        this.ID = ID;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return GPA;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", ID=" + ID +
//                ", age=" + age +
//                ", GPA=" + GPA +
//                '}';
//    }
    public String toString() {
        return "Name: " + name + "\nID: " + ID + "\nEmail: " + email + "\nGPA: " + GPA + "\n";
    }
}
