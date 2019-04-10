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
        <!-- scripts -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Refugio - Cristina Castillo Obregón</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros", "root", "");
            Statement s = conexion.createStatement();
            request.setCharacterEncoding("UTF-8");

            // Comprueba la existencia del codigo del perro 
            String consultaCodigo = "SELECT * FROM refugio WHERE Codigo="
                    + Integer.valueOf(request.getParameter("Codigo"));

            /*Almacena los datos del perro con el codigo introducido*/
            ResultSet codigoPerro = s.executeQuery(consultaCodigo);
            codigoPerro.last();

            /*si la fila no esta vacia, tiene datos ya almacenados entonces mostrara un mensaje*/
            if (codigoPerro.getRow() != 0) {
                out.println("Lo siento, este codigo ya está asignado a un perro "
                /* + request.getParameter("Codigo") + "."*/);

                /*si el codigo no esta introducido metemos los valores recogidos en una nueva*/
            } else {
                String aniadirPerro = "INSERT INTO refugio VALUES (" + Integer.valueOf(request.getParameter("Codigo"))
                        + ", '" + request.getParameter("Nombre")
                        + "','" + (request.getParameter("Raza"))
                        + "', " + Integer.valueOf(request.getParameter("Edad"))
                        + ", " + Integer.valueOf(request.getParameter("Peso_gr"))
                        + ", " + Integer.valueOf(request.getParameter("Estatura_cm"))
                        + ", '" + request.getParameter("Adoptado")
                        + "')";
                s.execute(aniadirPerro);
                out.println("El perro ha sido añadido de forma correcta.");
            }
            conexion.close();
        %>
        <br>

        <!--volver a la pagina principal-->
        <a href="index1.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Volver a la página principal</button>


</body>
</html>