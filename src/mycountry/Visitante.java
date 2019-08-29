/*
 * El Visitante es la clase que puede entrar
 * al barrio ya que fue invitado por un propietario.
 */
package mycountry;

public class Visitante extends Persona{
    
    private int idVisitante;
    private int idProp;
    
    public Visitante(int idVisitante, Propietario propietario,String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idVisitante = idVisitante;
        this.idProp = propietario.getIdPropietario();
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    @Override
    public String toString() {
        return "Visitante{" + "idVisitante=" + idVisitante + ", idProp=" + idProp + '}';
    }
    
    
    
    
    
}
