package servlets;

import dao.PostDao;
import dao.UserDao;
import jakarta.servlet.RequestDispatcher;
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
import java.sql.SQLException;

import static java.lang.System.out;

@WebServlet("/signin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        PrintWriter printer = resp.getWriter();

        UserDao userDao = new UserDao();
        User user= new User();
        user.setEmail(email);
        user.setPassword(password);

        try {
            String gotoPage = "";
            User user1 = userDao.accessLogin(user);

            if (user1 != null){
                HttpSession session = req.getSession();
                Post posts = PostDao.fetchAllPosts();
                session.setMaxInactiveInterval(10*50);
                session.setAttribute("user", user1);
                session.setAttribute("posts", posts);
                resp.sendRedirect(req.getContextPath()+"/homepage.jsp");
            } else{
                req.setAttribute("error_message", "Email or password is not correct!.");
                gotoPage = "signin.jsp";
                RequestDispatcher dispatcher = req.getRequestDispatcher(gotoPage);
                dispatcher.forward(req, resp);
//                req.setAttribute("no_user", "Email/Password not correct");
//                out.print("<p>Email or Password not correct!</p>");
//                gotoPage = "signin.jsp";
//                RequestDispatcher dispatcher = req.getRequestDispatcher(gotoPage);
//                dispatcher.forward(req, resp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
