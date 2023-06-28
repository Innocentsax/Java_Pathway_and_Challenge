package org.example.ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Use LinkedList functionality, to create a list of places, ordered by distance from the point.
 * Use a ListIterator to move, both backwards and forward, through this ordered itinerary of place
 *
 * First, Create a type that has a town or place name, and a field for storing the distance from the start.
 * Next, create an itinerary of places or towns to visit, much like we've been doing in tha last
 *
 * Instead of strings, you will want to create a Linked list of your place or town type,
 * showing their distances from Sydney....
 *
 * Menu:
 * Available actions (Select work or Letter)
 * (F)orward
 * (B)ackward
 * (L)ist Places
 * (M)enu
 * (Q)uit
 */
record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LinkedList_Challenge {

    public static void main(String[] args) {
        LinkedList<Place> placeToVisit = new LinkedList<>();


        Place adelaide = new Place("Adelaide", 1374);
        //addPlace(placeToVisit, adelaide);
        //addPlace(placeToVisit, new Place("adelaide", 1374));
        addPlace(placeToVisit, new Place("Brisbane", 917));
        addPlace(placeToVisit, new Place("perth", 3923));
        //addPlace(placeToVisit, new Place("AliceSprings", 2771));
        addPlace(placeToVisit, new Place("Darwin", 3972));
        //addPlace(placeToVisit, new Place("Melbourne", 877));
        System.out.println(placeToVisit);

        var iterator = placeToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){
                        forward = true;     //Reversing Direction
                        if(iterator.hasNext()){
                            iterator.next();  // Adjust position forward
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(!forward){
                        forward = false;     //Reversing Direction
                        if(iterator.hasPrevious()){
                            iterator.previous();  // Adjust position forward
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M": printMenu(); break;
                case "L":
                    System.out.println(placeToVisit); break;
                default: quitLoop = true; break;
            }
        }
    }
    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for(var listPlace : list){
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
            }
            matchedIndex++;
        }
        list.add(place);
    }
    private static void printMenu(){
        System.out.println("""
                  Available actions (Select work or Letter)
                  (F)orward
                  (B)ackward
                  (L)ist Places
                  (M)enu
                  (Q)uit""");
    }
}
