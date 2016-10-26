package servlet;

import Controller.BL;
import Controller.Clients;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import static servlet.ListServlet.arrayList;

/**
 * Created by Андрей on 21.10.2016.
 */
@WebServlet("/EditRecordServlet")
public class EditRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
//        request.getRequestDispatcher("View/record.jsp").include(request, response);
//        BL bl= null;
//        try {
//            bl = new BL();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        ArrayList<Clients> arrayList= bl.getClientsArrayList();

        int id = Integer.parseInt(request.getParameter("id"));

//        String surname = request.getParameter("surname");
//        String phone = request.getParameter("phone");
//        request.getSession().getAttribute("id");

//        if(request.getParameter("username")!=null)
//          if(Integer.parseInt(request.getSession().getAttribute("id").toString()) !=0 )
//              request.getSession().setAttribute("id",request.getSession().getAttribute("id"));
        int i;
        for (i=0; i != arrayList.size(); i++)
            if (arrayList.get(i).getId()==id)  break;
        request.getSession().setAttribute("id", arrayList.get(i).getId());
        request.getSession().setAttribute("name", arrayList.get(i).getName());
        request.getSession().setAttribute("surname", arrayList.get(i).getSurname());
        request.getSession().setAttribute("phone", arrayList.get(i).getPhone());

        request.getRequestDispatcher("View/record.jsp").include(request, response);
    }

 }
