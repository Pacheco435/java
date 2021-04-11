package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")  //como esta en blanco ejecuta directamente el metodo   
    public String inicio (Model model){
        
        var mensaje = "Mensaje con Thymeleaf";
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("44332211");
        
         var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("88776655");
        
        //var personas = new ArrayList();
        //personas.add(persona);
        //personas.add(personas);
        
        var personas = Arrays.asList(persona, persona2);//este metodo llama  a una lista 
       // var personas = new ArrayList();
        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo",saludo);
       // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
