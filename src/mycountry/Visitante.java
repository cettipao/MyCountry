/*
 * El Visitante es la clase que puede entrar
 * al barrio ya que fue invitado por un propietario.
 */
package mycountry;

public class Visitante extends Persona{
    
    private int idVisitante;
    private Propietario propietario;
    
    public Visitante(int idVisitante, Propietario propietario,String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idVisitante = idVisitante;
        this.propietario = propietario;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Visitante{" + "idVisitante=" + idVisitante + ", propietario=" + propietario + '}';
    }

    
    
    
}
