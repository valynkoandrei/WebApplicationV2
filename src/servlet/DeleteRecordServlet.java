package servlet;

import Controller.BL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static servlet.ListServlet.arrayList;

@WebServlet("/DeleteRecordServlet")
public class DeleteRecordServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("id").toString());
        System.out.println(i);
        BL bl = new BL();
        bl.deleteRecord(arrayList.get(i).getId());


        request.getRequestDispatcher("index.jsp").include(request, response);
    }
}
