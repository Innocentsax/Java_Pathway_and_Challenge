package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //private static int MAX_NUMBER_OF_STUDENTS = 100;
    //private static Student[] students = new Student[MAX_NUMBER_OF_STUDENTS];
    //private static int studentNumber = 0;
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        boolean shouldRun = true;
        while (shouldRun){
            System.out.println("Enter a command (Add, Search, Sort, View, exit): ");
            String command = input.nextLine();

            switch (command) {
                case "add" -> addStudent(input);
                case "search" -> searchStudents(input);
                case "sort" -> sortStudent(input);
                case "view" -> viewStudent(input);
                case "exit" -> shouldRun = false;
                default -> {
                }
            }
        }
    }

    private static void addStudent(Scanner input){
//        if (studentNumber == MAX_NUMBER_OF_STUDENTS){
//            System.out.println("Maximum number of student reached");
//        }
        System.out.println("Enter the Student name: ");
        String name = input.nextLine();

        System.out.println("Enter the Student ID: ");
        int ID = input.nextInt();
        input.nextLine();

        System.out.println("Enter the Student email: ");
        String email = input.nextLine();
        while(!isValidEmail(email)){
            System.out.println("Wrong student email!!! Try again: ");
            email = input.nextLine();
        }
        System.out.println("Enter the student GPA: ");
        double GPA = input.nextDouble();
        input.nextLine();

        System.out.println("Enter the Student age: ");
        int age = input.nextInt();

        Student newStudent = new Student(name, email, ID, age, GPA);
        students.add(newStudent);
//        studentNumber++;

        System.out.println("Student added successfully");

    }

    private static boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    private static void searchStudents(Scanner input){
        System.out.println("Enter the student name: ");
        String name = input.nextLine();

        for(Student student : students){
            if (student.getName().equals(name)){
                System.out.println((students));
            }
        }
    }
    private static void sortStudent(Scanner input){
        System.out.println("Enter a field to sort by (name, ID, email, or GPA: ");
        String field = input.nextLine();
        Collections.sort(students, new StudentComparator(field));

        for (Student student : students){
            System.out.println(students);
        }

    }
    private static void viewStudent(Scanner input){
        for (Student student : students){
            System.out.println(students);
        }
    }

}