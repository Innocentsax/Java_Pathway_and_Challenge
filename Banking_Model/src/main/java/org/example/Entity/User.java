package org.example.Entity;

import org.example.Enum.Role;

public class User {
    private String name;
    private String email;
    private Role role;
    private String bod;
    private String location;
    private int age;

    public User(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String name, String email, String bod, String location, int age) {
        this.name = name;
        this.email = email;
        this.bod = bod;
        this.location = location;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            this.age =0;
            System.out.println("You are not of age to open account");
        }this.age = age;
    }
}
