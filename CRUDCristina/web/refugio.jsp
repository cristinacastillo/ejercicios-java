<%-- 
    Document   : refugio
    Created on : 01-abr-2019, 16:51:02
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
                background-image: url('img/fondo2.png');
            }
            h1{
                width: 600px; 
                margin: 0 auto; 
                margin-top: 15px; 
                background: white; 
                padding: 4px;
            }

            table{
                margin-left:60px;
            }
        </style>
    </head>
    <body>

        <h1>Refugio de Perros</h1>

        <div id="wrapper">


            <!--CABECERA-->

            <table class="table table-striped tabla_estilo " style="background: white;">
                <thead>
                    <tr>
                        <th scope="col">Codigo</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Raza</th>
                        <th scope="col">Edad</th>
                        <th scope="col">Peso_gr</th>
                        <th scope="col">Estatura_cm</th>
                        <th scope="col">Adoptado</th>
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
                        s.execute("INSERT INTO refugio VALUES (" + Integer.valueOf(request.getParameter("Codigo"))
                                + ", '" + request.getParameter("Nombre")
                                + "','" + (request.getParameter("Raza"))
                                + "', " + Integer.valueOf(request.getParameter("Edad"))
                                + ", " + Integer.valueOf(request.getParameter("Peso_gr"))
                                + ", " + Integer.valueOf(request.getParameter("Estatura_cm"))
                                + ", '" + request.getParameter("Adoptado")
                                + "')");
                    } else if (estado.equals("borrar")) {
                        s.execute("DELETE FROM refugio WHERE Codigo=" + request.getParameter("Codigo"));
                    } else if (estado.equals("actualizar")) {

                        /*ACTUALIZAR DATOS RECOGIDOS*/
                        int Codigo = Integer.parseInt(request.getParameter("Codigo"));
                        String Nombre = request.getParameter("Nombre");
                        String Raza = request.getParameter("Raza");
                        int Edad = Integer.parseInt(request.getParameter("Edad"));
                        int Peso_gr = Integer.parseInt(request.getParameter("Peso_gr"));
                        int Estatura_cm = Integer.parseInt(request.getParameter("Estatura_cm"));
                        String Adoptado = request.getParameter("Adoptado");

                        s.execute("UPDATE refugio SET "
                                + "Nombre='" + Nombre + "',"
                                + "Raza='" + Raza + "',"
                                + "Edad=" + Edad + ","
                                + "Peso_gr=" + Peso_gr + ","
                                + "Estatura_cm=" + Estatura_cm + ","
                                + "Adoptado='" + Adoptado + "'"
                                + " WHERE Codigo=" + Integer.parseInt(request.getParameter("Codigo")));
                    }

                    String consulta;

                    if (estado.equals("editar")) {


                %>

                <tr>
                <form action="refugio.jsp">
                    <th scope="row"><input type="number" name="Codigo" value="<%= request.getParameter("Codigo")%>" readonly></td>
                    <td><input type="text" name="Nombre" value="<%= request.getParameter("Nombre")%>"></td>
                    <td><input type="text" name="Raza" value="<%= request.getParameter("Raza")%>"></td>
                    <td><input type="number" name="Edad" value="<%= request.getParameter("Edad")%>"></td>
                    <td><input type="number" name="Peso_gr" value="<%= request.getParameter("Peso_gr")%>"></td>
                    <td><input type="number" name="Estatura_cm" value="<%= request.getParameter("Estatura_cm")%>"></td>
                    <td><div class="form-group" ><!--DESPLEABLE-->

                            <select  name="Adoptado" >
                                <option selected value="<%= request.getParameter("Adoptado")%>"><%= request.getParameter("Adoptado")%></option>
                                <option value="Si">Si</option>
                                <option value="No">No</option>
                            </select>
                            
                        </div></td>
                    <td><input type="hidden" name="estado" value="actualizar">
                        <button type="submit" name="enviar" class="btn btn-success" value="Actualizar" >Actualizar</button></td>
                </form>
                <form action="refugio.jsp">
                    <td><input type="hidden" name="estado" value="mostrar">
                        <button type="submit" name="cancelar" class="btn btn-danger" value="Cancelar" >Cancelar</button></td>
                </form>
                </tr>

                <%
                    consulta = "Select * from refugio where Codigo<>" + request.getParameter("Codigo");

                } else {

                %>
                <tr>
                <form action = "refugio.jsp"> 
                    <th scope=row><input type = "number" name = "Codigo"> </th>
                    <td> <input type = "text" name = "Nombre" ></td>
                    <td> <input type = "text" name = "Raza" ></td>
                    <td> <input type = "number" name = "Edad" ></td>
                    <td> <input type = "number" name = "Peso_gr" ></td>
                    <td> <input type = "number" name = "Estatura_cm" ></td>
                    <td> <div class="form-group" ><!--DESPLEABLE-->

                            <select  name="Adoptado" >
                                <option selected value="0">...</option>
                                <option value="Si">Si</option>
                                <option value="No">No</option>
                            </select>
                            
                        </div></td>
                    <td> <input type = "hidden" name = "estado" value = "aniadir"> 
                        <button type="submit" name="enviar" class="btn btn-success" value="Añadir" >Añadir</button>
                    </td>
                    <td></td>

                </form>
                </tr>

                <%               consulta = "Select * from refugio";

                    }

                    ResultSet listado = s.executeQuery(consulta);

                    /*BUCLE PARA MOSTRAR EL LISTADO DE PERROS*/
                    while (listado.next()) {

                        out.print("<tr>");
                        out.print("<th>" + listado.getString("Codigo") + "</th>");
                        out.print("<td>" + listado.getString("Nombre") + "</td>");
                        out.print("<td>" + listado.getString("Raza") + "</td>");
                        out.print("<td>" + listado.getString("Edad") + "</td>");
                        out.print("<td>" + listado.getString("Peso_gr") + "</td>");
                        out.print("<td>" + listado.getString("Estatura_cm") + "</td>");
                        out.print("<td>" + listado.getString("Adoptado") + "</td>");

                %>


                <td>
                    <form action="refugio.jsp" name="Baja">
                        <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>"/>
                        <input type="hidden" name="estado" value="borrar">
                        <button type="submit" name="baja" class="btn btn-danger" value="Baja" >Baja</button>

                    </form>
                </td>

                <td>
                    <form action="refugio.jsp" name="modificar" method="get">
                        <input type="hidden" name="Codigo" value="<%=listado.getString("Codigo")%>">
                        <input type="hidden" name="Nombre" value="<%=listado.getString("nombre")%>">
                        <input type="hidden" name="Raza" value="<%=listado.getString("Raza")%>">
                        <input type="hidden" name="Edad" value="<%=listado.getString("Edad")%>">
                        <input type="hidden" name="Peso_gr" value="<%=listado.getString("Peso_gr")%>">
                        <input type="hidden" name="Estatura_cm" value="<%=listado.getString("Estatura_cm")%>">
                        <input type="hidden" name="Adoptado" value="<%=listado.getString("Adoptado")%>">

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

        </div>



        <script>window.history.pushState({}, document.title, "/CRUDCristina" + "/refugio.jsp");</script>
    </body>
</html>



