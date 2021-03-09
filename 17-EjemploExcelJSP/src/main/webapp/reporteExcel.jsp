<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Conversiones,java.util.Date"  %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
   // response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo); este linea es cuando voy a imprimir el archivo
   response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);//aqui estamos declarando la excepcion que se esta dirigiendo al INF COMO JSP
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel </title>
    </head>
    <body>
        <h1>Reporte de Excel </h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>    
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sisntaxis basica de java </td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
            <tr>
                <td>2. Programacion con Java </td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
        </table>
    </body>
</html>
