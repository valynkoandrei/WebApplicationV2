package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AddRecordServlet")
public class AddRecordServlet extends HttpServlet {
    public AddRecordServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

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
