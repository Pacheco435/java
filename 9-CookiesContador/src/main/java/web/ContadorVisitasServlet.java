package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet  extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws IOException{
    
        //vamos a declarar una variable contador de tipo entero igual a 0
        int contador = 0;
        
        //revisar el arreglo de cookies si existe el contador visita 
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
        for(Cookie c: cookies){
                if(c.getName().equals("contadorVisitas")){
                   contador =Integer.parseInt( c.getValue());
                }
             }
        }
        //incrementamos el contador en 1 
        contador++;
        
        //agregamos la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        
        //La cookie se almacenara en el cliente durante 1 hora o 3600 segungos 
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente:" + contador);
        
    }
    
}
