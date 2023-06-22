import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderDuplicate {
    public static void main(String[] args) {
        String fileName = "ExampleFile.txt";
        List<User> userList = new ArrayList<>();

        //Using try with resources to handle closing of opened IO Objects. e.g. BufferedWriter, InputStreamReader
        //FileReader. e.t.c
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;

            //run a while loop until the end of file or EOF or until it reaches null
            while((line=bufferedReader.readLine())!=null){

                //Removes comma "," and returns an array with each value after the comma ","
                String [] lineArray = line.split(",");

                //Populate each User Object with the lineArray Data
                User userData =  new User(lineArray[0],
                        Roles.valueOf(lineArray[1].toUpperCase()
                                .replace(" ",  "")),
                        lineArray[2].replace(" ",  ""));


                userList.add(userData);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(userList);
    }
}
