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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "getProduct", urlPatterns = {"/getProduct"})
public class getProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   static public String masp="";
    static public String tensp="";
    static public String mota="";
    static public String soluong="";
    static public float dongia;
    static public String hinhanh="";
    static public String nhasx="";
    static public String maloai="";
    static public String ac="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ac=request.getParameter("ac");
        PrintWriter out=response.getWriter();
       switch (ac) {
           case "0":
               masp =request.getParameter("Ma_sp");
               tensp = request.getParameter("Ten_sp");
               mota = request.getParameter("Mo_ta");
               soluong = request.getParameter("So_luong");
               dongia = Float.parseFloat(request.getParameter("Don_gia"));
               hinhanh = request.getParameter("Hinh_anh");
               nhasx = request.getParameter("Nha_sx");
               maloai = request.getParameter("Ma_loai");
               try {
                   Statement st=Model.ConnecDB.getConnection().createStatement();
                   ResultSet rs=st.executeQuery("select * from SAN_PHAM where Ma_sp='"+masp+"'");
                   if(rs.next()){
                       tensp=rs.getString(2);
                       mota=rs.getString(3);
                       soluong=rs.getString(4);
                       dongia= Float.parseFloat(rs.getString(5));
                       hinhanh = rs.getString(6);
                       nhasx = rs.getString(7);
                       maloai = rs.getString(8);
                       
                   }else{
                       tensp=rs.getString("");
                       mota = rs.getString("");
                       soluong = rs.getString("");
                       dongia = rs.getFloat("");
                       hinhanh = rs.getString("");
                       nhasx = rs.getString("");
                       maloai = rs.getString("");
                       
                   }response.sendRedirect("Manager_Product.jsp");
               } catch (SQLException ex) { 
                     out.println("Không tìm thấy sản phẩm");
               }  break;
           case "1":
               masp =request.getParameter("Ma_sp");
               tensp = request.getParameter("Ten_sp");
               mota = request.getParameter("Mo_ta");
               soluong = request.getParameter("So_luong");
               dongia = Float.parseFloat(request.getParameter("Don_gia"));
               hinhanh = request.getParameter("Hinh_anh");
               nhasx = request.getParameter("Nha_sx");
               maloai = request.getParameter("Ma_loai");
               try {
                   PreparedStatement pr=Model.ConnecDB.getConnection().prepareStatement("insert into SAN_PHAM values(?,?,?,?,?,?,?,?)");
                   pr.setString(1, masp);
                   pr.setString(2, tensp);
                   pr.setString(3, mota);
                   pr.setString(4, soluong);
                   pr.setInt(5, (int) dongia);
                   pr.setString(6, hinhanh);
                   pr.setString(7, nhasx);
                   pr.setString(8, maloai);
                   pr.executeUpdate();
                   response.sendRedirect("Manager_Product.jsp");
               } catch (Exception ex) {
                     response.sendRedirect("Manager_Product.jsp");
               }  break;
           case "2":
               masp =request.getParameter("Ma_sp");
               tensp = request.getParameter("Ten_sp");
               mota = request.getParameter("Mo_ta");
               soluong = request.getParameter("So_luong");
               dongia = Float.parseFloat(request.getParameter("Don_gia"));
               hinhanh = request.getParameter("Hinh_anh");
               nhasx = request.getParameter("Nha_sx");
               maloai = request.getParameter("Ma_loai");
               try {
                   PreparedStatement pr=Model.ConnecDB.getConnection().prepareStatement("update SAN_PHAM set  Ten_sp= ?  , Mo_ta = ?, So_luong = ? , Don_gia=?, Hinh_anh=?, Nha_sx=?, Ma_loai=? where Ma_sp=?");
                   pr.setString(8, masp);
                   pr.setString(1, tensp);
                   pr.setString(2, mota);
                   pr.setString(3, soluong);
                   pr.setInt(4, (int) dongia);
                   pr.setString(5, hinhanh);
                   pr.setString(6, nhasx);
                   pr.setString(7, maloai);
                   pr.executeUpdate();
                   Statement st = Model.ConnecDB.getConnection().createStatement();
                   ResultSet rs = st.executeQuery("select * from SAN_PHAM where Ma_sp='" + masp + "'");
                   if (rs.next()) {
                       tensp=rs.getString(2);
                       mota=rs.getNString(3);
                       soluong=rs.getString(4);
                       dongia= Float.parseFloat(rs.getString(5));
                       hinhanh = rs.getString(6);
                       nhasx = rs.getString(7);
                       maloai = rs.getString(8);
                   } else {
                       tensp=rs.getString("");
                       mota = rs.getString("");
                       soluong = rs.getString("");
                       dongia = rs.getFloat("");
                       hinhanh = rs.getString("");
                       nhasx = rs.getString("");
                       maloai = rs.getString("");
                   }
                   
                   response.sendRedirect("Manager_Product.jsp");
               }catch(Exception e){
                   out.println(e);
                   response.sendRedirect("Manager_Product.jsp");
               }
               break;
           case "3":
               {
                   String  masp = request.getParameter("Ma_sp");
                   try {
                       
                       PreparedStatement pr = Model.ConnecDB.getConnection().prepareStatement("delete from SAN_PHAM where Ma_sp= ?");
                       pr.setString(1, masp);
                       pr.executeUpdate();
                       tensp=("");
                       mota = ("");
                       soluong =("");
                       dongia = Float.parseFloat("");
                       hinhanh = ("");
                       nhasx = ("");
                       maloai = ("");
                       response.sendRedirect("Manager_Product.jsp");
                   } catch (Exception ex) {
                         response.sendRedirect("Manager_Product.jsp");
                   }  break;
               }
           default:
               break;
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
