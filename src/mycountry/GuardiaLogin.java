/*
 * GuardiaLogin Guarda toda la informacion del login de la guardia
 * para ser guardado por Gson en un archivo Json
 */
package mycountry;

/**
 *
 * @author cetti
 */
public class GuardiaLogin {
    private String username;
    private String password;

    public GuardiaLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "GuardiaLogin{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
