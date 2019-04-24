<%-- 
    Document   : pienso
    Created on : 22-abr-2019, 16:48:21
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
                background-image: url('img/fondo.png');
            }
            h1{
                width: 600px; 
                margin: 0 auto; 
                margin-top: 15px; 
                background: white; 
                padding: 4px;
            }

            table{
                margin-left: 230px;
            }
        </style>

    </head>
    <body>
        <h1>Pienso</h1>

        <div id="wrapper">


            <!--CABECERA-->

            <table class="table table-striped tabla_estilo " style="background: white;">
                <thead>
                    <tr>
                        <th scope="col">CodigoPienso</th>
                        <th scope="col">Marca</th>
                        <th scope="col">Tipo</th>
                        <th scope="col">Unidades</th>
                        <th scope="col">Kg</th>
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
                        s.execute("INSERT INTO pienso VALUES (" + Integer.valueOf(request.getParameter("CodigoPienso"))
                                + ", '" + request.getParameter("Marca")
                                + "','" + (request.getParameter("Tipo"))
                                + "', " + Integer.valueOf(request.getParameter("Unidades"))
                                + ", " + Integer.valueOf(request.getParameter("Kg")) + ")");
                    } else if (estado.equals("borrar")) {
                        s.execute("DELETE FROM pienso WHERE CodigoPienso=" + request.getParameter("CodigoPienso"));
                    } else if (estado.equals("actualizar")) {

                        /*ACTUALIZAR DATOS RECOGIDOS*/
                        int CodigoPienso = Integer.parseInt(request.getParameter("CodigoPienso"));
                        String Marca = request.getParameter("Marca");
                        String Tipo = request.getParameter("Tipo");
                        int Unidades = Integer.parseInt(request.getParameter("Unidades"));
                        int Kg = Integer.parseInt(request.getParameter("Kg"));

                        s.execute("UPDATE pienso SET "
                                + "Marca='" + Marca + "',"
                                + "Tipo='" + Tipo + "',"
                                + "Unidades=" + Unidades + ","
                                + "Kg=" + Kg
                                + " WHERE CodigoPienso=" + Integer.parseInt(request.getParameter("CodigoPienso")));
                    }

                    String consulta;

                    if (estado.equals("editar")) {


                %>

                <tr>
                <form action="pienso.jsp">
                    <th scope="row"><input type="number" name="CodigoPienso" value="<%= request.getParameter("CodigoPienso")%>" readonly></td>
                    <td><input type="text" name="Marca" value="<%= request.getParameter("Marca")%>"></td>
                    <td><select name="Tipo" type="hidden">
                            <option selected value="<%= request.getParameter("Tipo")%>"><%= request.getParameter("Tipo")%></option>
                            <option value="Adulto">Adulto</option>
                            <option value="Cachorro">Cachorro</option>
                        </select>
                    </td>
                    <td><input type="number" name="Unidades" value="<%= request.getParameter("Unidades")%>"></td>
                    <td><input type="number" name="Kg" value="<%= request.getParameter("Kg")%>"></td>
                    <td><input type="hidden" name="estado" value="actualizar">
                        <button type="submit" name="enviar" class="btn btn-success" value="Actualizar" >Actualizar</button></td>
                </form>
                <form action="pienso.jsp">
                    <td><input type="hidden" name="estado" value="mostrar">
                        <button type="submit" name="cancelar" class="btn btn-danger" value="Cancelar" >Cancelar</button></td>
                </form>
                </tr>

                <%
                    consulta = "Select * from pienso where CodigoPienso<>" + request.getParameter("CodigoPienso");

                } else {

                %>
                <tr>
                <form action = "pienso.jsp"> 
                    <th scope=row><input type = "number" name = "CodigoPienso"> </th>
                    <td> <input type = "text" name = "Marca" ></td>
                    <td> <div class="form-group" ><!--DESPLEABLE-->

                            <select name="Tipo">
                                <option selected value="0">...</option>
                                <option value="Adulto">Adulto</option>
                                <option value="Cachorro">Cachorro</option>
                            </select>

                        </div></td>
                    <td> <input type = "number" name = "Unidades" ></td>
                    <td> <input type = "number" name = "Kg" ></td>
                    <td> <input type = "hidden" name = "estado" value = "aniadir">
                        <button type="submit" name="enviar" class="btn btn-success" value="Añadir" >Añadir</button> </td>
                    <td></td>

                </form>
                </tr>

                <%               consulta = "Select * from pienso";

                    }

                    ResultSet listado = s.executeQuery(consulta);

                    /*BUCLE PARA MOSTRAR EL LISTADO DE PERROS*/
                    while (listado.next()) {

                        out.print("<tr>");
                        out.print("<th>" + listado.getString("CodigoPienso") + "</th>");
                        out.print("<td>" + listado.getString("Marca") + "</td>");
                        out.print("<td>" + listado.getString("Tipo") + "</td>");
                        out.print("<td>" + listado.getString("Unidades") + "</td>");
                        out.print("<td>" + listado.getString("Kg") + "</td>");

                %>


                <td>
                    <form action="pienso.jsp" name="Baja">
                        <input type="hidden" name="CodigoPienso" value="<%=listado.getString("CodigoPienso")%>"/>
                        <input type="hidden" name="estado" value="borrar">
                        <button type="submit" name="baja" class="btn btn-danger" value="Baja" >Baja</button>
                    </form>
                </td>

                <td>
                    <form action="pienso.jsp" name="modificar" method="get">
                        <input type="hidden" name="CodigoPienso" value="<%=listado.getString("CodigoPienso")%>">
                        <input type="hidden" name="Marca" value="<%=listado.getString("Marca")%>">
                        <input type="hidden" name="Tipo" value="<%=listado.getString("Tipo")%>">
                        <input type="hidden" name="Unidades" value="<%=listado.getString("Unidades")%>">
                        <input type="hidden" name="Kg" value="<%=listado.getString("Kg")%>">

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




            <script>window.history.pushState({}, document.title, "/CRUDCristina" + "/pienso.jsp");</script>
    </body>
</html>
