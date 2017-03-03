<%-- 
    Document   : Muahang
    Created on : Sep 30, 2016, 10:11:36 PM
    Author     : ASUS
--%>

<%@page import="Controller.LoginServlet"%>
<%@page import="Model.Product"%>
<%@page import="DAO.ProductDAO"%>
<%@page import="Model.Catalogue"%>
<%@page import="DAO.CalelogueDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
         
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
        <link href="CSS/1.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/2.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/3.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/4.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/5.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/6.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/7.css" rel="stylesheet" type="text/css"/>
        <link href="File/SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css"/>
        <script src="File/SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
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
           
                                
        <a href="Login.jsp#login" style="color:#F0F0E9" ><strong>Đăng nhập</strong></a> I
     <a href="Register.jsp#dangky" style="color:#F0F0E9"><strong>Đăng ký</strong></a>
     
         <ul>
     <li class="lidn" style="color: #F03;<%=LoginServlet.displayDN%>"  > <%=LoginServlet.userN%>
     <a style="color: #F00;<%=LoginServlet.displayDN%>" href="LogoutServlet">Đăng xuất</a>
                                </ul>
        </div>
        <div class="header_right_bottom">
          <ul id="MenuBar1" class="MenuBarHorizontal"> 
              <li><a href="MainPage.jsp#trangchu"><center><strong>TRANG CHỦ</strong></center></a></li>
             
                
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
             <li><a href="MainPage.jsp#Fanpage"><center><strong>FANPAGE</strong></center></a></li>
          </ul>
          
        </div>
        
    </div>
    
</div>


<div class="content">

<div id="trangchu">
	
        <div id="bosuutap">
<ul id="MenuBar1" class="MenuBarHorizontal"> 
   <center><hr /> <li><a href="#"><strong><span style="color:#363432">BỘ SƯU TẬP</span></strong></a></li></center></ul>
    </div>
   
   
    <div class="content_2">
     <hr />
     
    	   <div id="bigPic">
          
                <img src="Image/m.jpg" alt="" width="1024" height="500" />
                <img src="Image/h.jpg" alt="" width="1024" height="500" />
                <img src="Image/j.jpg" alt="" width="1024" height="500" />
                <img src="Image/k.jpg" alt="" width="1024" height="500" />
                <img src="Image/l.jpg" alt="" width="1024" height="500" />
                <img src="Image/z.jpg" alt="" width="1024" height="500" />
                <img src="Image/x.jpg" alt="" width="1024" height="500" />
                <img src="Image/c.jpg" alt="" width="1024" height="500" />
                <img src="Image/v.jpg" alt="" width="1024" height="500" />         
				
            
			</div>
			
			
			<ul id="thumbs">
          
				<li class='active' rel='1'><img src="Image/m.jpg" alt="" /></li>
				<li rel='2'><img src="Image/h.jpg" alt="" /></li>
				<li rel='3'><img src="Image/j.jpg" alt="" /></li>
				<li rel='4'><img src="Image/k.jpg" alt="" /></li>
				<li rel='5'><img src="Image/l.jpg" alt="" /></li>
				<li rel='6'><img src="Image/z.jpg" alt="" /></li>
				<li rel='7'><img src="Image/x.jpg" alt="" /></li>
				<li rel='8'><img src="Image/c.jpg" alt="" /></li>
				<li rel='9'><img src="Image/v.jpg" alt="" /></li>
				
			</ul>

            <div class='clearfix'></div>
            <div id='push'></div>
		<script type="text/javascript">
	var currentImage;
    var currentIndex = -1;
    var interval;
    function showImage(index){
        if(index < $('#bigPic img').length){
        	var indexImage = $('#bigPic img')[index]
            if(currentImage){   
            	if(currentImage != indexImage ){
                    $(currentImage).css('z-index',2);
             
                    $(currentImage).fadeOut(250, function() {
					   
					    $(this).css({'display':'none','z-index':1})
					});
                }
            }
            $(indexImage).css({'display':'block', 'opacity':1});
            currentImage = indexImage;
            currentIndex = index;
            $('#thumbs li').removeClass('active');
            $($('#thumbs li')[index]).addClass('active');
        }
    }
    
    function showNext(){
        var len = $('#bigPic img').length;
        var next = currentIndex < (len-1) ? currentIndex + 1 : 0;
        showImage(next);
    }
    
    var myTimer;
    
    $(document).ready(function() {
	    
		showNext(); //loads first image
        $('#thumbs li').bind('click',function(e){
        	var count = $(this).attr('rel');
        	showImage(parseInt(count)-1);
        });
	});	
	</script>		
    </div>
    
    <div class="content_3">
   <ul id="MenuBar1" class="MenuBarHorizontal"> 
       <center><hr /> <li><a href="#"><strong><span style="color: red">SẢN PHẨM</span></strong></a></li></center></ul>
       
    </div>
    <div class="tab-content" style="height: 500px">
							<div class="tab-pane fade active in" id="tshirt" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/k.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
                                                                            
									</div>
                                                                    
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/l.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/c.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
                                                                    
								</div>
							</div>
							
							<div class="tab-pane fade" id="blazers" >
								
								
								
							</div>
							
							<div class="tab-pane fade" id="sunglass" >
								
								<div class="col-sm-3">
									
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										
									</div>
								</div>
								<div class="col-sm-3">
									
								</div>
							</div>
							
							<div class="tab-pane fade" id="kids" >
								<div class="col-sm-3">
									
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="poloshirt" >
								<div class="col-sm-3">
									
								</div>
								
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/home/gallery3.jpg" alt="" />
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            
								
							</div>
						</div>
    <div class="tab-content" style="height: 500px">
							<div class="tab-pane fade active in" id="tshirt" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/k.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
                                                                            
									</div>
                                                                    
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/l.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/c.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
                                                                    
								</div>
							</div>
							
							<div class="tab-pane fade" id="blazers" >
								
								
								
							</div>
							
							<div class="tab-pane fade" id="sunglass" >
								
								<div class="col-sm-3">
									
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										
									</div>
								</div>
								<div class="col-sm-3">
									
								</div>
							</div>
							
							<div class="tab-pane fade" id="kids" >
								<div class="col-sm-3">
									
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="poloshirt" >
								<div class="col-sm-3">
									
								</div>
								
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/home/gallery3.jpg" alt="" />
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            
								
							</div>
						</div>
    <div class="product">
                    <%
                        for (Product p : productDAO.getListProductByCategory(Ma_loai)) {
                    %>
                    <div class="product1">
                        <center>	<div class="anh"><a href="<%=p.getHinhanh()%>" class="lightbox"><img src="<%=p.getHinhanh()%>" width="160" height="140" alt=""<%=p.getTensp()%>/></a></div></center>
   <div class="infomation">
                                                                                                      <center><span class="gia"><u>Giá:</u> <b><%=p.getDongia()%></b></span><br /> 
                                        <span class="maloai">Mã Loại :<%=p.getMaloai()%></span><br />  </a>
                                <span class="tensp">Tên Sản Phẩm : <%=p.getTensp()%></span><br />
                                <h7> Mô Tả : <%=p.getMota()%></h7><br/>
                                <h7> Số Lượng : <%=p.getSoluong()%> Cái</h7><br/>
                                <h7> Nhà Sản Xuất :<%=p.getNhasx()%></h7><br/>
                        </center>


                    </div>
                    <center><button><a href="#">Add to cart</a></button></center>
                </div>
                <%
                    }
                %>
            </div> 
</div>	
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
             <li><a href="#"><center><strong>FanPage </strong></center></a></li>
          </ul>
           <div class="footer2">
  <table width="500" border="0" height="150">
  <tr>
 <td> Câu hỏi thường gặp
Gửi yêu cầu hỗ trợ
Hướng dẫn đặt hàng
<p>Hướng dẫn thanh toán
Phương thức vận chuyển
Hướng dẫn đổi trả
Quy chế hoạt động Sàn TMĐT.</p>
  </td>
  </tr>
</table></div>
    <div class="footer3">
  <table width="500" border="0" height="150">
  <tr>
    <td>
Địa chỉ: 04 Phú Lộc 4
<p>Điện thoại: (84-8) 38251028 -  Fax: (84-8) 38251049.</p>
Quảng cáo: 0936009959 - Email: huyentttpd01794
<p>FPT Polytechnic/<td>
  </tr>
</table></div>
    </div>
    </div>
</div>
</div>
</div>

<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
</script>
    </body>
</html>
