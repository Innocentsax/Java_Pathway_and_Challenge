package InputOutput;

import java.io.*;

public class Main {
    public static <user> void main(String[] args) throws IOException, ClassNotFoundException {
        //Writing input into a file
        try {
            String[] names = {"John",  "Innocent", "Charles"};
            BufferedWriter writer = new BufferedWriter(new FileWriter("Inno.txt"));
            writer.write("My name is Innocent\n");
            writer.write("Am an Associate Software Developer in Decagon");

            for (String name: names){
                writer.write("\n ~ " + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Inno.txt"));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
                reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         //SERIALIZATION
        FileOutputStream fo = new FileOutputStream("Udo.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
        Address address = new Address();
        address.state = "Lagos";
        address.city = "Ochid";
        address.country = "Nigeria";

        Employee employee = new Employee("Innocent", address, 123);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fo.close();


         //DESERIALIZATION
        FileInputStream nene = new FileInputStream("Udo.txt");
        ObjectInputStream mama = new ObjectInputStream(nene);
        Employee employee = (Employee) mama.readObject();
        mama.close();
        nene.close();

        System.out.println("Employee name " + employee.name + ", Address: "+ employee.address + "ID: " + employee.id);
        System.out.println("Country: " + employee.address.country + ", State: " + employee.address.state +
                ", Country: " + employee.address.city);

         //TRANSIENT KEYWORD
        User user = new User();
        user.id = 123;
        user.password = "user1";
        user.username = "inno";

        FileOutputStream fileOutputStream = new FileOutputStream("Udo.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        fileOutputStream.close();

        User user;
        FileInputStream fileInputStream = new FileInputStream("Udo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        user = (User)objectInputStream.readObject();
        System.out.println("Name: " + user.username + ", Password: " + user.password);
        objectInputStream.close();
        fileInputStream.close();

    }
}
