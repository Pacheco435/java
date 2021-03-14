<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables Iimplicitas</title>
    </head>
    <body>
        <h1>EL y Variables Iimplicitas</h1>
    <u1>
        <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
        <li>Navegador del Cliente: ${header["User-Agent"]}</li>
        <li>Id de la sesion: ${cookie.JSESSIONID.value} </li>
        <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
        <li>Valor Parametro: ${param.usuario}</li>
    </u1>
    <br/>
    <br/>
    <a href="index.jsp"> Regresar al inicio</a>
    </body>
</html>
