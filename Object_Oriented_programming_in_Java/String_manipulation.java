package org.example.Inheritance_Challenge;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a abaulleted LIST:" +
                "\n\u2022 First Point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                   \u2022 Sub Point""";
        System.out.println(textBlock);

        for (int i = 1; i <=10000; i*=10){
            System.out.printf("Printing %d %n", i);
        }
        for (int i = 1; i <=10000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        //System.out.printf("Index of World = %d %n", helloWorld.indexOf('World'));
        
        
         // STRING MANIPULATION

        //IndexOf() method and substring() Method
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("BirthYear = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        // .Join() Method
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);
        String name = String.join("....", "Innocent", "Charles", "Udo");
        System.out.println(name);

        // Replace() method
        System.out.println(newDate.replace("/", "-"));
        System.out.println(name.replace("Innocent", "Innocentsax"));

        // .repeat() method
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        // .indent() method
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));


    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

}
