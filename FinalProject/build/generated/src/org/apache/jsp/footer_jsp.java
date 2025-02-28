package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("           <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("   \n");
      out.write("   \n");
      out.write("  <footer class=\"footer\">\n");
      out.write("    <div class=\"footer-content\">\n");
      out.write("        <!-- Logo on the left -->\n");
      out.write("        <div class=\"footer-logo\">\n");
      out.write("            <img src=\"img/logo.png\" alt=\"Company Logo\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Navigation Bar in the Middle -->\n");
      out.write("        <nav class=\"footer-nav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Social Media Section on the Right -->\n");
      out.write("        <div class=\"footer-social\">\n");
      out.write("            <p>Follow us:</p>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"https://www.facebook.com\" target=\"_blank\"><img src=\"img/facebook.png\" alt=\"Facebook\"> Facebook</a></li>\n");
      out.write("                <li><a href=\"https://www.youtube.com\" target=\"_blank\"><img src=\"img/youtube.png\" alt=\"YouTube\"> YouTube</a></li>\n");
      out.write("                <li><a href=\"https://www.tiktok.com\" target=\"_blank\"><img src=\"img/tiktok.png\" alt=\"TikTok\"> TikTok</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Horizontal line -->\n");
      out.write("    <hr class=\"footer-divider\">\n");
      out.write("\n");
      out.write("    <!-- Email and Copyright Information -->\n");
      out.write("    <div class=\"footer-info\">\n");
      out.write("        <p>Email: <a href=\"mailto:support@yourcompany.com\">support@yourcompany.com</a></p>\n");
      out.write("        <p>&copy; 2025 Your Company. All rights reserved.</p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("    \n");
      out.write("\n");
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
}
