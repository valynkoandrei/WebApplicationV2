package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Андрей on 21.10.2016.
 */
@WebServlet("/AddRecordServlet")
public class AddRecordServlet extends HttpServlet {
    public AddRecordServlet() {
        super();
    }
//    public Boolean AddRecord=false;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
//        AddRecord=true;
        request.getSession().setAttribute("id",0);
        request.getSession().setAttribute("name","");
        request.getSession().setAttribute("surname","");
        request.getSession().setAttribute("phone","");
        request.getRequestDispatcher("View/record.jsp").include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/View/record.jsp");
    }
}
