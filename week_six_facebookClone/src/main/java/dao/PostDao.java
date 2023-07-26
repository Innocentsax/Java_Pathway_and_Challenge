package dao;

import dbConnect.ConnectDatabase;
import model.Post;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostDao {

    public static int newPost(Post post, User user){
        int status=0;
        try{
            Connection databaseconnection = ConnectDatabase.connectionToDatabase();
            PreparedStatement ps= databaseconnection.prepareStatement(
                    "insert into Post (post,userId) values (?,?)");
            ps.setString(1, post.getPost());
            ps.setInt(2, user.getUserId());

            status=ps.executeUpdate();

            databaseconnection.close();
        }catch(Exception ex){ex.printStackTrace();}

        return status;
    }

    public static Post fetchAllPosts() {
        return null;
    }
}
