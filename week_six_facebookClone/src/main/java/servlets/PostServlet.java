package servlets;

import dao.PostDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Post;
import model.User;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/post")
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String name=req.getParameter("body");

        Post post = new Post();
        post.setPost(name);
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        int status= PostDao.newPost(post,user);
        if(status>0){
            req.getRequestDispatcher("homepage.jsp").include(req, resp);
        }else{
            out.println("Sorry! unable to process your post");
        }
        out.close();
    }
}

