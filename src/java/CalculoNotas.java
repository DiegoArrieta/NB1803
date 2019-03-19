/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zeuss
 */
public class CalculoNotas extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        MetodoNotas x=new MetodoNotas();
        float n1,n2,n3,n4;
        boolean sw=false;
        try {
            n1 = Float.parseFloat(request.getParameter("nota1"));
            if(n1>=1.0 && n1<=7.0)
                {
                sw=true;
                }
            n2 = Float.parseFloat(request.getParameter("nota2"));
            if(n2>=1.0 && n2<=7.0)
                {
                sw=true;
                }
            n3 = Float.parseFloat(request.getParameter("nota3"));
            if(n3>=1.0 && n3<=7.0)
                {
                sw=true;
                }
            n4 = Float.parseFloat(request.getParameter("nota4"));
            if(n4>=1.0 && n4<=7.0)
                {
                sw=true;
                }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculoNotas</title>");            
            out.println("</head>");
            out.println("<body>");
            if(sw==true)
                {
                out.println("<h1>Promedio Final de Alumno: " + x.calcular_promedio(n1, n2, n3, n4) + "</h1>");
                }
                else
                {
                out.println("<h1>Notas no cumplen</h1>");
                }
            out.println("</body>");
            out.println("</html>");
        }
        catch(NumberFormatException ex)
{
}
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
