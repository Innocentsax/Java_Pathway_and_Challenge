import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterIO {
    public static void main(String[] args) throws IOException {
        String fileName = "ExampleFile.txt";
        try(BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(fileName, true))){

            String dataToWrite = "Gadibia, Student, Java\n" +
                    "Daro, Student, Node\n" +
                    "Dee, Instructor, C++\n";
            bufferedWriter.write(dataToWrite);
            bufferedWriter.close();
        }
        catch (Exception e){
            throw new RuntimeException("Could not write to the file with name: " +
                    ""+fileName+" because, "+e.getMessage());
        }
    }
}
