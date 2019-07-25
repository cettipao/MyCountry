/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycountry;

/**
 *
 * @author cetti
 */
public class Propietario extends Persona{
    private int idPropietario;
    private String usuario;
    private String password;

    public Propietario(int idPropietario, String usuario, String password, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idPropietario = idPropietario;
        this.usuario = usuario;
        this.password = password;
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

    @Override
    public String toString() {
        return "Propietario{" + "idPropietario=" + idPropietario + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
}
