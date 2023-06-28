package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * The challenge is to create an interactive console program.
 * and give the user a menu of options as shown here:
 *  0 - to shut down
 *  1 - to add item(s) to list (comma delimited list)
 *  2 - to remove any items (comma delimited list)
 *  ENTER A NUMBER FOR WHICH ACTION YOU WANT TO DO
 *
 *  Using a Scanner class, solicit a menu item, 0, 1 or 2, and process the item accordingly
 *  Your grocery list should be an ArrayList
 *  You should use methods on the ArrayList to add items, remove items, check if an item is already in the list, sorted
 *  alphabetically, after each operation.
 *  You shouldn't allow duplicate in the list
 */
public class ArrayListChallenge {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag){
            printAction();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.printf("%s\n", groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [Separate items by comma: ");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for (String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }

        }
    }
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [Separate items by comma: ");
        String[]  remover = scanner.nextLine().split(",");
        for (String m : remover){
            String trimmed = m.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printAction(){
        String textBlock = """
                   0 - to shut down
                   1 - to add item(s) to list (comma delimited list)
                   2 - to remove any items (comma delimited list)
                   ENTER A NUMBER FOR WHICH ACTION YOU WANT TO DO:""";
        System.out.println(textBlock + " ");
    }
}
