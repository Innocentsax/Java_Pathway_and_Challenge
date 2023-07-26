package model;

import enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class User {
    private int UserId;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private Date DateOfBirth;
    private Gender gender;


//
//    public int getUserId() {
//        return UserId;
//    }
//
//    public void setUserId(int userId) {
//        UserId = userId;
//    }
//
//    public String getFirstName() {
//        return FirstName;
//    }
//
//    public void setFirstName(String firstName) {
//        FirstName = firstName;
//    }
//
//    public String getLastName() {
//        return LastName;
//    }
//
//    public void setLastName(String lastName) {
//        LastName = lastName;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String email) {
//        Email = email;
//    }
//
//    public String getPassword() {
//        return Password;
//    }
//
//    public void setPassword(String password) {
//        Password = password;
//    }
//
//    public java.sql.Date getDateOfBirth() {
//        return (java.sql.Date) DateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        DateOfBirth = dateOfBirth;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
}
