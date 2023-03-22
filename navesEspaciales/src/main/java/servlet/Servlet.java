package servlet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.mycompany.navesespaciales.Atat;
import com.mycompany.navesespaciales.Destructor;
import com.mycompany.navesespaciales.Halcon;
import com.mycompany.navesespaciales.Lanzadera;
import com.mycompany.navesespaciales.NavesEspaciales;
import com.mycompany.navesespaciales.Supremacy;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author JOHN JAIRO
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
       NavesEspaciales nave1 = new Halcon(Integer.parseInt(request.getParameter("halconmpersonas")), (int) Double.parseDouble(request.getParameter("halconmconsumo")), Integer.parseInt(request.getParameter("halconmcantidad")), Double.parseDouble(request.getParameter("halconmdistancia")));
       NavesEspaciales nave2 = new Destructor(Integer.parseInt(request.getParameter("destrucpersonas")), (int) Double.parseDouble(request.getParameter("destrucconsumo")), Integer.parseInt(request.getParameter("destruccantidad")), Double.parseDouble(request.getParameter("destrucdistancia")));
       NavesEspaciales nave3 = new Lanzadera(Integer.parseInt(request.getParameter("lanzpersonas")), (int) Double.parseDouble(request.getParameter("lanzconsumo")), Integer.parseInt(request.getParameter("lanzcantidad")), Double.parseDouble(request.getParameter("lanzdistancia")));
       NavesEspaciales nave4 = new Supremacy(Integer.parseInt(request.getParameter("supretransporte")), Integer.parseInt(request.getParameter("suprepersonas")), (int) Double.parseDouble(request.getParameter("supreconsumo")), Integer.parseInt(request.getParameter("suprecantidad")), Double.parseDouble(request.getParameter("supredistancia")));
       NavesEspaciales nave5 = new Atat(Integer.parseInt(request.getParameter("atatpersonas")), (int) Double.parseDouble(request.getParameter("atatconsumo")), Integer.parseInt(request.getParameter("atatcantidad")), Double.parseDouble(request.getParameter("atatdistancia")));
        
      double totalnave1=nave1.calCombustibleTotal();
      double totalnave2=nave2.calCombustibleTotal();
      double totalnave3=nave3.calCombustibleTotal();
      double totalnave4=nave4.calCombustibleTotal();
      double totalnave5=nave5.calCombustibleTotal();
      
     double totalcombustible=totalnave1+totalnave2+totalnave3+totalnave4+totalnave5;
      request.setAttribute("resul", totalcombustible);
     
      response.sendRedirect("naves.jsp");
      

    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /*
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
