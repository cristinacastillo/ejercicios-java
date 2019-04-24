<%-- 
    Document   : adopciones
    Created on : 23-abr-2019, 10:11:56
    Author     : crcs
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="conector.jsp"%>
<!DOCTYPE html>
<html>

    <head>
        <link rel="shortcut icon" href="img/favicon.ico" <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="css.css"></link>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Refugio de Perros</title>

        <style type="text/css">
            body{
                background-image: url('img/fondo4.png');
            }

            table{
                margin-left: 250px;
            }

            h1{
                width: 600px; 
                margin: 0 auto; 
                margin-top: 15px; 
                background: white; 
                padding: 4px;

            }
        </style>

    </head>
    <body>
        <h1>Adopciones</h1>

        <div id="wrapper">


            <!--CABECERA-->

            <table class="table table-striped tabla_estilo " style="background: white;">
                <thead>
                    <tr>
                        <th scope="col">Codigo</th>
                        <th scope="col">Nombre Adoptante</th>
                        <th scope="col">Codigo Perro</th>
                        <th scope="col">Código Pienso</th>
                        <th scope="col"></th>
                        <th scope="col"></th>

                    </tr>
                </thead>



                <% request.setCharacterEncoding("UTF-8");%>


                <%

                    /*ACCESO A LA BBDD*/
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection(nombrebbdd, usuariobbdd, password);
                    Statement s = conexion.createStatement();
                    String estado = request.getParameter("estado");
                    if (estado == null) {
                        estado = "mostrar";
                    }

                    /* out.print(estado);*/
                    
                    if (estado.equals("aniadir")) {

                        /*RECOGER DATOS Y AÑADIR*/
                        
                        s.execute("INSERT INTO adopciones VALUES (" + Integer.valueOf(request.getParameter("Codigo"))
                                + ", '" + request.getParameter("Nombre")
                                + "'," + Integer.valueOf(request.getParameter("CodigoPerro"))
                                + ", " + Integer.valueOf(request.getParameter("CodigoPienso"))
                                + ")");
                        
                    } else if (estado.equals("borrar")) {
                        
                        s.execute("DELETE FROM adopciones WHERE Codigo=" + request.getParameter("Codigo"));
                        
                    } else if (estado.equals("actualizar")) {
                        

                        /*ACTUALIZAR DATOS RECOGIDOS*/
                        
                        int Codigo = Integer.parseInt(request.getParameter("Codigo"));
                        String Nombre = request.getParameter("Nombre");
                        int CodigoPerro = Integer.valueOf(request.getParameter("CodigoPerro"));
                        int CodigoPienso = Integer.parseInt(request.getParameter("CodigoPienso"));

                        
                        s.execute("UPDATE adopciones SET "
                                + "Nombre='" + Nombre + "',"
                                + "CodigoPerro=" + CodigoPerro + ","
                                + "CodigoPienso=" + CodigoPienso
                                + " WHERE Codigo=" + Integer.parseInt(request.getParameter("Codigo")));
                    }

                    String consulta;

                    if (estado.equals("editar")) {


                %>

                <tr>
                <form action="adopciones.jsp">
                    <th scope="row"><input type="number" name="Codigo" value="<%= request.getParameter("Codigo")%>" readonly></td>
                    <td><input type="text" name="Nombre" value="<%= request.getParameter("Nombre")%>"></td>


                    <td> <%Connection conexion2 = DriverManager.getConnection(nombrebbdd, usuariobbdd, password);
                        Statement b = conexion2.createStatement();

                        ResultSet listado2 = b.executeQuery("SELECT * from refugio");
                        %><div class="form-group">

                            <select  name="CodigoPerro" >
                                <option selected value="<%= request.getParameter("CodigoPerro")%>"><%= request.getParameter("CodigoPerro")%></option>
                                <%  while (listado2.next()) {%>

                                <option value="<%= listado2.getString(1)%>"><%= listado2.getString(1)%> - <%= listado2.getString(2)%></option>
                                <% } %>
                            </select>
                        </div></td>


                    <td> <%Connection conexion1 = DriverManager.getConnection(nombrebbdd, usuariobbdd, password);
                        Statement a = conexion1.createStatement();

                        ResultSet listado1 = a.executeQuery("SELECT * from pienso");
                        %><div class="form-group">

                            <select  name="CodigoPienso" >
                                <option selected value="<%= request.getParameter("CodigoPienso")%>"><%= request.getParameter("CodigoPienso")%></option>
                                <%  while (listado1.next()) {%>

                                <option value="<%= listado1.getString(1)%>"><%= listado1.getString(1)%> - <%= listado1.getString(2)%> - <%= listado1.getString(3)%></option>
                                <% } %>
                            </select>
                        </div></td>



                    <td><input type="hidden" name="estado" value="actualizar">
                        <button type="submit" name="enviar" class="btn btn-success" value="Actualizar" >Actualizar</button></td>
                </form>
                <form action="adopciones.jsp">
                    <td><input type="hidden" name="estado" value="mostrar">
                        <button type="submit" name="cancelar" class="btn btn-danger" value="Cancelar" >Cancelar</button></td>
                </form>
                </tr>

                <%
                    consulta = "Select * from adopciones where Codigo<>" + request.getParameter("Codigo");

                } else {

                %>
                <tr>
                <form action = "adopciones.jsp"> 
                    <th scope=row><input type = "number" name = "Codigo"> </th>
                    <td> <input type = "text" name = "Nombre" ></td>
                    
                    <td> <%Connection conexion3 = DriverManager.getConnection(nombrebbdd, usuariobbdd, password);
                        Statement c = conexion3.createStatement();

                        ResultSet listado3 = c.executeQuery("SELECT * from refugio");
                        %><div class="form-group">

                            <select  name="CodigoPerro" >
                                <option disabled selected>Seleccione una opción</option>
                                <%  while (listado3.next()) {%>

                                <option value="<%= listado3.getString(1)%>"><%= listado3.getString(1)%> - <%= listado3.getString(2)%></option>
                                <% } %>
                            </select>
                        </div></td>
                
                
                    <td> <%Connection conexion4 = DriverManager.getConnection(nombrebbdd, usuariobbdd, password);
                        Statement d = conexion4.createStatement();

                        ResultSet listado4 = d.executeQuery("SELECT * from pienso");
                        %><div class="form-group">

                            <select  name="CodigoPienso" >
                                <option disabled selected>Seleccione una opción</option>
                                <%  while (listado4.next()) {%>

                                <option value="<%= listado4.getString(1)%>"><%= listado4.getString(1)%> - <%= listado4.getString(2)%> - <%= listado4.getString(3)%></option>
                                <% } %>
                            </select>
                        </div></td>
                        
                        
                    <td> <input type = "hidden" name = "estado" value = "aniadir">
                        <button type="submit" name="enviar" class="btn btn-success" value="Añadir" >Añadir</button> </td>
                    <td></td>

                </form>
                </tr>

                <%               consulta = "Select * from adopciones";

                    }

                    ResultSet listado = s.executeQuery(consulta);

                    /*BUCLE PARA MOSTRAR EL LISTADO DE PERROS*/
                    while (listado.next()) {

                        out.print("<tr>");
                        out.print("<th>" + listado.getString("Codigo") + "</th>");
                        out.print("<td>" + listado.getString("Nombre") + "</td>");
                        out.print("<td>" + listado.getString("CodigoPerro") + "</td>");
                        out.print("<td>" + listado.getString("CodigoPienso") + "</td>");


                %>


                <td>
                    <form action="adopciones.jsp" name="Baja">
                        <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>"/>
                        <input type="hidden" name="estado" value="borrar">
                        <button type="submit" name="baja" class="btn btn-danger" value="Baja" >Baja</button>
                    </form>
                </td>

                <td>
                    <form action="adopciones.jsp" name="modificar" method="get">
                        <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>">
                        <input type="hidden" name="Nombre" value="<%=listado.getString("Nombre")%>">
                        <input type="hidden" name="CodigoPerro" value="<%=listado.getString("CodigoPerro")%>">
                        <input type="hidden" name="CodigoPienso" value="<%=listado.getString("CodigoPienso")%>">


                        <input type="hidden" name="estado" value="editar">
                        <button type="submit" name="modificar" class="btn btn-info" value="Modificar" >Modificar</button>
                    </form>
                </td>

                <%
                    }
                    conexion.close();
                %>
            </table>

            <form action="index.html">
                <button type="submit" name="inicio" class="btn btn-warning" value="Inicio" >Inicio</button>
            </form> 




            <script>window.history.pushState({}, document.title, "/CRUDCristina" + "/adopciones.jsp");</script>
    </body>
</html>
