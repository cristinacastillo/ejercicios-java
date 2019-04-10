<%-- 
    Document   : grabarModificado
    Created on : 26-mar-2019, 10:12:29
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
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Refugio</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros", "root", "");
            Statement s = conexion.createStatement();
            request.setCharacterEncoding("UTF-8");

            /*Consulta sql con los datos que van a ser modificados menos el codigo*/
            String modificacion = "UPDATE refugio SET "
                    + "Nombre='" + request.getParameter("Nombre")
                    + "',Raza='" + request.getParameter("Raza")
                    + "',Edad= " + Integer.valueOf(request.getParameter("Edad"))
                    + ",Peso_gr= " + Integer.valueOf(request.getParameter("Peso_gr"))
                    + ",Estatura_cm= " + Integer.valueOf(request.getParameter("Estatura_cm"))
                    + ",Adoptado= '" + request.getParameter("Adoptado")
                    + "' WHERE Codigo=" + Integer.valueOf(request.getParameter("Codigo"));
            s.execute(modificacion);
            out.println("Los datos del perro han sido actualizados correctamente.");

            conexion.close();
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Volver a la página principal</button>
        

</body>
</html>