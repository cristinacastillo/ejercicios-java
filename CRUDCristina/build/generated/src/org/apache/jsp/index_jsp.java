package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

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
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Refugio de Perros</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Refugio de Perros</h1>\n");
      out.write("\n");
      out.write("        <!--CABECERA-->\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">Codigo</th>\n");
      out.write("                    <th scope=\"col\">Nombre</th>\n");
      out.write("                    <th scope=\"col\">Raza</th>\n");
      out.write("                    <th scope=\"col\">Edad</th>\n");
      out.write("                    <th scope=\"col\">Peso_gr</th>\n");
      out.write("                    <th scope=\"col\">Estatura_cm</th>\n");
      out.write("                    <th scope=\"col\">Adoptado</th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("\n");
      out.write("            ");


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
                    s.execute("INSERT INTO refugio VALUES (" + Integer.valueOf(request.getParameter("Codigo"))
                            + ", '" + request.getParameter("Nombre")
                            + "','" + (request.getParameter("Raza"))
                            + "', " + Integer.valueOf(request.getParameter("Edad"))
                            + ", " + Integer.valueOf(request.getParameter("Peso_gr"))
                            + ", " + Integer.valueOf(request.getParameter("Estatura_cm"))
                            + ", '" + request.getParameter("Adoptado")
                            + "')");

                } else if (estado.equals("actualizar")) {

                    /*ACTUALIZAR DATOS RECOGIDOS*/
                    int Codigo = Integer.parseInt(request.getParameter("Codigo"));
                    String Nombre = request.getParameter("Nombre");
                    String Raza = request.getParameter("Raza");
                    int Edad = Integer.parseInt(request.getParameter("Edad"));
                    int Peso_gr = Integer.parseInt(request.getParameter("Peso_gr"));
                    int Estatura_cm = Integer.parseInt(request.getParameter("Estatura_cm"));
                    String Adoptado = request.getParameter("Adoptado");
                    
                    s.execute("UPDATE refugio SET "
                            + "Nombre='" + Nombre + "',"
                            + "Raza='" + Raza + "',"
                            + "Edad=" + Edad + ","
                            + "Peso_gr=" + Peso_gr + ","
                            + "Estatura_cm" + Estatura_cm + ","
                            + "Adoptado='" + Adoptado + "'"
                            + " WHERE Codigo=" + Integer.parseInt(request.getParameter("Codigo")));
                }

               String consulta;
               
                if (estado.equals("editar")) {


            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <form action=\"index.jsp\">\n");
      out.write("                <th scope=\"row\"><input type=\"number\" name=\"Codigo\" value=\"");
      out.print( request.getParameter("Codigo"));
      out.write("\" readonly></td>\n");
      out.write("                <td><input type=\"text\" name=\"Nombre\" value=\"");
      out.print( request.getParameter("Nombre"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"Raza\" value=\"");
      out.print( request.getParameter("Raza"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"Edad\" value=\"");
      out.print( request.getParameter("Edad"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"Peso_gr\" value=\"");
      out.print( request.getParameter("Peso_gr"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"Estatura_cm\" value=\"");
      out.print( request.getParameter("Estatra_cm"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"Adoptado\" value=\"");
      out.print( request.getParameter("Adoptdado"));
      out.write("\"></td>\n");
      out.write("                <td><input type=\"hidden\" name=\"estado\" value=\"actualizar\">\n");
      out.write("                    <input type=\"submit\" value=\"Actualizar\" name=\"enviar\"></td>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"index.jsp\">\n");
      out.write("                <td><input type=\"hidden\" name=\"estado\" value=\"mostrar\">\n");
      out.write("                    <input type=\"submit\" value=\"Cancelar\"></td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        ");

             consulta = "Select * from refugio where Codigo<>" + request.getParameter("Codigo");

        } else {

        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <form action = \"index.jsp\"> \n");
      out.write("            <th scope=row><input type = \"number\" name = \"Codigo\"> </th>\n");
      out.write("            <td> <input type = \"text\" name = \"Nombre\" ></td>\n");
      out.write("            <td> <input type = \"text\" name = \"Raza\" ></td>\n");
      out.write("            <td> <input type = \"number\" name = \"Edad\" ></td>\n");
      out.write("            <td> <input type = \"number\" name = \"Peso_gr\" ></td>\n");
      out.write("            <td> <input type = \"number\" name = \"Estatura_cm\" ></td>\n");
      out.write("            <td> <input type = \"text\" name = \"Adoptado\"></td>\n");
      out.write("            <td> <input type = \"hidden\" name = \"estado\" value = \"aniadir\">\n");
      out.write("                <input type = \"submit\" value = \"Añadir\" name = \"enviar\" > </td>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    ");
               consulta = "Select * from refugio";

        }

        ResultSet listado = s.executeQuery(consulta);

        /*BUCLE PARA MOSTRAR EL LISTADO DE PERROS*/
        while (listado.next()) {

            out.print("<tr>");
            out.print("<th>" + listado.getString("Codigo") + "</th>");
            out.print("<td>" + listado.getString("Nombre") + "</td>");
            out.print("<td>" + listado.getString("Raza") + "</td>");
            out.print("<td>" + listado.getString("Edad") + "</td>");
            out.print("<td>" + listado.getString("Peso_gr") + "</td>");
            out.print("<td>" + listado.getString("Estatura_cm") + "</td>");
            out.print("<td>" + listado.getString("Adoptado") + "</td>");

    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("        <form action=\"index.jsp\" name=\"Baja\">\n");
      out.write("            <input type=\"hidden\" name=\"Codigo\" value=\"");
      out.print(listado.getString("Codigo"));
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"estado\" value=\"borrar\">\n");
      out.write("            <input type=\"submit\" name=\"baja\" value=\"Baja\">\n");
      out.write("        </form>\n");
      out.write("    </td>\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("        <form action=\"index.jsp\" name=\"modificar\" method=\"get\">\n");
      out.write("            <input type=\"hidden\" name=\"Codigo\" value=\"");
      out.print(listado.getString("Codigo"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Nombre\" value=\"");
      out.print(listado.getString("nombre"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Raza\" value=\"");
      out.print(listado.getString("Raza"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Edad\" value=\"");
      out.print(listado.getString("Edad"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Peso_gr\" value=\"");
      out.print(listado.getString("Peso_gr"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Estatura_cm\" value=\"");
      out.print(listado.getString("Estatura_cm"));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"Adoptado\" value=\"");
      out.print(listado.getString("Adoptado"));
      out.write("\">\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"estado\" value=\"editar\">\n");
      out.write("            <input type=\"submit\" name=\"modificar\" value=\"Modificar\">\n");
      out.write("        </form>\n");
      out.write("    </td>\n");
      out.write("\n");
      out.write("    ");

        }
        conexion.close();
    
      out.write("\n");
      out.write("</table>\n");
      out.write("<script>window.history.pushState({}, document.title, \"/CRUDCristina\" + \"/index.jsp\");</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
