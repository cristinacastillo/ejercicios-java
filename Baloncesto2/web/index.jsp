<%-- 
    Document   : index
    Created on : 19-mar-2019, 9:47:48
    Author     : crcs
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Socios</title>

    </head>
    <body>
        <h1>Listado de Socios</h1>

        <table border="1">
            <tr>
                <th>SocioID</th>
                <th>Nombre</th>
                <th>Estatura</th>
                <th>Edad</th>
                <th>Localidad</th>
            </tr>
            
            <% request.setCharacterEncoding("UTF-8"); %>
            <%
              
              
              
                            
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
        %>
                <tr>
                  <form action="index.jsp">
                    <td><input type="number" name="socioID" value="<%= request.getParameter("socioID")%>" readonly></td>
                    <td><input type="text" name="nombre" value="<%= request.getParameter("nombre")%>"></td>
                    <td><input type="number" name="estatura" value="<%= request.getParameter("estatura")%>"></td>
                    <td><input type="number" name="edad" value="<%= request.getParameter("edad")%>"></td>
                    <td><input type="text" name="localidad" value="<%= request.getParameter("localidad")%>"></td>
                    <td><input type="hidden" name="estado" value="actualizar">
                      <input type="submit" value="Actualizar" name="enviar"></td>
                  </form>
                  <form action="index.jsp">  
                    <td><input type="hidden" name="estado" value="mostrar">
                      <input type="submit" value="Cancelar"></td>
                  </from>       
                </tr>
                
        <%
                consulta = "SELECT * FROM socio WHERE socioID<>"+ request.getParameter("socioID");
                
              } else {  //presentar datos normalmente
        %>
                  <tr>
                    <form action="index.jsp">
                    
                        <td><input type="number" name="socioID"></td>
                        <td><input type="text" name="nombre"></td>
                        <td><input type="number" name="estatura"></td>
                        <td><input type="number" name="edad"></td>
                        <td><input type="text" name="localidad"></td>
                        <td><input type="hidden" name="estado" value="aniadir">
                          <input type="submit" value="Añadir" name="enviar"></td>
                    
                    </form>
                  </tr>
        <%
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
            %>

            <td>
                <form action="index.jsp" name="Baja">
                    <input type="hidden" name="socioID" value="<%=listado.getString("socioID")%>"/>
                    <input type="hidden" name="estado" value="borrar">
                    <input type="submit" name="baja" value="Baja">
                </form>
            </td>

            <td>
                <form action="index.jsp" name="modificar" method="get">
                    <input type="hidden" name="socioID" value="<%=listado.getString("socioID")%>">
                    <input type="hidden" name="nombre" value="<%=listado.getString("nombre")%>">
                    <input type="hidden" name="estatura" value="<%=listado.getString("estatura")%>">
                    <input type="hidden" name="edad" value="<%=listado.getString("edad")%>">
                    <input type="hidden" name="localidad" value="<%=listado.getString("localidad")%>">
                    <input type="hidden" name="estado" value="editar">
                    <input type="submit" name="modificar" value="Modificar">
                </form>
            </td>

            <%              
              }
              conexion.close();
            %>
        </table>
        <script>window.history.pushState({}, document.title, "/Baloncesto5" + "/index.jsp");</script>
    </body>
</html>