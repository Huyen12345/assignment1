/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Catalogue;
import Model.ConnecDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CalelogueDAO {
 public ArrayList<Catalogue> getListCategory() {
        Connection con = ConnecDB.getConnection();
        String sql = "SELECT * FROM LOAI_SP";
        ArrayList<Catalogue> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Catalogue category = new Catalogue();
                category.setMaloai(rs.getString("Ma_loai"));
                category.setTenloai(rs.getString("Loai_sp"));
                list.add(category);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
   //Thêm
  public boolean insert(Catalogue c) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnection();
         String sql = "INSERT INTO LOAI_SP VALUES(?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getMaloai());
         ps.setString(2, c.getTenloai());
         return ps.executeUpdate()==1;
    } catch (SQLException e) {
         return false;
    }
}
  

public boolean update(Catalogue c) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnection();
         String sql = "UPDATE LOAI_SP SET Loai_sp = ? WHERE Ma_loai = ?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getMaloai());
         ps.setString(2, c.getTenloai());
         
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
}

public boolean delete(String Maloai) throws SQLException {
    try {
        Connection connection = ConnecDB.getConnection();
        String sql = "DELETE FROM LOAI_SP WHERE Ma_sp = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, Maloai);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (SQLException e) {
        return false;
    }
}
    public static void main(String[] args) {
     CalelogueDAO dao = new CalelogueDAO();
        for (Catalogue ds : dao.getListCategory()) {
            System.out.println(ds.getMaloai()+"--"+ds.getTenloai());
        }
    }
}