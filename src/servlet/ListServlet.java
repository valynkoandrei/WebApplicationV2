package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.BL;
import Controller.Clients;
/**
 * Created by Андрей on 21.10.2016.
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        processRequest(request, response);
    }
    public static ArrayList<Clients> arrayList;
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String page = "/View/list";
        try {
            BL bl=new BL();

        arrayList= bl.getClientsArrayList();

//        request.getSession().setAttribute("id", arrayList.get(0).getId());
//        request.getSession().setAttribute("name", arrayList.get(0).getName());
//        request.getSession().setAttribute("surname", arrayList.get(0).getSurname());
//        request.getSession().setAttribute("phone", arrayList.get(0).getPhone());

        request.getRequestDispatcher("View/list.jsp").include(request, response);

//

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("View/list.jsp").include(request, response);
//            dispatcher.forward(request, response);

    }

 }
