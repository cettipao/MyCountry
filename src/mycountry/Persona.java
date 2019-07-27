/*
 * La clase persona es una clase abstracta 
 * que sera heredada por Visitante y Propietario.
 * Incluye atributos basicos de una persona y ningun
 * comportamiento en especial.
 */
package mycountry;

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
