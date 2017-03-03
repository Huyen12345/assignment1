/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnecDB;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "AccountServlet", urlPatterns = {"/AccountServlet"})
public class AccountServlet extends HttpServlet {

 Connection con;
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

       String username = request.getParameter("tentk");
       String pass = request.getParameter("pass");
       String hoten = request.getParameter("hoten");
       String vaitro = request.getParameter("vaitro");
       String diachi = request.getParameter("diachi");
       String email = request.getParameter("email");
       String sdt = request.getParameter("sdt");
      
      
      
        try {    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBH","sa","123");
            String sql= "insert into TAI_KHOAN  values (?,?,?,?,?,?,?)" ;
            PreparedStatement ps = con.prepareStatement(sql);         
            ps.setString(1, username);
            ps.setString(2, pass);
            ps.setString(3, vaitro);
            ps.setString(4, hoten);
            ps.setString(5, diachi);
            ps.setString(6, email);
            ps.setString(7, sdt);
            ps.executeUpdate();
            PrintWriter out= response.getWriter();
            out.println("Login Ok");
            out.println("<a href='MainPage.jsp'>Back</a>");
        } catch (Exception e) {
            out.println("Login Fail");
            out.println("<a href='MainPage.jsp'>Back</a>");
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
