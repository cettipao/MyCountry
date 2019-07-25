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
abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String DNI;

    public Persona(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + '}';
    }
        
}
