
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core(Jsp Standard Tag Library)</h1>
        <!--Manipulacion de variables-->
        <!--Definimos la variable -->
        <c:set var="nombre" value="Ernesto" />
        <!--Desplegamos el valor de  la variable -->
        Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con codigo Html:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/><!-- el esccape html sirve para que solo aparezca el hola sin los picos parentesis de la sintaxis-->
        <br/>
        <br/>
        <!--codigo condicionado con uso de IF-->
        <c:set var="bandera" value="true" />
        <c:if   test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!--codigo condicionado con uso de SWITCH-->
        <c:if test="${param.opcion != null}">
             <c:choose>
                   <c:when test="${param.opcion == 1}">
                         <br/>
                         Opcion 1 seleccionada 
                  </c:when>
                  <c:when test="${param.opcion == 2}">
                         <br/>
                         Opcion 2 seleccionada 
                  </c:when>
                  <c:otherwise>
                      <br/>
                      Opcion proporcionda desconocida: ${param.opcion}
                  </c:otherwise>     
             </c:choose>
        </c:if>
        <!--iteracion de un arreglo -->
        <%
           String nombres[] = {"Caludia", "Pedro", "Juan"};
           request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de nombres :
        <br/>
    <u1>
        <c:forEach var="persona" items="${nombres}">
            <li> ${persona}</li>
        </c:forEach>
    </u1>
    <br/>
    <a href="index.jsp">Regresar al inicio ></a>
    </body>
</html>
