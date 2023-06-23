package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) throws IOException {
//        System.out.println("Innocent Charles");
//        System.err.println("Error message");
//
//        try {
//            int i = System.in.read();
//            System.out.println("You typed " + (char)i);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        // WRITING INTO A FILE USING FILEOUTPUT STREAM
//        FileOutputStream fo = new FileOutputStream("Udo.txt");
//        System.out.println("Opens the file successfull");
//        String data = "Innocent, Charles, Udo\n" +
//                "Benjamin, Ben, Ekereta";
//        fo.write(data.getBytes());
//        fo.close();

//        // READING FROM A FILE USING FILEINPUTSTREAM
//        FileInputStream fo = new FileInputStream("/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/Student.csv");
//        int i = -1;
//        while((i = fo.read()) != -1){
//            System.out.print((char)i);
//        }
//        fo.close();

//        // USING FILEWRITER CLASS
//        FileWriter mm = new FileWriter("Udo.txt");
//        mm.write("My name is innocent, am a Java developer");
//        mm.close();


//        // USING A FILE READER CLASS
//        FileReader red = new FileReader("Udo.txt");
//        int i = 0;
//        while((i = red.read()) != -1){
//            System.out.print((char)i);
//
//        }red.close();

        // USING A BUFFERED READER TO READ TEXT
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Udo.txt"));
        String line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

    }
}
