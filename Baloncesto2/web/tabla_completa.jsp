<%-- 
    Document   : index
    Created on : 19-mar-2019, 9:47:48
    Author     : crcs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Socios</title>
    </head>
    <body>
        <h1>Listado de Socios</h1>
        <table border =" 1">
        <%
            /*SIEMPRE HAY QUE PONER ESTAS TRE LINEAS PARA CONECTARSE A UNA BASE DE DATOS*/
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto", "root", "");
            Statement s = conexion.createStatement();
            
            ResultSet listado = s.executeQuery("SELECT * FROM socio");
            
            while (listado.next()) {
                
                out.println("<tr>");
                
                for (int i = 1; i <= 5; i++) {
                    
                    out.println("<td>" + listado.getString(i) + "</td>");
                }
                out.println("</tr>");
                
            }
            conexion.close();
        %>
    </body>
</html>