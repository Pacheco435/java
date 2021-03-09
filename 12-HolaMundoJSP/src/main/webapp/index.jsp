<%-- 
    Document   : index
    Created on : 9 mar. 2021, 09:29:47
    Author     : ASUS
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page  %> contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
    <u1>
        <li> <% out.print("Hola mundo con Scripplets"); %></li>
        <li>${"Hola mundo desde Expression Language(EL)"}</li>
        <li> <%= "Hola mundo con expesiones"  %> </li>
        <li> <c:out  value="HolaMundo con JSTL" /></li>
    </u1>
    </body>
</html>
