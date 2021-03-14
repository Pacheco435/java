package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos los parametros
        String accion = request.getParameter("accion");
        
        //2.Crear los Java Beans que vamos a utilozar en la aplicacion

        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSesion  = new Rectangulo(3,4);
        Rectangulo recAplicacion = new Rectangulo(5,6);
        
        //3.Agregamos el Java Bean en un alcance
        //Revisamos primero la accion proporcionada
        
        if("agregaVariables".equals(accion)){
        //alcance request
        request.setAttribute("rectanguloRequest",recRequest);
        //alcance sesion
        HttpSession sesion =request.getSession();
        sesion.setAttribute("rectanguloSesion", recSesion);
        
        //alcance de aplicacion
        ServletContext  application = this.getServletContext();
        application.setAttribute("rectanguloAplicacion", recAplicacion);
        
        //agregamos un mensaje 
        request.setAttribute("mensaje","Las variables fueron agregadas");
        
        //4.redirecionamos al jsp de index
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        }  
        else if("listarVariables".equals(accion)){
        //4.redireccionamos al JSP que despega las variables 
        request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }    
        else{
         //4.redirecionamos a la pagina de inicio
         request.setAttribute("mensaje", "Acion no proporcionada o desconocida");
         request.getRequestDispatcher("index.jsp").forward(request, response);
        //esta linia no agregaria informacion al JSP ya que no propaga los objetos request y response 
        // response.sendRedirect("index.jsp");
        }
       
    }
    
}

