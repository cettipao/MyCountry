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
public class Visitante extends Persona{
    private int idVisitante;

    public Visitante(int idVisitante, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idVisitante = idVisitante;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    @Override
    public String toString() {
        return "Visitante{" + "idVisitante=" + idVisitante + '}';
    }
    
    
}
