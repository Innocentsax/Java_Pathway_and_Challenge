package Collection_FrameWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewMain {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        /**
         * ==> TERMINAL OPERATIONS:
         * 1. collect()
         * 2. count()
         * 3. max()
         * 4. anyMatch()
         * 5. reduce()
         * 6. findAny()
         * 7. forEach()
         *
         * ==> INTERMEDIATE OPERATOR (it returns streams)
         * 1. map()
         * 2. filter()
         * 3. flatMap()
         * 4. peek()
         * 5. sorted()
         * 6. skip()
         * 7. peek()
         * 8. distinct()
         */

        // Using Map(), Stream() and collect()
        System.out.println(Arrays.asList(1, 2, 3, 5, 7, 9).stream().map(num -> num*3).collect(Collectors.toList())); // OR
        List<Integer> integerList = Arrays.asList(1, 3, 6, 9, 6, 2, 8, 4);
        integerList = integerList.stream().map(num -> num*5).collect(Collectors.toList());
        System.out.println(integerList);

        // Using filter() and sorted() method
        List<Integer> filterAndSorted = integerList.stream().filter(num -> num%2==0).sorted(Integer::compareTo).collect(Collectors.toList());
        List<Integer> filterAndSorted1 = integerList.stream().filter(num -> num%2==0).sorted(Integer::compareTo).toList();
        System.out.println("Sorted: " + filterAndSorted1);

        // Using only filter() method
        List<Integer> filterMethod = Collections.singletonList(integerList.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum));
        System.out.println("Sum of all even number " + filterMethod);

        // Using flatMap
        long flatmap = Stream.of(
                Arrays.asList(1, 2, 4, 5, 6),
                Arrays.asList(3, 5, 6, 7, 5),
                Arrays.asList(6, 3, 6, 2)).mapToLong(Collection::size).sum();
        System.out.println("Flatmap = " + flatmap);

        List<Integer> listOfIntegerlist = Arrays.asList(Arrays.asList(1, 2, 4, 5, 6), Arrays.asList(3, 5, 6, 7, 5), Arrays.asList(6, 3, 6, 2))
                .stream().flatMap(Collection::stream).toList();
        System.out.println("Flatmap" + listOfIntegerlist);
    }
}
