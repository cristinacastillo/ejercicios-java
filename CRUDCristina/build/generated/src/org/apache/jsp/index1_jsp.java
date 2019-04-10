package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <title>Refugio - Cristina Castillo Obregón</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br><br>\t\t\t\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading text-center\"><h2>Refugio</h2></div>\n");
      out.write("                ");

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros", "root", "");
                    Statement s = conexion.createStatement();
                    ResultSet listado = s.executeQuery("SELECT * FROM refugio");
                
      out.write("\n");
      out.write("\n");
      out.write("                <!--cabecera + formulario añadir -->\n");
      out.write("                <table class=\"table table-striped table-dark\">\n");
      out.write("                    <tr><th>Codigo</th><th>Nombre</th><th>Raza</th><th>Edad</th><th>Peso_gr</th><th>Estatura_cm</th><th>Adoptado</th></tr>\n");
      out.write("                    <form method=\"get\" action=\"anadirperro.jsp\">\n");
      out.write("                        <tr><td><input type=\"text\" name=\"Codigo\" size=\"5\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Nombre\" size=\"15\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Raza\" size=\"5\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Edad\" size=\"5\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Peso_gr\" size=\"8\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Estatura_cm\" size=8></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Adoptado\" size=\"3\"></td>\n");
      out.write("                            <td><button type=\"submit\" value=\"Añadir\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-paperclip\"></span> Añadir</button></td><td></td></tr>           \n");
      out.write("                    </form>\n");
      out.write("                    ");

                        /*buble mostrar listado*/
                        while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("Codigo") + "</td>");
                            out.println("<td>" + listado.getString("Nombre") + "</td>");
                            out.println("<td>" + listado.getString("Raza") + "</td>");
                            out.println("<td>" + listado.getString("Edad") + "</td>");
                            out.println("<td>" + listado.getString("Peso_gr") + "</td>");
                            out.println("<td>" + listado.getString("Estatura_cm") + "</td>");
                            out.println("<td>" + listado.getString("Adoptado") + "</td>");
                    
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"get\" action=\"modificar.jsp\">\n");
      out.write("                            <input type=\"hidden\" name=\"Codigo\" value=\"");
      out.print(listado.getString("Codigo"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Nombre\" value=\"");
      out.print(listado.getString("Nombre"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Raza\" value=\"");
      out.print(listado.getString("Raza"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Edad\" value=\"");
      out.print(listado.getString("Edad"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Peso_gr\" value=\"");
      out.print(listado.getString("Peso_gr"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Estatura_cm\" value=\"");
      out.print(listado.getString("Estatura_cm"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Adoptado\" value=\"");
      out.print(listado.getString("Adoptado"));
      out.write("\">\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-info\"><span class=\"glyphicon glyphicon-pencil\"></span> Modificar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"get\" action=\"borraperro.jsp\">\n");
      out.write("                            <input type=\"hidden\" name=\"Codigo\" value=\"");
      out.print(listado.getString("Codigo"));
      out.write("\"/>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span> Eliminar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td></tr>\n");
      out.write("                    ");

                        } // while   
                        conexion.close();
                    
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center\">&copy;Cristina Castillo Obregon</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
