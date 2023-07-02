package org.example.Interfaces.Interface_Challenge;

import java.util.ArrayList;
import java.util.List;

/**
 *  First, Create a MAPPABLE Interface
 *  The interface should force classes to implement three methods.
 *  a. One method should return a label( how the item will be described on th map).
 *  b. One should return a geometry type (POINT or LINE) which is what the type will look like on the map
 *  c. The last should return an icon type( sometimes called a map marker)
 *
 *  In addition to the three method described, the interface should also include:
 *  a. A constant string value called JSON PROPERTY, which is equal to: "properties": {%s}. A hint here, using a text block will help, using a text block will help maintain quotation marks in your output
 *  ....
 */


public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        System.out.println("-".repeat(90));
        mappables.add(new UtilityLine("Sydney Opera House", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Stadium Australia", UtilityType.WATER));

        for (var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
