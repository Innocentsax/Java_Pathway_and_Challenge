package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Innocent", "Innocent@decagon.ng", 9);
        System.out.println(student);

        PrimarySchoolStudent collin = new PrimarySchoolStudent("inno", "innocent@gmail.com",0,"jss2");
        System.out.println(collin);
    }
}

class Student{

    private String name;
    private String email;
    private int phone_number;

    public Student(){}

    public Student(String name, String email, int phone_number) {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }
    public int addingValues(int a, int b){
        return a+b;
    }

    public int addingValues(int a, int b, int c){
        return a+b+c;
    }
    public int addingValues(int a, int b, int d, int y){
        return a+b+d+y;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is dupe";
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", phone_number=" + phone_number +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String studentClass;

    PrimarySchoolStudent(String name, String email, int phone_number, String studentClass){
        super(name, email,phone_number);
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return studentClass + " is ur class " + super.toString();
    }
}