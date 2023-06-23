package InputOutput;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    Address address;
    int id;

    public Employee(String name, Address address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Employee() {
    }
}

