package org.example.Imperative;

import java.util.ArrayList;
import java.util.List;

enum Gender {MALE, FEMALE}

public class Main {
    public static void main(String[] args) {
        List<Persons> people = List.of(
                new Persons("Paul", Gender.MALE),
                new Persons("Daniel", Gender.FEMALE),
                new Persons("Philip", Gender.MALE),
                new Persons("Bassey", Gender.FEMALE),
                new Persons("Innocent", Gender.MALE)
        );

        System.out.println("Imperative Approach");
        // Imperative Approach
        List<Persons> females = new ArrayList<>();
        for(Persons persons : people){
            if(Gender.FEMALE.equals(persons.gender)){
                females.add(persons);
            }
        }

        for (Persons female : females){
            System.out.println(female);
        }
        System.out.println("-".repeat(50));

        List<Persons> males = new ArrayList<>();
        for (Persons male : people){
            if(Gender.MALE.equals(male.gender)){
                males.add(male);
                System.out.println(male);
            }
        }


        // DECLARATIVE APPROACH
        System.out.println("-".repeat(50));
        System.out.println("DECLARATIVE APPROACH");
        people.stream().filter(persons -> Gender.FEMALE.equals(persons.gender)).toList().forEach(System.out::println);

    }
}
class Persons {
    private final String name;
    final Gender gender;

    public Persons(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
