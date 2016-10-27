package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.BL;
import model.Clients;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }

    public static ArrayList<Clients> arrayList;

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            BL bl = new BL();
            arrayList = bl.getClientsArrayList();
        } catch (SQLException e) {
            e.printStackTrace();
        }

            request.getRequestDispatcher("jsp/list.jsp").include(request, response);

    }

}
