/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycountry;

import java.util.ArrayList;

/**
 *
 * @author cetti
 */
public class Seguimiento {

    private ArrayList<Pasada> pasadas;

    public Seguimiento() {
        this.pasadas = new ArrayList<Pasada>();
    }
    /* Agrega una pasada de un propietario
     * @param Persona p
     */
   public void addPasada(Persona p,String greso){
       this.pasadas.add(new Pasada(p, greso));
   }

    public ArrayList<Pasada> getPasadas() {
        return pasadas;
    }

    public void setPasadas(ArrayList<Pasada> pasadas) {
        this.pasadas = pasadas;
    }

    @Override
    public String toString() {
        return "Seguimiento{" + "pasadas=" + pasadas + '}';
    }
   
  

    
}
