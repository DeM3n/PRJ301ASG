package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Register Page</title>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("           <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"loginpage\">\r\n");
      out.write("        <form action=\"\" method=\"post\">\r\n");
      out.write("            <h2>Register</h2>\r\n");
      out.write("            <div class=\"input-box\"> \r\n");
      out.write("                <input type=\"email\" placeholder=\"Gmail\" required=\"\"/>\r\n");
      out.write("                <i class='bx bxl-gmail'></i>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"input-box\"> \r\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" required />\r\n");
      out.write("                 <i class='bx bxs-user'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"input-box\">\r\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" required />\r\n");
      out.write("            <i class='bx bx-low-vision'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("             <div class=\"input-box\">\r\n");
      out.write("                <input type=\"password\" placeholder=\"Confirm Password\" required />\r\n");
      out.write("            <i class='bx bx-low-vision'></i>\r\n");
      out.write("                </div>\r\n");
      out.write("              <button type=\"submit\" class=\"button\">Submit</button>\r\n");
      out.write("               <div class=\"register-link\">\r\n");
      out.write("                     <p>Already have an account?\r\n");
      out.write("                         <a href=\"login.jsp\">Sign in</a> </p> \r\n");
      out.write("                </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
