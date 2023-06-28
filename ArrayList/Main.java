package org.example.ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        GroceryItem[] groceryArray = new GroceryItem[3];
//        groceryArray[0] = new GroceryItem("Milk");
//        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
//        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);
//
//        System.out.println(Arrays.toString(groceryArray));
//
//        // Premitive ArrayList
//        ArrayList objectList = new ArrayList();
//        objectList.add(new GroceryItem("Butter"));
//        objectList.add("Yogurt");
//
//        System.out.println("------------------");
//
//        ArrayList<GroceryItem> groceryList = new ArrayList<>();
//        groceryList.add(new GroceryItem("Butter"));
//        groceryList.add(new GroceryItem("milk"));
//        groceryList.add(new GroceryItem("Orange", "PRODUCE", 5));
//        groceryList.set(1,
//                new GroceryItem("apple", "PRODUCE",6));
//        System.out.println(groceryList);

        // LinkedList
        //LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("US");
        placeToVisit.add(0,"Australia");
        System.out.println(placeToVisit);

        placeToVisit.addLast("Russia");
        placeToVisit.addFirst("UK");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);

//        removeElement(placeToVisit);
//        System.out.println(placeToVisit);

        gettingElements(placeToVisit);
        //System.out.println(placeToVisit);

//        printItinerary2(placeToVisit);
        testIterator(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Isreal");
        list.addLast("Poland");

        // Queue Methods
        list.offer("Melbourne");
        list.offerFirst("Spain");
        list.offerLast("Croatia");

        // Stack methods
        list.push("Dubai");
    }

    private static void removeElement(LinkedList<String> list){
        list.remove(4);
        list.remove("Poland");

        System.out.println(list);
        String s1 = list.remove(); // remove first element
        System.out.println(s1 + " was removed.");

        String s2 = list.removeFirst(); // Remove first element
        System.out.println(s2 + " was removed.");

        String s3 = list.removeLast(); //Remove Last element
        System.out.println(s3 + " was removed.");


        // Queue /Deque poll methods
        System.out.println(list);
        String p1 = list.poll(); // remove first element
        System.out.println(p1 + " was removed.");

        String p2 = list.pollFirst(); // Remove first element
        System.out.println(p2 + " was removed.");

        String p3 = list.pollLast(); //Remove Last element
        System.out.println(p3 + " was removed.");

        // Stack Methods
        String p4 = list.pop();
        System.out.println(p4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list){
        // RETRIEVING METHOD
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("Retrieved First Element = " + list.getFirst());
        System.out.println("Retrieved Last Element = " + list.getLast());

        // INDEX OF AN ELEMENT IN A LINKEDLIST
        System.out.println("Russia is at position: " + list.indexOf("Russia"));
        System.out.println("Spain is at position " + list.indexOf("Spain"));

        // Queue retrieval method
        System.out.println("Element from element() method = " + list.element());

        // Stack retrieval methods
        System.out.println("Element from peek() method = " + list.peek());
        System.out.println("Element from peekFirst() method = " + list.peekFirst());
        System.out.println("Element from peekLast() method = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Spain")){
                iterator.add("South Africa");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }

}
