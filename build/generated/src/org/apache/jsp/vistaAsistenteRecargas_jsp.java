package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vistaAsistenteRecargas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Design Patterns</title>\n");
      out.write("        <link href=\"estilos/menuAsistenteRecargas.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <header id=\"main-header\">\n");
      out.write("\t\t\n");
      out.write("\t<span id=\"site-name\">Modulo Asistente de Recargas</span>\n");
      out.write("  \n");
      out.write("\t</header>\n");
      out.write("        \n");
      out.write("        <div id=\"contenedor\">\n");
      out.write("        <div id=\"cuadro1\">\n");
      out.write("            <form>\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"imagen/tarjetas.png\">\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"RECARGAR TARJETAS\" id=\"boton\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"cuadro2\">\n");
      out.write("            <form>\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"imagen/actualizar_cliente_1.png\">\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"ACTUALIZAR CLIENTES\" id=\"boton\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"cuadro3\">\n");
      out.write("            <form>\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"imagen/act_tarjetas.png\">\n");
      out.write("                </center>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"ACTUALIZAR TARJETAS\" id=\"boton\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
}
