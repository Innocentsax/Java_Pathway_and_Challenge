package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"Apples", "Bananas", "Milk", "Eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles", "Mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("Mustard")){
            System.out.println("List contains mustard");
        }
        groceries.add("Maggi");
        System.out.println("first = " + groceries.indexOf("Eggs"));
        System.out.println("Last = " + groceries.lastIndexOf("cheese"));

        // Remove method in ArrayList {remove(), removeAll()}
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Milk");
        System.out.println(groceries);
        groceries.removeAll(List.of("Apples", "cheese"));
        System.out.println(groceries);

        groceries.retainAll(List.of("Apple", "Eggs", "mustard", "Maggi"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apple", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickle", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("-------------------");

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);
        originalList.set(0, "One");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));
    }
}
