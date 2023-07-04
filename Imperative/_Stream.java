package org.example.Imperative;

import java.util.List;
import java.util.function.Predicate;

import static org.example.Imperative._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Personal> people = List.of(
                new Personal("Paul", MALE),
                new Personal("Daniel", FEMALE),
                new Personal("Philip", MALE),
                new Personal("Bassey", FEMALE),
                new Personal("Innocent", MALE),
                new Personal("Charles", BINARY)
        );

        // Mapping according to name or age
//        people.stream().map(persons -> persons.name).collect(Collectors.toSet()).forEach(System.out::println);
//
//        // Checking the length with streams
//        people.stream().map(persons -> persons.name).mapToInt(String::length).forEach(System.out::println);

        Predicate<Personal> personPredicate = personal -> MALE.equals(personal.gender);

        boolean containsOnlyFemales = people.stream().noneMatch(personPredicate);
        System.out.println(containsOnlyFemales);
    }

    static class Personal {
        private final String name;
        final Gender gender;

        public Personal(String name, Gender gender) {
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

    enum Gender {MALE, FEMALE, BINARY}
}
