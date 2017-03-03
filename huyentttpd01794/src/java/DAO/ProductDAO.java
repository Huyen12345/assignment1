/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ConnecDB;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ProductDAO {
   public ArrayList<Product> getListProductByCategory(String Ma_loai) throws SQLException {
        Connection connection = ConnecDB.getConnection();
        String sql = "SELECT * FROM SAN_PHAM WHERE Ma_loai = '" + Ma_loai + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setMasp(rs.getString("Ma_sp"));
            product.setTensp(rs.getString("Ten_sp"));
            product.setMota(rs.getString("Mo_ta"));
            product.setSoluong(rs.getInt("So_luong"));
            product.setDongia(rs.getInt("Don_gia"));
            product.setHinhanh(rs.getString("Hinh_anh"));
            product.setNhasx(rs.getString("Nha_sx"));
            product.setMaloai(rs.getString("Ma_loai"));
            list.add(product);
        }
        return list;
    }
   
     public ArrayList<Product> getListProduct() throws SQLException {
        Connection connection = ConnecDB.getConnection();
        String sql = "SELECT * FROM SAN_PHAM";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setMasp(rs.getString("Ma_sp"));
            product.setTensp(rs.getString("Ten_sp"));
            product.setMota(rs.getString("Mo_ta"));
            product.setSoluong(rs.getInt("So_luong"));
            product.setDongia(rs.getInt("Don_gia"));
            product.setHinhanh(rs.getString("Hinh_anh"));
            product.setNhasx(rs.getString("Nha_sx"));
            product.setMaloai(rs.getString("Ma_loai"));
            list.add(product);
        }
        return list;
    }
    //Thêm
  public boolean insert(Product p) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnection();
         String sql = "INSERT INTO SAN_PHAM VALUES(?,?,?,?,?,?,?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, p.getMasp());
         ps.setString(2, p.getTensp());
         ps.setString(3, p.getMota());
         ps.setInt(4, p.getSoluong());
         ps.setDouble(5, p.getDongia());
         ps.setString(6, p.getHinhanh());
         ps.setString(7, p.getNhasx());
         ps.setString(8, p.getMaloai());
         
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
}
  

public boolean update(Product p) throws SQLException {
    try {
         Connection connection = ConnecDB.getConnection();
         String sql = "UPDATE SAN_PHAM SET Ten_sp = ?, Mo_ta = ?,So_luong = ?,Don_gia = ?,Hinh_anh = ?,Nha_sx = ?,Ma_loai = ? WHERE Ma_sp = ?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(8, p.getMasp());
         ps.setString(1, p.getTensp());
         ps.setString(2, p.getMota());
         ps.setInt(3, p.getSoluong());
         ps.setDouble(4, p.getDongia());
         ps.setString(5, p.getHinhanh());
         ps.setString(6, p.getNhasx());
         ps.setString(7, p.getMaloai());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (SQLException e) {
         return false;
    }
    
}
public boolean delete(long category_id) throws SQLException {
    try {
        Connection connection = ConnecDB.getConnection();
        String sql = "DELETE FROM category WHERE Ma_sp = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, category_id);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (SQLException e) {
        return false;
    }
}
    public static void main(String[] args) throws SQLException{
        ProductDAO dao = new ProductDAO();    
        for (Product p : dao.getListProductByCategory("sp001")) {
            System.out.println(p.getMaloai()+"---"+p.getTensp());
        }
    }
    
}
