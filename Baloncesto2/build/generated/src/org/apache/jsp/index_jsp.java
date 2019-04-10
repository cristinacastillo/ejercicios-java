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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listado Socios</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Listado de Socios</h1>\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SocioID</th>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Estatura</th>\n");
      out.write("                <th>Edad</th>\n");
      out.write("                <th>Localidad</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("            ");

              
              
              
                            
              Class.forName("com.mysql.jdbc.Driver");
              Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");
              Statement s = conexion.createStatement();
              String estado = request.getParameter("estado");
              if (estado == null) {
                estado = "mostrar";
              }
              
              
              out.println(estado);
             
              if (estado.equals("aniadir")) {
                  
                int socioID = Integer.parseInt(request.getParameter("socioID"));
                String nombre = request.getParameter("nombre");
                int estatura = Integer.parseInt(request.getParameter("estatura"));
                int edad = Integer.parseInt(request.getParameter("edad"));
                String localidad = request.getParameter("localidad");
                s.execute("INSERT INTO socio VALUES ("+socioID+", '"+nombre+"', "+estatura+","+edad+",'"+localidad+"')");
              } else if (estado.equals("borrar")) {
                s.execute("DELETE FROM socio WHERE socioID=" + request.getParameter("socioID"));
              } else if (estado.equals("actualizar")) {
                  //ejectuar el update
                  
                  int socioID = Integer.parseInt(request.getParameter("socioID"));
                  String nombre = request.getParameter("nombre");
                  int estatura = Integer.parseInt(request.getParameter("estatura"));
                  int edad = Integer.parseInt(request.getParameter("edad"));
                  String localidad = request.getParameter("localidad");
                  s.execute("UPDATE socio SET "
                            + "nombre='"+nombre+"',"
                            + "estatura="+estatura+","
                            + "edad="+edad+","
                            + "localidad='"+localidad+"'"
                            + " WHERE socioID=" +Integer.parseInt(request.getParameter("socioID")));
              }
              String consulta;
              
              if (estado.equals("editar")) {
        
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                  <form action=\"index.jsp\">\n");
      out.write("                    <td><input type=\"number\" name=\"socioID\" value=\"");
      out.print( request.getParameter("socioID"));
      out.write("\" readonly></td>\n");
      out.write("                    <td><input type=\"text\" name=\"nombre\" value=\"");
      out.print( request.getParameter("nombre"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"number\" name=\"estatura\" value=\"");
      out.print( request.getParameter("estatura"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"number\" name=\"edad\" value=\"");
      out.print( request.getParameter("edad"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"text\" name=\"localidad\" value=\"");
      out.print( request.getParameter("localidad"));
      out.write("\"></td>\n");
      out.write("                    <td><input type=\"hidden\" name=\"estado\" value=\"actualizar\">\n");
      out.write("                      <input type=\"submit\" value=\"Actualizar\" name=\"enviar\"></td>\n");
      out.write("                  </form>\n");
      out.write("                  <form action=\"index.jsp\">  \n");
      out.write("                    <td><input type=\"hidden\" name=\"estado\" value=\"mostrar\">\n");
      out.write("                      <input type=\"submit\" value=\"Cancelar\"></td>\n");
      out.write("                  </from>       \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("        ");

                consulta = "SELECT * FROM socio WHERE socioID<>"+ request.getParameter("socioID");
                
              } else {  //presentar datos normalmente
        
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                    <form action=\"index.jsp\">\n");
      out.write("                    \n");
      out.write("                        <td><input type=\"number\" name=\"socioID\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"nombre\"></td>\n");
      out.write("                        <td><input type=\"number\" name=\"estatura\"></td>\n");
      out.write("                        <td><input type=\"number\" name=\"edad\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"localidad\"></td>\n");
      out.write("                        <td><input type=\"hidden\" name=\"estado\" value=\"aniadir\">\n");
      out.write("                          <input type=\"submit\" value=\"Añadir\" name=\"enviar\"></td>\n");
      out.write("                    \n");
      out.write("                    </form>\n");
      out.write("                  </tr>\n");
      out.write("        ");

                consulta = "SELECT * FROM socio";
              }
          
              
              
              
              ResultSet listado = s.executeQuery(consulta);
              while (listado.next()) {
                out.print("<tr>");
                out.print("<td>" + listado.getString("socioID") + "</td>");
                out.print("<td>" + listado.getString("nombre") + "</td>");
                out.print("<td>" + listado.getString("estatura") + "</td>");
                out.print("<td>" + listado.getString("edad") + "</td>");
                out.print("<td>" + listado.getString("localidad") + "</td>");
            
      out.write("\n");
      out.write("\n");
      out.write("            <td>\n");
      out.write("                <form action=\"index.jsp\" name=\"Baja\">\n");
      out.write("                    <input type=\"hidden\" name=\"socioID\" value=\"");
      out.print(listado.getString("socioID"));
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"estado\" value=\"borrar\">\n");
      out.write("                    <input type=\"submit\" name=\"baja\" value=\"Baja\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("\n");
      out.write("            <td>\n");
      out.write("                <form action=\"index.jsp\" name=\"modificar\" method=\"get\">\n");
      out.write("                    <input type=\"hidden\" name=\"socioID\" value=\"");
      out.print(listado.getString("socioID"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nombre"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"estatura\" value=\"");
      out.print(listado.getString("estatura"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"edad\" value=\"");
      out.print(listado.getString("edad"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"localidad\" value=\"");
      out.print(listado.getString("localidad"));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"estado\" value=\"editar\">\n");
      out.write("                    <input type=\"submit\" name=\"modificar\" value=\"Modificar\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("\n");
      out.write("            ");
              
              }
              conexion.close();
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <script>window.history.pushState({}, document.title, \"/Baloncesto5\" + \"/index.jsp\");</script>\n");
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
