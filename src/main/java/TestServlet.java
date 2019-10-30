//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/hello/*"})
public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("Hej!" + req.getRequestURI());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("username"); //henter parameter fra brugernavn-indtastningsfeltet i indexfilen
        System.out.println(input); // printer det indtastede brugernavn i output
        resp.sendRedirect("/" +"?username=" + input); //det indtastede brugernavn vises på siden samt i url
    }
}
