package test;


import domain.Persona;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.client.ClientConfig;
        
public class PruebaResWS {
    public static void main(String[] args) {
        
        HttpAuthenticationFeature feature =  HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        Client cliente = ClientBuilder.newClient(clientConfig);
        
        WebTarget webTarget = cliente.target("http://localhost:8080/57-sga-jee-web-Seguridad/webservice").path("/personas");
        //Proporcionamos un id persona valido
        Persona persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
    }
    
   
}
