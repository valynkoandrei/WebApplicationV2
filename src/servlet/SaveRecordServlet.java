package servlet;

import Controller.BL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/SaveRecordServlet")
public class SaveRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            BL bl = new BL();

            int id = Integer.parseInt(request.getSession().getAttribute("id").toString());
            String inputName = request.getParameter("inputName");
            String inputSurname = request.getParameter("inputSurname");
            String inputPhone = request.getParameter("inputPhone");

            if (id == 0)
                bl.addRecord(inputName, inputSurname, inputPhone);
            else
                bl.updateArrayList(id, inputName, inputSurname, inputPhone);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("index.jsp").include(request, response);
    }

}
