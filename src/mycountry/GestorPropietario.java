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
public class GestorPropietario {
    private ArrayList<Propietario> propietarios;

    public GestorPropietario(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    public void addPropietario(Propietario p){
        this.propietarios.add(p);
    }    
}
