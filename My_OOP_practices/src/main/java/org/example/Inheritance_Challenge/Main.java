package org.example.Inheritance_Challenge;

public class Main {
    public static void main(String[] args) {
        Employee innocent = new Employee("Innocent", "11/11/1985", "01/01/2020") {
            @Override
            public double collectpay() {
                return 0;
            }
        };
        System.out.println(innocent);
        System.out.println("Age " + innocent.getAge());
        System.out.println("Pay " + innocent.collectPay());

        SalariedEmployee udo = new SalariedEmployee("Innocent",
                "02/07/1996", "01/01/2023",3500);
        System.out.println(udo);
        System.out.println("Joe's Paycheck = $" + udo.collectPay());

        udo.retired();
        System.out.println("Joe's Pesion Check = $" + udo.collectpay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectpay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
}
