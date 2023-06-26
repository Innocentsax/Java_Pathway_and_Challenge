package org.example.PhoneBook;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private String field;

    public PersonComparator(String field){
        this.field = field;
    }

    @Override
    public int compare(Person o1, Person o2) {
        switch (field){
            case "name": return o1.getName().compareTo(o2.getName());
            case "phone number": return Long.compare(o1.getPhoneNumber(), o2.getPhoneNumber());
            case "email": return o1.getEmail().compareTo(o2.getEmail());
            case "address": return o1.getAddress().compareTo(o2.getAddress());
            default: return 0;
        }
        //return 0;
    }
}
