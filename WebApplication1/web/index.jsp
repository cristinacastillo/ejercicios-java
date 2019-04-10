<%-- 
    Document   : index
    
    Author     : Cristina Castillo Obregón
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejercicio 1</h1>
        <%
            //out.println("<b>hola</b><br>");

            //int num
            //  for (int i=0; i<x; i++) {
            //   for (int j=1; j<=(i+1); j++ ) {
            //    out.print("*");
            //  }
            // out.println("<br>");
            // }

        %>

        <table border="1" cellpadding="1" cellspacing="1">
            <tr  bgcolor= "#00FFFF" >
                <td>Ene</td>
                <td>Feb</td>
                <td>Mar</td>

                <td bgcolor="red">Objeto1.1</td>
                <td bgcolor="green">Objeto2.1</td>
                <td bgcolor="orange">Objeto3.1</td>
            </tr>
            
            <tr  bgcolor= "#00FFFF" >
                <td>Ene</td>
                <td>Feb</td>
                <td>Mar</td>

                <td bgcolor="yellow">Objeto1.1</td>
                <td bgcolor="grey">Objeto2.1</td>
                <td bgcolor="blue">Objeto3.1</td>
            </tr>
            
            
        </table>

        <!-- action y poner con que pagina se relaciona -->
        <form method="POST" action="calculo.jsp">

            <!--tipo de informacion que se va a almacenar, nombre de la etiqueta y valor que se va a mostrar-->
            Cuantos numeros va a tener la tabla: <input type="number" name="Numeros" value="" /><br>
            Numero que quieres señalar  <input type="number" name="NumeroSeñalado" value="" /><br>
            <!--boton submit junto con mensaje que se va a enviar-->
            <input type="submit" value="Enviar para procesar" />      
        </form>

    </body>
</html>