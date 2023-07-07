package org.example.Task3Band4.Entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.example.Task3Band4.Entities.Store.availableUnit;
import static org.example.Task3Band4.Entities.Store.products;

public class ReaderClass {

    public static void readFile() throws IOException {
        String filename = "/Users/mac/IdeaProjects/DOING_HARD_THINGS/src/main/java/org/example/Task3Band4/Entities/ProducList.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String arr[] = line.split(",");
                if(arr[0].contains("Unit"))continue;
                //System.out.println(Arrays.toString(arr));
                Product product =  new Product();
                product.setDescription(arr[1]);
                product.setUnitPrize(Double.parseDouble(arr[2]));
                product.setAmount(Double.parseDouble(arr[3]));
                products.add(product);
                availableUnit.put(arr[1], Integer.valueOf(arr[0]));
            }
            System.out.println(availableUnit);
        };
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }


}
