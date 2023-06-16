package org.example.Inheritance_Challenge;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    //private int age;


    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    public Worker(){}

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }


    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear -birthYear);
    }

}
