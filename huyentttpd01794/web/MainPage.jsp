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
              <li><a href="MainPage.jsp#index"><center><strong>TRANG CHỦ</strong></center></a></li>
             
                
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
   <div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Category</h2>
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											Giày mới
										</a>
									</h4>
								</div>
								<div id="sportswear" class="panel-collapse collapse">
									<div class="panel-body">
										
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordian" href="#mens">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											xu hướng
										</a>
									</h4>
								</div>
								<div id="mens" class="panel-collapse collapse">
									<div class="panel-body">
										
									</div>
								</div>
							</div>
							
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordian" href="#womens">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											Bán chạy
										</a>
									</h4>
								</div>
								<div id="womens" class="panel-collapse collapse">
									
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="#">Giày nữ</a></h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="#">Giày nam</a></h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="#">Giày cao gót</a></h4>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title"><a href="#">Phụ kiện</a></h4>
								</div>
							</div>
						
						</div><!--/category-products-->
					
						<div class="brands_products"><!--brands_products-->
							<h2>Nhãn hiệu</h2>
							<div class="brands-name">
								<ul class="nav nav-pills nav-stacked">
									<li><a href="#"> <span class="pull-right">(50)</span>Vans</a></li>
									<li><a href="#"> <span class="pull-right">(56)</span>converse</a></li>
									<li><a href="#"> <span class="pull-right">(27)</span>Nike</a></li>
									<li><a href="#"> <span class="pull-right">(32)</span>Chuck Taylor</a></li>
									<li><a href="#"> <span class="pull-right">(5)</span>Reebok Freestyle</a></li>
									
								</ul>
							</div>
						</div><!--/brands_products-->
						
						<div class="price-range"><!--price-range-->
							<h2>Phạm vi giá</h2>
							<div class="well text-center">
								 <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
								 <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
							</div>
						</div><!--/price-range-->
						
						<div class="shipping text-center"><!--shipping-->
                                                   
						</div><!--/shipping-->
					
					</div>
				</div>
				
				<div class="col-sm-9 padding-right">
                                    <div class="features_items"style="height: 500px"><!--features_items-->
						<h2 class="title text-center">Features Items</h2>
                                                <div class="col-sm-4" style="height: 500px">
							<div class="product-image-wrapper">
								<div class="single-products">
										<div class="productinfo text-center">
                                                                                    <img src="Image/g1.jpg" alt=""/>
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>
										<div class="product-overlay">
											<div class="overlay-content">
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
										</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
                                                                            <img src="Image/g2.jpg" alt=""/>
										<h2>$56</h2>
										<p>Easy Polo Black Edition</p>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>
									</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
                                                                            <img src="Image/g3.jpg" alt=""/>
										<h2>$56</h2>
										<p>Easy Polo Black Edition</p>
										<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2>$56</h2>
											<p>Easy Polo Black Edition</p>
											<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
										</div>
									</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
							
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
										<li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
									</ul>
								</div>
							</div>
						</div>
						
					
						
					</div><!--features_items-->
					
					<div class="category-tab"><!--category-tab-->
						<div class="col-sm-12">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#tshirt" data-toggle="tab">Sản phẩm mới</a></li>
								<li><a href="#blazers" data-toggle="tab">xu hướng</a></li>
								<li><a href="#sunglass" data-toggle="tab">Phụ kiện</a></li>
								
							</ul>
						</div>
						<div class="tab-content">
							<div class="tab-pane fade active in" id="tshirt" >
                                                            <div class="col-sm-3"style="height: 300px">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g4.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            <div class="col-sm-3"style="height: 300px">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g5.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            <div class="col-sm-3"style="height: 300px">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g6.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            <div class="col-sm-3"style="height: 300px">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
                                                                                            <img src="Image/g7.jpg" alt=""/>
												<h2>$56</h2>
												<p>Easy Polo Black Edition</p>
												<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
							</div>
							
						
							
							
							
						</div>
					</div><!--/category-tab-->
					
					<div class="recommended_items"><!--recommended_items-->
						<h2 class="title text-center">Sale</h2>
						
						<div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
							<div class="carousel-inner">
								<div class="item active">	
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
                                                                                                    <img src="Image/g8.jpg" alt=""/>
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
                                                                                                    <img src="Image/g9.jpg" alt=""/>
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
                                                                                                    <img src="Image/g10.jpg" alt=""/>
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
								</div>
								<div class="item">	
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
                                                                                                    <img src="Image/g11.png" alt=""/>
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend2.jpg" alt="" />
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="images/home/recommend3.jpg" alt="" />
													<h2>$56</h2>
													<p>Easy Polo Black Edition</p>
													<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
												
											</div>
										</div>
									</div>
								</div>
							</div>
							 <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
								<i class="fa fa-angle-left"></i>
							  </a>
							  <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
								<i class="fa fa-angle-right"></i>
							  </a>			
						</div>
					</div><!--/recommended_items-->
					
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
