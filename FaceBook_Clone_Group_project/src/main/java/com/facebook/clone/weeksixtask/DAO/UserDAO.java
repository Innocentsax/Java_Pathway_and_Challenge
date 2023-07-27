package com.facebook.clone.weeksixtask.DAO;

import com.facebook.clone.weeksixtask.Model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;

    private void ConnectToDB() throws SQLException {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","11111111");
    }
    public void saveUserData(User user){
        //String password = BCrypt.hashpw(userDTO.getPassword(), BCrypt.gensalt());
        String query =  "INSERT INTO";
    }
}
