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
//         int id=Integer.parseInt(request.getParameter("id").toString());
//        System.out.println(id);
        int i=Integer.parseInt(request.getParameter("id").toString());

//        for (i = 0; i != arrayList.size(); i++)
//            if (arrayList.get(i).getId() == id)  break;

        request.getSession().setAttribute("id", arrayList.get(i).getId());
        request.getSession().setAttribute("name", arrayList.get(i).getName());
        request.getSession().setAttribute("surname", arrayList.get(i).getSurname());
        request.getSession().setAttribute("phone", arrayList.get(i).getPhone());

        request.getRequestDispatcher("View/record.jsp").include(request, response);
    }

}
