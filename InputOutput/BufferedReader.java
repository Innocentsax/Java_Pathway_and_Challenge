package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class_activities {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "/Users/mac/IdeaProjects/School_Model_Task1/src/WEEK2_TASK/application.properties";
        Map<String, String> fileValue = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line=bufferedReader.readLine()) !=null){
                String[] lineArray = line.split("=");
                if (lineArray[0].contains("application")){
                    fileValue.put("application", lineArray[1]);
                }
                if(lineArray[0].contains("server")){
                    fileValue.put("port", lineArray[1]);
                }
                if(lineArray[0].contains("db.name")){
                    fileValue.put("dbName", lineArray[1]);
                }
                if(lineArray[0].contains("db.port")){
                    fileValue.put("dbPort", lineArray[1]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileValue.get("port"));
    }
}
