<%-- 
    Document   : index1
    Created on : 21-mar-2019, 10:30:01
    Author     : Cristina Castillo Obregón
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

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>Refugio - Cristina Castillo Obregón</title>
    </head>

    <body>
        <div class="container">
            <br><br>			
            <div class="panel panel-primary">
                <div class="panel-heading text-center"><h2>Refugio</h2></div>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros", "root", "");
                    Statement s = conexion.createStatement();
                    ResultSet listado = s.executeQuery("SELECT * FROM refugio");
                %>

                <!--cabecera + formulario añadir -->
                <table class="table table-striped table-dark">
                    <tr><th>Codigo</th><th>Nombre</th><th>Raza</th><th>Edad</th><th>Peso_gr</th><th>Estatura_cm</th><th>Adoptado</th></tr>
                    <form method="get" action="anadirperro.jsp">
                        <tr><td><input type="text" name="Codigo" size="5"></td>
                            <td><input type="text" name="Nombre" size="15"></td>
                            <td><input type="text" name="Raza" size="5"></td>
                            <td><input type="text" name="Edad" size="5"></td>
                            <td><input type="text" name="Peso_gr" size="8"></td>
                            <td><input type="text" name="Estatura_cm" size=8></td>
                            <td><input type="text" name="Adoptado" size="3"></td>
                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-paperclip"></span> Añadir</button></td><td></td></tr>           
                    </form>
                    <%
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
                    %>
                    <td>
                        <form method="get" action="modificar.jsp">
                            <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>">
                            <input type="hidden" name="Nombre" value="<%=listado.getString("Nombre")%>">
                            <input type="hidden" name="Raza" value="<%=listado.getString("Raza")%>">
                            <input type="hidden" name="Edad" value="<%=listado.getString("Edad")%>">
                            <input type="hidden" name="Peso_gr" value="<%=listado.getString("Peso_gr")%>">
                            <input type="hidden" name="Estatura_cm" value="<%=listado.getString("Estatura_cm")%>">
                            <input type="hidden" name="Adoptado" value="<%=listado.getString("Adoptado")%>">
                            <button type="submit"  class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <form method="get" action="borraperro.jsp">
                            <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        } // while   
                        conexion.close();
                    %>

                </table>
            </div>
            <div class="text-center">&copy;Cristina Castillo Obregon</div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>