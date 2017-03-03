package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;
import DAO.CalelogueDAO;
import DAO.ProductDAO;
import Controller.LoginServlet;
import Controller.LoginServlet;
import Model.Catalogue;

public final class Manager_005fProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          \n");
      out.write("        <link href=\"CSS/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/Style_Product.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"CSS/boxover.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv4.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv_1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/test_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"File/SpryAssets/SpryMenuBarHorizontal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"File/SpryAssets/SpryMenuBar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("       \n");
      out.write("       <body  class=\"home\">\n");
      out.write("            ");

            CalelogueDAO calelogueDAO = new CalelogueDAO();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("Catalogue") != null) {
                Ma_loai = request.getParameter("Catalogue");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("<div class=\"wrapper_all\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("\n");
      out.write("    <div class=\"header_left\"><img src=\"Image/logo 2.jpg\" width=\"300\" height=\"200\" /></div>\n");
      out.write("    <div class=\"header_right\">\n");
      out.write("    \t<div class=\"header_right_top\">\n");
      out.write("           \n");
      out.write("                                \n");
      out.write("        <a href=\"Login.jsp#login\" style=\"color:#F03\" ><strong>Đăng nhập</strong></a> I\n");
      out.write("     <a href=\"Register.jsp#dangky\" style=\"color:#F03\"><strong>Đăng ký</strong></a>\n");
      out.write("     \n");
      out.write("         <ul>\n");
      out.write("     <li class=\"lidn\" style=\"color: #F03;");
      out.print(LoginServlet.displayDN);
      out.write("\"  > ");
      out.print(LoginServlet.userN);
      out.write("\n");
      out.write("     <a style=\"color: #F00;");
      out.print(LoginServlet.displayDN);
      out.write("\" href=\"LogoutServlet\">Đăng xuất</a>\n");
      out.write("                                </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header_right_bottom\">\n");
      out.write("          <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("              <li><a href=\"MainPage.jsp#trangchu\"><center><strong>TRANG CHỦ</strong></center></a></li>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("             <li><a href=\"MainPage.jsp#bosuutap\"><center><strong>BỘ SƯU TẬP</strong></center></a>\n");
      out.write("                           </li>\n");
      out.write("             <li><a href=\"MainPage.jsp#sanpham\"><center><strong>SẢN PHẨM</strong></center></a><ul>\n");
      out.write("                                        ");

                                            for (Catalogue c : calelogueDAO.getListCategory()) {
                                        
      out.write("\n");
      out.write("                                        <li><a href=\"MainPage.jsp?Catalogue=");
      out.print(c.getMaloai());
      out.write('"');
      out.write('>');
      out.print( c.getTenloai());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("</li>\n");
      out.write("             <li><a href=\"MainPage.jsp#lienhe\"><center><strong>LIÊN HỆ</strong></center></a></li>\n");
      out.write("             <li><a href=\"MainPage.jsp#Fanpage\"><center><strong>FANPAGE</strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div><div class=\"dangky\">\n");
      out.write("             ");

            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            
      out.write("\n");
      out.write("        <script>\n");
      out.write("                        function ac0() {\n");
      out.write("                            var a0 = 0;\n");
      out.write("                            document.getElementById(\"ac\").value = a0;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        function ac1() {\n");
      out.write("                            var a1 = 1;\n");
      out.write("                            document.getElementById(\"ac\").value = a1;\n");
      out.write("                        }\n");
      out.write("                        function ac2() {\n");
      out.write("                            var a2 = 2;\n");
      out.write("                            document.getElementById(\"ac\").value = a2;\n");
      out.write("                        }\n");
      out.write("                        function ac3() {\n");
      out.write("                            var a3 = 3;\n");
      out.write("                            document.getElementById(\"ac\").value = a3;\n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                    </script>\n");
      out.write("                    <center></br></br></br>\n");
      out.write("       <form action=\"getProduct\" method=\"post\">\n");
      out.write("           <center>\n");
      out.write("               \n");
      out.write("               <div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"product-details\"><!--product-details-->\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-5\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-product\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"file:///C|/Users/PC/Desktop/Eshopper/images/home/van.jpg\" >\n");
      out.write("\t\t\t\t\t\t\t\t<h3>ZOOM</h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"similar-product\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t  <!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <a href=\"\"><img src=\"file:///C|/Users/PC/Desktop/Eshopper/images/product-details/vans.jpg\" width=\"80\" height=\"80\" ></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <a href=\"\"><img src=\"file:///C|/Users/PC/Desktop/Eshopper/images/product-details/vansss.jpg\" width=\"80\" height=\"80\"></a>\n");
      out.write("                                         <img src=\"file:///C|/Users/PC/Desktop/Eshopper/images/product-details/giay-the-thao-vans-f01-003-1.jpg\" width=\"80\" height=\"80\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t  <!-- Controls -->\n");
      out.write("\t\t\t\t\t\t\t\t  <a class=\"left item-control\" href=\"#similar-product\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t\t\t  <a class=\"right item-control\" href=\"#similar-product\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-7\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-information\"><!--/product-information-->\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-details/new.jpg\" class=\"newarrival\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Giầy thể thao Vans 248</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Web ID: 1089772</p>\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/product-details/rating.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>250 000 đ</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Quantity:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"3\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-fefault cart\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\tAdd to cart\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t<p><b>Loại:</b> Giày thể thao </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><b>Điêu kiện:</b> New</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><b>Màu sắc:</b> Nhiều màu</p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"images/product-details/share.png\" class=\"share img-responsive\"  alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div><!--/product-information-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!--/product-details-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!--/category-tab-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!--/recommended_items-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t<table width=\"95%\" border=\"1\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr><td><b>Mã Sản Phẩm</b></td><td>\n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("                                <input type=\"type\" class=\"\" name=\"Ma_sp\" id=\"maloai\" name=\"Ma_sp\" value=\"");
      out.print(Model.getProduct.masp);
      out.write("\"><input type=\"submit\" value=\"Tìm\" onclick=\"ac0()\"></td>\n");
      out.write("\t\t\t\t\n");
      out.write("                             \n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Tên Sản Phẩm</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Ten_sp\" value=\"");
      out.print(Model.getProduct.tensp);
      out.write("\"</td></tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <tr><td><b>Mô Tả</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Mo_ta\" value=\"");
      out.print(Model.getProduct.mota);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t <tr><td><b>Số Lượng</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"So_luong\" value=\"");
      out.print(Model.getProduct.soluong);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Đơn Giá</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Don_gia\" value=\"");
      out.print(Model.getProduct.dongia);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Hình Ảnh</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Hinh_anh\" value=\"");
      out.print(Model.getProduct.hinhanh);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Nhà Sản Xuất</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Nha_sx\" value=\"");
      out.print(Model.getProduct.nhasx);
      out.write("\"</td></tr>\t\n");
      out.write("                          <tr><td><b>Mã Loại</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Ma_loai\" value=\"");
      out.print(Model.getProduct.maloai);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t<tr><td>\n");
      out.write("                               \n");
      out.write("                             <td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"ac2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"ac3()\"></td>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                </table>\n");
      out.write("                        </center> \n");
      out.write("       </form></center></div>\n");
      out.write("                      \n");
      out.write("       <div class=\"footer\">\n");
      out.write("   \n");
      out.write("    <div class=\"footer_right\">\n");
      out.write("    <div class=\"footer1_1\">\n");
      out.write("      <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("            <li><a href=\"#\"><center><strong>Giới thiệu</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Trợ giúp</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Hộp Thư</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Giới Thiệu</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Trách Nhiệm</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Góp Ý </strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>FanPage </strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("           <div class=\"footer2\">\n");
      out.write("  <table width=\"500\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write(" <td> Bản quyền và phát triển bởi Công ty FPT. Chịu trách nhiệm nội dung: FPT PolyTechnic- Trưởng chi nhánh phía Nam Đà Nẵng - Phó giám đốc Công ty Đông Ri.\n");
      out.write("<p>Giấy phép số 29/GP-TTĐT do Bộ Thông tin và Truyền thông cấp ngày 11/02/2010 và giấy phép số 88/GP-TTĐT của Sở Thông tin và Truyền thông TP.Đà Nẵng cấp ngày 28/7/2015.</p>\n");
      out.write("  </td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    <div class=\"footer3\">\n");
      out.write("  <table width=\"500\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("Địa chỉ: 137 Nguyễn Thị Thập\n");
      out.write("<p>Điện thoại: (84-8) 38251028 -  Fax: (84-8) 38251049.</p>\n");
      out.write("Quảng cáo: 0936009959 - Email: Tranhoai09031997@gmail.com\n");
      out.write("<p>FPT Polytechnic/<td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
