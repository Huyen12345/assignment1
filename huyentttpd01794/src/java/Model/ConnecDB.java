/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Product;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ConnecDB {
   Connection con;
    String dbname;
    String user;
    String pass;
    public  ConnecDB(String dbname, String user, String pass){
        this.dbname=dbname;
        this.user=user;
        this.pass=pass;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBH","sa","123");
        } catch (Exception e) {
        }
    }
     public static Connection getConnection(){
   Connection con = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLBH","sa","123");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return con;
   }

public  int Login(String user, String pass){ // tro ve 0 khi login sai, 1 la ad, 2 la khach hang
    try {
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from TAI_KHOAN where Username= '"+user+"' and Pass= '"+pass+"' ");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else 
                return 2;
        }else{
            return 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
public int insertProduct(Product obj){
    try{
        Statement st = con.createStatement();
        int i=st.executeUpdate("Insert into SAN_PHAM values('"+obj.getMasp()+"','"+obj.getTensp()+"','"+obj.getMota()+"','"+obj.getSoluong()+"','"+obj.getDongia()+"','"+obj.getHinhanh()+"','"+obj.getNhasx()+"','"+obj.getMaloai()+"')");
        st.close();
        return i;
    }catch(SQLException ex){
       return 0;
    }
}
public int insertAccount(Account ac){
    try{
        Statement st = con.createStatement();
        int i=st.executeUpdate("Insert into TAI_KHOAN values('"+ac.getUsername()+"','"+ac.getPass()+"','"+ac.getVaitro()+"','"+ac.getHoten()+"','"+ac.getDiachi()+"','"+ac.getEmail()+"','"+ac.getSdt()+"')");
        st.close();
        return i;
    }catch(SQLException ex){
       return 0;
    }
}




         
}
