package servlet;

import Controller.BL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Андрей on 21.10.2016.
 */
@WebServlet("/DeleteRecordServlet")
public class DeleteRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            BL bl = new BL();
        bl.deleteRecord(id);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("index.jsp").include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
