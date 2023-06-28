package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36", "B12",
                "B6", "G53", "G49", "G60", "g64",
                "G50", "I23", "I17", "I29", "071"
        );
        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number ->{
//            if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
//                //System.out.println(number);
//            }
//        });
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));
//
//        someBingoNumbers.stream()
//                .map(String::toUpperCase)// or so can be represented as .map(s->s.toUpperCase())
//                .filter(s -> s.startsWith("G"))
//              .sorted().forEach(System.out::println);

//        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "071");
//        Stream<String> inNumberStream = Stream.of("N40", "N36", "I17", "I26", "I29", "071");
//        Stream<String> concatStream = Stream.concat(ioNumberStream, ioNumberStream);
//        System.out.println("---------------");
//        System.out.println(concatStream.distinct().peek(System.out::println).count());

        Employee john = new Employee("John", 30);
        Employee Jane = new Employee("Jane", 25);
        Employee Emma = new Employee("Emma", 45);
        Employee Snow = new Employee("Snow", 23);
        Employee Kelvin = new Employee("Kelvin", 70);

        //List<Employee> Employee = null;
        Department hr = new Department("Human Resources");
        hr.addEmployee(Emma);
        hr.addEmployee(Jane);
        hr.addEmployee(Kelvin);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("----------------");
//        List<String> sortedGNumber = someBingoNumbers.stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G")).sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumber = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G")).sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumber){
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupedByAge = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        departments.stream().flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s ->{
                    System.out.println();
                    return s.length() == 3;
                }).toList();
    }
}