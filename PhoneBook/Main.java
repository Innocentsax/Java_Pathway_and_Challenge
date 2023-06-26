package org.example.PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static ArrayList<Person> personPhoneBook = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean checker = true;

        while(checker){
            System.out.println("Enter a command (add, search, sort, view, exit): ");
            String command = scanner.nextLine();

            switch (command){
                case "add": addPerson(scanner);break;
                case "search": searchPerson(scanner);break;
                case "sort": sortPerson(scanner);break;
                case "view": viewPerson();break;
                case "exit": checker = false;break;
                default:
                    System.out.println(("Invalid command"));
                    break;
            }
        }
    }
    private static void addPerson(Scanner scanner){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        while(!isValidEmail(email)){
            System.out.println("Wrong email, try again: ");
            email = scanner.nextLine();
        }

        System.out.println("Enter your address: ");
        String address = scanner.nextLine();

        //scanner.nextLine();

        Person person = new Person(name, phoneNumber, email, address);
        personPhoneBook.add(person);

        System.out.println("Phone number successfully added");
    }

    private static boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    private static void searchPerson(Scanner scanner){
        System.out.println("Enter the persons name: ");
        String name = scanner.nextLine();
        for (Person persons : personPhoneBook){
            if(persons.getName().equals(name)){
                System.out.println(persons);
            }
        }
    }

    private static void viewPerson(){
        for(Person persons : personPhoneBook){
            System.out.println(persons);
        }
    }

    private static void sortPerson(Scanner scanner){
        System.out.println("Enter a field to sort by (name, phone number, email, or address");
        String field = scanner.nextLine();

        Collections.sort(personPhoneBook, new PersonComparator(field));
        for(Person persons : personPhoneBook){
            System.out.println(persons);
        }
    }
}
