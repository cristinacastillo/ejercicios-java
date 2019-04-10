<%-- 
    Document   : borraperro
    Created on : 26-mar-2019, 9:47:30
    Author     : Cristina Castillo Obregón
--%>

    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/perros","root", "");
      Statement s = conexion.createStatement();
      s.execute ("DELETE FROM refugio WHERE Codigo=" + request.getParameter("Codigo"));
      
      s.close();
    %>	
    <script>document.location = "index1.jsp"</script> 
  </body>
</html>