/*
 * Propietario es un residente del barrio
 * que puede ingresar al barrio con una
 * tarjeta RFID
 */
package mycountry;

public class Propietario extends Persona{
    private int idPropietario;
    private String usuario;
    private String password;
    private String rfid;

    public Propietario(int idPropietario, String usuario, String password, String rfid,String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idPropietario = idPropietario;
        this.usuario = usuario;
        this.password = password;
        this.rfid = rfid;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
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

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
    

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + ", usuario=" + usuario + ", password=" + password + ", rfid=" + rfid + '}';
    }

    
}
