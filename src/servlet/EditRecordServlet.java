package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static servlet.ListServlet.arrayList;


@WebServlet("/EditRecordServlet")
public class EditRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number=Integer.parseInt(request.getParameter("id").toString());

        request.getSession().setAttribute("id", arrayList.get(number).getId());
        request.getSession().setAttribute("name", arrayList.get(number).getName());
        request.getSession().setAttribute("surname", arrayList.get(number).getSurname());
        request.getSession().setAttribute("phone", arrayList.get(number).getPhone());
       
        request.getRequestDispatcher("jsp/record.jsp").include(request, response);
    }

}
