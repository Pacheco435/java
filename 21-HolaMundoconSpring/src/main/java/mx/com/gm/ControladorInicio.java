package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")  //como esta en blanco ejecuta directamente el metodo   
    public String inicio (){
        log.info("ejecutando el controlador Rest");
        log.debug("mas detalledes del controlador");
        return "Hola mundo con Spring 2";
    }
}
