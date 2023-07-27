package com.facebook.clone.weeksixtask.DT0;

import com.facebook.clone.weeksixtask.Model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Data
@AllArgsConstructor
@Builder
public class UserDTO {
    private String fullname;
    private String sex;
    private String dob;
    private String email;
    private int userId;

    public UserDTO(User user){
        this.fullname= user.getFullname();
        this.sex=user.getSex();
        this.dob=user.getDob();
        this.email=user.getEmail();
    }

    public  UserDTO(ResultSet resultSet1) throws SQLException {
        String cmd = "INSERT INTO facebook_clone.users (fullname,sex,)";
    }
}


