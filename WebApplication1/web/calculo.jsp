<%-- 
    Document   : calculo
    
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
        Los valores que me han llegado son:<br>

        <table>
            <%
                int numUsuario = Integer.parseInt(request.getParameter("numUsuario"));
                int numSeñalar = Integer.parseInt(request.getParameter("NumSeñalar"));
              

                for (int i = 0; i < 10; i++) {
                    out.println("<tr>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " <td></td>"
                            + " </tr>");
                }
            %>
        </table>
    </body>
</html>