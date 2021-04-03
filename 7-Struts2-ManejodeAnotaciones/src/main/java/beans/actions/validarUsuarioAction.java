package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;



@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="login", type="redirectAction")
})
public class validarUsuarioAction extends ActionSupport {
    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;
    
    @Action("validarUsuario")
    public String execute() {
        if ("admin".equals(this.usuario)) {
            return SUCCESS;//SUCCESS es solo una cadena al igual que INPUT
        } else {
            return INPUT;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
