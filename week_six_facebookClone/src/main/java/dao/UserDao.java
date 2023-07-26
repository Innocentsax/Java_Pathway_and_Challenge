package dao;

import dbConnect.ConnectDatabase;
import enums.Gender;
import model.User;

import java.sql.*;

public class UserDao {

    public static int userRegistration(User user) {
        int status = 0;
        try {
            Connection databaseconnection = ConnectDatabase.connectionToDatabase();
            PreparedStatement ps = databaseconnection.prepareStatement(
                    "insert into User(FirstName,LastName,Email,Password,Gender) values (?,?,?,?,?)");
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
//            ps.setDate(5, user.getDateOfBirth());
            ps.setString(5, String.valueOf(user.getGender()));

            status = ps.executeUpdate();
            databaseconnection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
}

    public static int updateUser(User user){
        int status=0;
        try{
            Connection databaseconnection =ConnectDatabase.connectionToDatabase();
            PreparedStatement ps= databaseconnection.prepareStatement(
                    "insert into User(FirstName,LastName,Email,Password,Gender,User) values (?,?,?,?,?,?)");
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
//            ps.setDate(5, user.getDateOfBirth());

            ps.setString(5, String.valueOf(user.getGender()));
            ps.setInt(6, user.getUserId());

            status=ps.executeUpdate();

            databaseconnection.close();
        }catch(Exception ex){ex.printStackTrace();}

        return status;
    }


        public static User getUserById ( int id){
            User user = new User();

            try{
                Connection databaseconnection =ConnectDatabase.connectionToDatabase();
                PreparedStatement ps= databaseconnection.prepareStatement("select * from User where id=?");
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    user.setUserId(rs.getInt(1));
                    user.setFirstName(rs.getString(2));
                    user.setLastName(rs.getString(3));
                    user.setEmail(rs.getString(4));
                    user.setPassword(rs.getString(5));
                    user.setDateOfBirth(rs.getDate(6));
                    user.setGender((Gender) rs.getObject(7));
                }
                databaseconnection.close();
            }catch(Exception ex){ex.printStackTrace();}

            return user;
        }

    public User accessLogin(User user) throws SQLException,
            ClassNotFoundException {
        User user1 = null;
        ResultSet result;
        boolean status;
        try {
            Connection databaseConnection = ConnectDatabase.connectionToDatabase();
            String sql = "SELECT * FROM User WHERE Email = ? and Password = ?";
            PreparedStatement statement = databaseConnection.prepareStatement(sql);
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());

            result = statement.executeQuery();

            if (result.next()) {
                user1 = new User();

                user1.setFirstName(result.getString("FirstName"));
                user1.setLastName(result.getString("LastName"));
                user1.setEmail(result.getString("Email"));
                user1.setPassword(result.getString("Password"));
//                user1.setDateOfBirth(result.getDate("DateOfBirth"));
                user1.setGender((Gender) result.getObject("gender"));

            } else {
                System.out.println("No more user");
            }
            databaseConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user1;
    }
}



