package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static <hashSet> void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>(9);
//
//        arrayList.add("Innocent4");
//        arrayList.add("Charles7");
//        arrayList.add("Udo1");
//
//        String firstElement = arrayList.get(0);
//        System.out.println(firstElement);
//
////        arrayList.remove(0);
////        arrayList.remove(1);
//        //arrayList.sort((Comparator<? super String>) arrayList);
//        Collections.sort(arrayList);
//
////        for (String elements : arrayList){
////            System.out.println(elements);
////        }
//
//        for(int i = 0; i < arrayList.toArray().length; i++){
//            System.out.println(arrayList.get(i));
//        }

        // LINKEDLIST IN JAVA
//        LinkedList<Integer> linkedList = new LinkedList<>();
//         linkedList.add(4);
//         linkedList.add(7);
//         linkedList.add(89);
//         linkedList.add(34);
//         linkedList.add(6);
//
//         linkedList.remove(0);
//         Collections.sort(linkedList);
//
//         for (int ny : linkedList){
//             System.out.println(ny);
//         }

        // STACK IN JAVA
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(45);
//
//        System.out.println(stack);
//        int remv = stack.pop();
//        System.out.printf(String.valueOf(remv));
//
//        System.out.println();
//
//        int mumu = stack.peek();
//        System.out.printf(String.valueOf(mumu));
////        for(int mm : stack){
////            System.out.println(stack);
////        }
//
//        System.out.println();
//
//        while(!stack.isEmpty()){
//            int show = stack.pop();
//            System.out.println(show);
//        }

        // QUEUE IN JAVA
//        LinkedList queue = new LinkedList();
//        queue.add(2);
//        queue.add(5);
//        queue.add(6);
//        queue.add(9);
//
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        int mm = (int) queue.peek();
//        System.out.println(mm);

//        PriorityQueue priorityQueue = new PriorityQueue();
//        priorityQueue.offer(2);
//        priorityQueue.offer(4);
//        priorityQueue.offer(6);
//        priorityQueue.offer(9);
//
//        System.out.println(priorityQueue);
//        priorityQueue.poll();
//        System.out.println(priorityQueue);

//        // HASHSET IN JAVA
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Innocent1");
//        hashSet.add("Innocent3");
//        hashSet.add("Innocent5");
//        hashSet.add("Innocent2");
//        //hashSet.add("Innocent2");
//
//        hashSet.remove("Innocent5");
//        boolean checker = hashSet.contains("Innocent5");
//        System.out.println(checker);
//
//        for(String str : hashSet){
//            System.out.println(str);
//        }

//        // HASHMAP IN JAVA
//        HashMap<Integer, String> hashMap = new HashMap<>();
//
//        hashMap.put(23, "Innocent");
//        hashMap.put(3, "Udo");
//        hashMap.put(24, "Charles");
//        hashMap.put(7, "Chinaza");
//
//        String tenValue = hashMap.get(23);
//        System.out.println(tenValue);
//
//        boolean checker = hashMap.containsKey(3);
//        System.out.println(checker);
//
//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

        // ITERATOR IN JAVA
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("iififi");
        arrayList.add("iifhugyfi");
        arrayList.add("iifyrx");
        arrayList.add("iiflkj;kn");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current);
        }

    }
}
