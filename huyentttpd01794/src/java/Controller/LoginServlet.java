/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ShowUser.user;
import Model.ConnecDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    ConnecDB db;
     public static String userN;
    public static String display="style='display: block'";
    public static String displayDN="display: none";
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
        db= new ConnecDB("QLBH","tan","123");
        String u = request.getParameter("t1");
        String p = request.getParameter("t2");
        int i=db.Login(u, p);
        switch (i) {
            case 0:
                {
                    RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
                    rd.include(request, response);
                    break;
                }
            case 1:
                {
                    userN="Xin chào "+request.getParameter("t1");
                    ShowUser.user=user;
                    display="style='display: none'";
                    displayDN="display: block";
                    response.sendRedirect("Administrator.jsp");
                    RequestDispatcher rd = request.getRequestDispatcher("Administrator.jsp");
                    rd.include(request, response);
                    
                    break;
                }
            default:
                {
                    RequestDispatcher rd = request.getRequestDispatcher("MainPage.jsp");
                    rd.include(request, response);
                    userN="Xin chào "+request.getParameter("t1");
                    ShowUser.user=user;
                    display="style='display: none'";
                    displayDN="display: block";
                    response.sendRedirect("MainPage.jsp");
                    break;
                }
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
