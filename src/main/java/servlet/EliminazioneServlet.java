package servlet;

import dao.UtenteDaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "eliminazioneServlet", value = "/eliminazioneServlet")
public class EliminazioneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        UtenteDaoImpl utenteDao = new UtenteDaoImpl();
        utenteDao.eliminaUtente(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("homeServlet");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}