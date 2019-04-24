package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adopciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/favicon.ico\" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css.css\"></link>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Refugio de Perros</title>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background-image: url('img/fondo4.png');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table{\n");
      out.write("                margin-left: 200px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"width: 600px; margin: 0 auto; margin-top: 15px; background: white; padding: 4px;\" >Pienso</h1>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--CABECERA-->\n");
      out.write("\n");
      out.write("            <table class=\"table table-striped tabla_estilo \" style=\"background: white;\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">CodigoAdopción</th>\n");
      out.write("                        <th scope=\"col\">Nombre Adoptante</th>\n");
      out.write("                        <th scope=\"col\">Codigo Perro</th>\n");
      out.write("                        <th scope=\"col\">Código Pienso</th>\n");
      out.write("                        <th scope=\"col\"></th>\n");
      out.write("                        <th scope=\"col\"></th>\n");
      out.write("                        <th scope=\"col\"></th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("\n");
      out.write("                ");


                    /*ACCESO A LA BBDD*/
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros", "root", "");
                    Statement s = conexion.createStatement();
                    String estado = request.getParameter("estado");
                    if (estado == null) {
                        estado = "mostrar";
                    }

                    /* out.print(estado);*/
                    if (estado.equals("aniadir")) {

                        /*RECOGER DATOS Y AÑADIR*/
                        s.execute("INSERT INTO pienso VALUES (" + Integer.valueOf(request.getParameter("CodigoPienso"))
                                + ", '" + request.getParameter("Marca")
                                + "','" + (request.getParameter("Tipo"))
                                + "', " + Integer.valueOf(request.getParameter("Unidades"))
                                + ", " + Integer.valueOf(request.getParameter("Kg")) + ")");
                    } else if (estado.equals("borrar")) {
                        s.execute("DELETE FROM pienso WHERE CodigoPienso=" + request.getParameter("CodigoPienso"));
                    } else if (estado.equals("actualizar")) {

                        /*ACTUALIZAR DATOS RECOGIDOS*/
                        int CodigoPienso = Integer.parseInt(request.getParameter("CodigoPienso"));
                        String Marca = request.getParameter("Marca");
                        String Tipo = request.getParameter("Tipo");
                        int Unidades = Integer.parseInt(request.getParameter("Unidades"));
                        int Kg = Integer.parseInt(request.getParameter("Kg"));

                        s.execute("UPDATE pienso SET "
                                + "Marca='" + Marca + "',"
                                + "Tipo='" + Tipo + "',"
                                + "Unidades=" + Unidades + ","
                                + "Kg=" + Kg
                                + " WHERE CodigoPienso=" + Integer.parseInt(request.getParameter("CodigoPienso")));
                    }

                    String consulta;

                    if (estado.equals("editar")) {


                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <form action=\"pienso.jsp\">\n");
      out.write("                    <th scope=\"row\"><input type=\"number\" name=\"CodigoPienso\" value=\"");
      out.print( request.getParameter("CodigoPienso"));
      out.write("\" readonly></td>\n");
      out.write("                    <td><input type=\"text\" name=\"Marca\" value=\"");
      out.print( request.getParameter("Marca"));
      out.write("\"></td>\n");
      out.write("                    <td><select name=\"Tipo\" type=\"hidden\">\n");
      out.write("                            <option selected value=\"");
      out.print( request.getParameter("Tipo"));
      out.write('"');
      out.write('>');
      out.print( request.getParameter("Tipo"));
      out.write("</option>\n");
      out.write("                            <option value=\"Adulto\">Adulto</option>\n");
      out.write("                            <option value=\"Cachorro\">Cachorro</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"number\" name=\"Unidades\" value=\"");
      out.print( request.getParameter("Unidades"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"number\" name=\"Kg\" value=\"");
      out.print( request.getParameter("Kg"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"estado\" value=\"actualizar\">\n");
      out.write("                        <button type=\"submit\" name=\"enviar\" class=\"btn btn-success\" value=\"Actualizar\" >Actualizar</button></td>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"pienso.jsp\">\n");
      out.write("                    <td><input type=\"hidden\" name=\"estado\" value=\"mostrar\">\n");
      out.write("                        <button type=\"submit\" name=\"cancelar\" class=\"btn btn-danger\" value=\"Cancelar\" >Cancelar</button></td>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    consulta = "Select * from pienso where CodigoPienso<>" + request.getParameter("CodigoPienso");

                } else {

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <form action = \"pienso.jsp\"> \n");
      out.write("                    <th scope=row><input type = \"number\" name = \"CodigoPienso\"> </th>\n");
      out.write("                    <td> <input type = \"text\" name = \"Marca\" ></td>\n");
      out.write("                    <td> <div class=\"form-group\" ><!--DESPLEABLE-->\n");
      out.write("\n");
      out.write("                            <select name=\"Tipo\">\n");
      out.write("                                <option selected value=\"0\">...</option>\n");
      out.write("                                <option value=\"Adulto\">Adulto</option>\n");
      out.write("                                <option value=\"Cachorro\">Cachorro</option>\n");
      out.write("                            </select>\n");
      out.write("\n");
      out.write("                        </div></td>\n");
      out.write("                    <td> <input type = \"number\" name = \"Unidades\" ></td>\n");
      out.write("                    <td> <input type = \"number\" name = \"Kg\" ></td>\n");
      out.write("                    <td> <input type = \"hidden\" name = \"estado\" value = \"aniadir\">\n");
      out.write("                        <button type=\"submit\" name=\"enviar\" class=\"btn btn-success\" value=\"Añadir\" >Añadir</button> </td>\n");
      out.write("                    <td></td>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
               consulta = "Select * from pienso";

                    }

                    ResultSet listado = s.executeQuery(consulta);

                    /*BUCLE PARA MOSTRAR EL LISTADO DE PERROS*/
                    while (listado.next()) {

                        out.print("<tr>");
                        out.print("<th>" + listado.getString("CodigoPienso") + "</th>");
                        out.print("<td>" + listado.getString("Marca") + "</td>");
                        out.print("<td>" + listado.getString("Tipo") + "</td>");
                        out.print("<td>" + listado.getString("Unidades") + "</td>");
                        out.print("<td>" + listado.getString("Kg") + "</td>");

                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"pienso.jsp\" name=\"Baja\">\n");
      out.write("                        <input type=\"hidden\" name=\"CodigoPienso\" value=\"");
      out.print(listado.getString("CodigoPienso"));
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"estado\" value=\"borrar\">\n");
      out.write("                        <button type=\"submit\" name=\"baja\" class=\"btn btn-danger\" value=\"Baja\" >Baja</button>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"pienso.jsp\" name=\"modificar\" method=\"get\">\n");
      out.write("                        <input type=\"hidden\" name=\"CodigoPienso\" value=\"");
      out.print(listado.getString("CodigoPienso"));
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Marca\" value=\"");
      out.print(listado.getString("Marca"));
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Tipo\" value=\"");
      out.print(listado.getString("Tipo"));
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Unidades\" value=\"");
      out.print(listado.getString("Unidades"));
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Kg\" value=\"");
      out.print(listado.getString("Kg"));
      out.write("\">\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" name=\"estado\" value=\"editar\">\n");
      out.write("                        <button type=\"submit\" name=\"modificar\" class=\"btn btn-info\" value=\"Modificar\" >Modificar</button>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");

                    }
                    conexion.close();
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <form action=\"index.html\">\n");
      out.write("                <button type=\"submit\" name=\"inicio\" class=\"btn btn-warning\" value=\"Inicio\" >Inicio</button>\n");
      out.write("            </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>window.history.pushState({}, document.title, \"/CRUDCristina\" + \"/pienso.jsp\");</script>\n");
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
