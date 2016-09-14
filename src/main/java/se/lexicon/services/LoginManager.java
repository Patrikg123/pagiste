import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * Created by Elev1 on 8/11/2016.
 */

//@ManagedBean
@Named
@SessionScoped
public class LoginManager implements Serializable{
    private static final long serialVersionUID = 858494292785483L;

    private String username;
    private String password;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {return password;}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String validateUsernamePassword () {
        // here we should call a function for login into database
        if (username.equals("incus") && password.equals("j_Password")) {
            return "success";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect login information", null));
        }
        return null;
    }
}


