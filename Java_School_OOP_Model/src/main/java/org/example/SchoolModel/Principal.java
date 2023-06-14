package org.example.SchoolModel;

public class Principal extends Staff{
    private School school;
    public Principal(int id, String name,int age, double wallet) {
        super(id, name, age, wallet);
        this.school = school;

    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
