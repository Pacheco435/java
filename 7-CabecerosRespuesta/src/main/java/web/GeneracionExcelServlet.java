package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet  extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    
    //indicamos el tipo de respuesta al navegador 
    response .setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
    //para un uso mas profesional de excel poi.apache.org
    
    //indicar al navegador que no guarde cache 
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-Store");
    response.setDateHeader("Expires", -1);
    
    //desplegamos informacion al cliente 
    PrintWriter out = response.getWriter();
    out.println("\tValores");//la \t sirve para movernos de celda en una hoja de calculo
    out.println("\t1");
    out.println("\t2");
    out.println("Total\t=SUMA(b2:b3)");
    out.close();
    
    
    }
    
}
