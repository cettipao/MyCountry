/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycountry;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author cetti
 */
public class Pasada {
    private String fecha;
    private Persona pers;
    private String greso;

    public Pasada(Persona p,String g){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        calendar = Calendar.getInstance();
        fecha = formatter.format(calendar.getTime());
        this.pers = p;
        this.greso = g;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String Fecha) {
        this.fecha = Fecha;
    }

    public Persona getPers() {
        return pers;
    }

    public void setPers(Persona pers) {
        this.pers = pers;
    }

    public String getGreso() {
        return greso;
    }

    public void setGreso(String greso) {
        this.greso = greso;
    }

    
    @Override
    public String toString() {
        return "Pasada{" + "Fecha=" + fecha + ", pers=" + pers + ", greso=" + greso + '}';
    }

    
    


   
    
    
    
}
