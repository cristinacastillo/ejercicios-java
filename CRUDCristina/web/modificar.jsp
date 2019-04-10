<%-- 
    Document   : modificar
    Created on : 26-mar-2019, 10:10:15
    Author     : Cristina Castillo Obregón  
--%>

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

        <title>Modificar Perro </title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>
        <div class="container">
            <br><br>
            <div class="panel panel-info">
                <div class="panel-heading text-center">Modificación de datos de un perro</div>
                <form method="get" action="grabarModificado.jsp">
                    <div class="form-group"> 
                        <label>&nbsp;&nbsp;Código:&nbsp;</label><input type="text" size="5" name="socioID" value="<%= request.getParameter("Codigo")%>" readonly>
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Nombre:&nbsp;</label><input type="text" size="35" name="nombre" value="<%= request.getParameter("Nombre")%>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Raza:&nbsp;</label><input type="text" size="5" name="estatura" value="<%= request.getParameter("Raza")%>">
                        <label>&nbsp;&nbsp;Edad:&nbsp;</label><input type="text" size="5" name="edad" value="<%= request.getParameter("Edad")%>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Peso (Gr)&nbsp;</label><input type="text" name="localidad" size="20" value="<%= request.getParameter("Peso_gr")%>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Estatura (Cm)&nbsp;</label><input type="text" name="localidad" size="20" value="<%= request.getParameter("Estatura_cm")%>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Adoptado (Si / No)&nbsp;</label><input type="text" name="localidad" size="20" value="<%= request.getParameter("Adoptado")%>">
                    </div>
                    <hr>
                    &nbsp;&nbsp;<a href="index.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</a>
                    <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>Aceptar</button><br><br>
                </form>

            </div>
            <div class="text-center">&copy; Cristina Castillo Obregon</div>
        </div>

    </body>
</html>