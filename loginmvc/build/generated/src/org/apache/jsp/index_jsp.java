package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Login/Sign-In</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("\n");
      out.write("    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"logmod\">\n");
      out.write("  <div class=\"logmod__wrapper\">\n");
      out.write("    <span class=\"logmod__close\">Close</span>\n");
      out.write("    <div class=\"logmod__container\">\n");
      out.write("      <ul class=\"logmod__tabs\">\n");
      out.write("        <li data-tabtar=\"lgm-2\"><a href=\"#\">Login</a></li>\n");
      out.write("        <li data-tabtar=\"lgm-1\"><a href=\"#\">Sign Up</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"logmod__tab-wrapper\">\n");
      out.write("      <div class=\"logmod__tab lgm-1\">\n");
      out.write("        <div class=\"logmod__heading\">\n");
      out.write("          <span class=\"logmod__heading-subtitle\">Enter your personal details <strong>to create an acount</strong></span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logmod__form\">\n");
      out.write("            <form accept-charset=\"utf-8\" action=\"Register\" class=\"simform\">\n");
      out.write("            <div class=\"sminputs\">\n");
      out.write("              <div class=\"input full\">\n");
      out.write("                <label class=\"string optional\" for=\"user-name\">Email*</label>\n");
      out.write("                <input class=\"string optional\" maxlength=\"255\" id=\"user-email\" placeholder=\"Email\" type=\"email\" size=\"50\" name=\"UserEmail\"/>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sminputs\">\n");
      out.write("              <div class=\"input string optional\">\n");
      out.write("                <label class=\"string optional\" for=\"user-pw\">Password *</label>\n");
      out.write("                <input class=\"string optional\" maxlength=\"255\" id=\"user-pw\" placeholder=\"Password\" type=\"text\" size=\"50\" name=\"password\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input string optional\">\n");
      out.write("                <label class=\"string optional\" for=\"user-pw-repeat\">Repeat password *</label>\n");
      out.write("                <input class=\"string optional\" maxlength=\"255\" id=\"user-pw-repeat\" placeholder=\"Repeat password\" type=\"text\" size=\"50\" name=\"repassword\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"simform__actions\">\n");
      out.write("             \n");
      out.write("              <input type=\"submit\" name=\"submit\" value=\"submit\"/>\n");
      out.write("              <span class=\"simform__actions-sidetext\">By creating an account you agree to our <a class=\"special\" href=\"#\" target=\"_blank\" role=\"link\">Terms & Privacy</a></span>\n");
      out.write("            </div> \n");
      out.write("          </form>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"logmod__alter\">\n");
      out.write("          <div class=\"logmod__alter-container\">\n");
      out.write("            <a href=\"#\" class=\"connect facebook\">\n");
      out.write("              <div class=\"connect__icon\">\n");
      out.write("                <i class=\"fa fa-facebook\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"connect__context\">\n");
      out.write("                <span>Create an account with <strong>Facebook</strong></span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("              \n");
      out.write("            <a href=\"#\" class=\"connect googleplus\">\n");
      out.write("              <div class=\"connect__icon\">\n");
      out.write("                <i class=\"fa fa-google-plus\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"connect__context\">\n");
      out.write("                <span>Create an account with <strong>Google+</strong></span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"logmod__tab lgm-2\">\n");
      out.write("        <div class=\"logmod__heading\">\n");
      out.write("          <span class=\"logmod__heading-subtitle\">Enter your email and password <strong>to sign in</strong></span>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"logmod__form\">\n");
      out.write("            <form accept-charset=\"utf-8\" action=\"NewServlet1\" class=\"simform\" method=\"post\">\n");
      out.write("            <div class=\"sminputs\">\n");
      out.write("              <div class=\"input full\">\n");
      out.write("                <label class=\"string optional\" for=\"user-name\">Email*</label>\n");
      out.write("                <input class=\"string optional\" name=\"username\" maxlength=\"255\" id=\"user-email\" placeholder=\"Email\" type=\"email\" size=\"50\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sminputs\">\n");
      out.write("              <div class=\"input full\">\n");
      out.write("                <label class=\"string optional\" for=\"user-pw\">Password *</label>\n");
      out.write("                <input class=\"string optional\" maxlength=\"255\" name=\"password\" id=\"user-pw\" placeholder=\"Password\" type=\"password\" size=\"50\" />\n");
      out.write("                \t\t\t\t\t\t<span class=\"hide-password\">Show</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"simform__actions\">\n");
      out.write("              \n");
      out.write("              <input class=\"sumbit\" type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("              <span class=\"simform__actions-sidetext\"><a class=\"special\" role=\"link\" href=\"#\">Forgot your password?<br>Click here</a></span>\n");
      out.write("            </div> \n");
      out.write("          </form>\n");
      out.write("        </div> \n");
      out.write("        <div class=\"logmod__alter\">\n");
      out.write("          <div class=\"logmod__alter-container\">\n");
      out.write("            <a href=\"#\" class=\"connect facebook\">\n");
      out.write("              <div class=\"connect__icon\">\n");
      out.write("                <i class=\"fa fa-facebook\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"connect__context\">\n");
      out.write("                <span>Sign in with <strong>Facebook</strong></span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"connect googleplus\">\n");
      out.write("              <div class=\"connect__icon\">\n");
      out.write("                <i class=\"fa fa-google-plus\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"connect__context\">\n");
      out.write("                <span>Sign in with <strong>Google+</strong></span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
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
}
