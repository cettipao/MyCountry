/*
 * GestorPropietarios contiene listas con propietarios
 * para su futura gestion. Es guardado en un archivo JSON
 */
package mycountry;

import java.util.ArrayList;

public class GestorPropietario {
    private ArrayList<Propietario> propietarios;

    public GestorPropietario() {
        this.propietarios = new ArrayList<Propietario>();
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
    public void removePropietario(Propietario p){
        this.propietarios.remove(p);
    }
}
