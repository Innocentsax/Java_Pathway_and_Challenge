package org.example.Inheritance_Challenge;

public abstract class Employee extends Worker {
    private long employee_id;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employee_id = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

    //    public boolean retired(){
    //        if (isRetired = false){
    //            return true;
    //        }return false;
    //    }
        public abstract double collectpay();
}
