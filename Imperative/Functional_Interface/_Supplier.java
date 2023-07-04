package org.example.Imperative.Functional_Interface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionrl());

        System.out.println(getDBConnectUrlSupplier.get());
    }
    static String getDBConnectionrl(){
        return "jdbc://localhost:5432/users";
    }
    static Supplier<List<String>> getDBConnectUrlSupplier = () -> List.of("jdbc://localhost:5432/users\";\n");
}
