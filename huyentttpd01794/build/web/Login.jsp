<%-- 
    Document   : Login
    Created on : Sep 30, 2016, 10:11:10 PM
    Author     : ASUS
--%>

<%@page import="Model.Catalogue"%>
<%@page import="DAO.CalelogueDAO"%>
<%@page import="Controller.LoginServlet"%>
<%@page import="DAO.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="CSS/Style.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/Style_Product.css" rel="stylesheet" type="text/css"/>
        <script src="CSS/boxover.js" type="text/javascript"></script>
        <script src="CSS/javascript.js" type="text/javascript"></script>
        <script src="CSS/jquery.js" type="text/javascript"></script>
        <script src="CSS/jv2.js" type="text/javascript"></script>
        <script src="CSS/jv3.js" type="text/javascript"></script>
        <script src="CSS/jv4.js" type="text/javascript"></script>
        <script src="CSS/jv_1.js" type="text/javascript"></script>
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/test_1.css" rel="stylesheet" type="text/css"/>
        <link href="File/SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css"/>
        <script src="File/SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
       
       <body  class="home">
            <%
            CalelogueDAO calelogueDAO = new CalelogueDAO();
        %>

        <%
            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("Catalogue") != null) {
                Ma_loai = request.getParameter("Catalogue");
            }
        %>

           
<div class="wrapper_all">
<div class="wrapper">


<div class="header">

    <div class="header_left"><img src="Image/banner.jpg" width="300" height="200" /></div>
  
    <div class="header_right">
    	<div class="header_right_top">
            
           
                                
        <a href="Login.jsp#login" style="color:#FFF" ><strong>Đăng nhập</strong></a> I
     <a href="Register.jsp#dangky" style="color:#FFF"><strong>Đăng ký</strong></a>
     
         <ul>
     <li class="lidn" style="color: #F03;<%=LoginServlet.displayDN%>"  > <%=LoginServlet.userN%>
     <a style="color: #F00;<%=LoginServlet.displayDN%>" href="LogoutServlet">Log Out</a>
                                </ul>
        </div>
        <div class="header_right_bottom">
          <ul id="MenuBar1" class="MenuBarHorizontal"> 
              
              <li><a href="MainPage.jsp#trangchu"><center><strong>Trang Chủ</strong></center></a></li>
             
                
             <li><a href="index.jsp#bosuutap"><center><strong>BỘ SƯU TẬP</strong></center></a>
                           </li>
             <li><a href="MainPage.jsp#sanpham"><center><strong>SẢN PHẨM</strong></center></a><ul>
                                        <%
                                            for (Catalogue c : calelogueDAO.getListCategory()) {
                                        %>
                                        <li><a href="MainPage.jsp?Catalogue=<%=c.getMaloai()%>"><%= c.getTenloai()%></a></li>

                                        <%
                                            }
                                        %>
                                    </ul>
</li>
             <li><a href="MainPage.jsp#lienhe"><center><strong>LIÊN HỆ</strong></center></a></li>
             
          </ul>
          
        </div>
        
    </div>
    
</div>
                                    
                                    
                                    <div class="dangky"  >
                                        
                                        
                                        <center></br></br></br></br></br>
                <form action="LoginServlet" method="get">
                    <h5 > Vui lòng đăng nhập tài khoản</h5></br>
                <p>Tài khoản: <input type="text" name="t1" value="" size="20" /> </p>
                <p>Mật khẩu: <input type="password" name="t2" value="" size="20" /> </p></br>
                <p> <input type="submit" value="Đăng nhập"  /> </p>
               
                </form>
            </center>
        </div>
 <div class="footer">
   
    <div class="footer_right">
    <div class="footer1_1">
      <ul id="MenuBar1" class="MenuBarHorizontal"> 
            <li><a href="#"><center><strong>Giới thiệu</strong></center></a></li>
             <li><a href="#"><center><strong>Trợ giúp</strong></center></a></li>
             <li><a href="#"><center><strong>Hộp Thư</strong></center></a></li>
             <li><a href="#"><center><strong>Giới Thiệu</strong></center></a></li>
             <li><a href="#"><center><strong>Trách Nhiệm</strong></center></a></li>
             <li><a href="#"><center><strong>Góp Ý </strong></center></a></li>
             
          </ul>
           <div class="footer2">
  <table width="500" border="0" height="150">
  <tr>
 <td> Shop MyHouse Địa Chỉ  Phú Lộc 4 Đà Nẵng 
<p>.Hân hạnh đón chào !</p>
  </td>
  </tr>
</table></div>
    <div class="footer3">
  <table width="500" border="0" height="150">
  <tr>
    <td>
Địa chỉ: 04 Phú Lộc 4 
<p>Điện thoại: (84-8) 38251028 -  Fax: (84-8) 38251049.</p>
Quảng cáo: 0936009959 - Email: huyentttpd01794@fpt.edu.vn

<p>FPT Polytechnic/<td>
  </tr>
</table></div>
    </div>
    </div>
</div>
</div>
</div>                          
    </body>
</html>
