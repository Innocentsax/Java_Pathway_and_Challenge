package Array;

public class VarArgs {
    public static void main(String... args) {
        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello, World");

        String[] sArray =  {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArray));
//        String[] splitStrings = new String[]{"Hello World again"};
//        System.out.println(Arrays.toString(splitStrings));
    }

    private static void printText(String... textList){

        for (String t : textList){
            System.out.println(t);
        }
    }
}
