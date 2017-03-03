/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "getCatalogue", urlPatterns = {"/getCatalogue"})
public class getCatalogue extends HttpServlet {
    static public String Maloai= "";
    static public String Tenloai = "";
    static public String ac = "";
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
        try (PrintWriter out = response.getWriter()) {
            Maloai = request.getParameter("maloai");
            Tenloai = request.getParameter("tenloai");
            ac = request.getParameter("ac");
            switch (ac) {
                case "0":
                    try {
                        /* TODO output your page here. You may use following sample code. */
                        Statement st = Model.ConnecDB.getConnection().createStatement();
                        ResultSet rs = st.executeQuery("select * from LOAI_SP where Ma_loai='" + Maloai + "'");
                        
                        if (rs.next()) {
                            Tenloai = rs.getString(2);
                            
                            
                        } else {
                            Maloai = "";
                            Tenloai = "";
                            
                        }
                        
                        response.sendRedirect("Catalogue.jsp");
                       
                    } catch (IOException | SQLException ex) {
                        Logger.getLogger(getCatalogue.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ///neu trang thai khac 0
                    break;
                case "1":
                    {
                          String maloai = request.getParameter("maloai");
                        String tenloai = request.getParameter("tenloai");
                        try {
                            
                            PreparedStatement pr=Model.ConnecDB.getConnection().prepareStatement("INSERT INTO LOAI_SP VALUES(?,?)");
                            pr.setString(1, maloai);
                            pr.setString(2, tenloai);
                            
                            pr.executeUpdate();
                            response.sendRedirect("Catalogue.jsp");
                        } catch (IOException | SQLException ex) {
                            
                        }       break;
                    }
                case "2":
                    {
                        String maloai = request.getParameter("maloai");
                        String tenloai = request.getParameter("tenloai");
                        try {
                            
                            PreparedStatement pr = Model.ConnecDB.getConnection().prepareStatement("update LOAI_SP set Loai_sp=? where Ma_loai=? ");
                            pr.setString(2, maloai);
                            pr.setString(1, tenloai);
                            
                            pr.executeUpdate();
                            
                            Statement st = Model.ConnecDB.getConnection().createStatement();
                            ResultSet rs = st.executeQuery("select * from LOAI_SP where Ma_loai='" + Maloai + "'");
                            if (rs.next()) {
                                tenloai = rs.getString(2);
                                
                            } else {
                                maloai = "";
                                tenloai = "";
                                
                            }
                            
                            response.sendRedirect("Catalogue.jsp");
                        } catch (IOException | SQLException ex) {
                            out.println(ex);
                        }       break;
                    }
                case "3":
                    Maloai = request.getParameter("maloai");
                    try {
                        
                        PreparedStatement pr = Model.ConnecDB.getConnection().prepareStatement("delete from LOAI_SP where Ma_loai= ?");
                        pr.setString(1, Maloai);
                        pr.executeUpdate();
                        Maloai = "";
                        Tenloai = "";
                        
                        response.sendRedirect("Catalogue.jsp");
                    } catch (IOException | SQLException ex) {
                        
                    }   break;
                default:
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
