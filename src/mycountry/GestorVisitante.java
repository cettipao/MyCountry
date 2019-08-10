/*
 * GestorVisitantes contiene listas con visitantes
 * para su futura gestion. Es guardado en un archivo JSON
 */
package mycountry;

import java.util.ArrayList;

public class GestorVisitante {
    private ArrayList<Visitante> visitantesEsperadosEntrada;
    private ArrayList<Visitante> visitantesEsperadosSalida;
    private ArrayList<Visitante> visitantesTotales;

    public GestorVisitante() {
        this.visitantesEsperadosEntrada = new ArrayList<Visitante>();
        this.visitantesEsperadosSalida = new ArrayList<Visitante>();
        this.visitantesTotales = new ArrayList<Visitante>();

    }
    
    /*Agrega Visitante pasado por parametro a los visitantes esperados para entrada y visitantes totales
    * @param Visitante v 
    */
    public void addVisitanteEsperadoEntrada(Visitante v){
        this.visitantesEsperadosEntrada.add(v);
        this.visitantesTotales.add(v);
    }
    /*Agrega Visitante pasado por parametro a los visitantes esperados 
    * para salida y lo elimina de visitantes esperados entrada.
    * @param Visitante v 
    */
    public void addVisitanteEsperadoSalida(Visitante v){
        this.visitantesEsperadosSalida.add(v);
        this.visitantesEsperadosEntrada.remove(v);
    }

    public void removeVisitanteEsperadoSalida(Visitante v){
        this.visitantesEsperadosSalida.remove(v);
    }
    public ArrayList<Visitante> getVisitantesEsperadosEntrada() {
        return visitantesEsperadosEntrada;
    }

    public void setVisitantesEsperadosEntrada(ArrayList<Visitante> visitantesEsperadosEntrada) {
        this.visitantesEsperadosEntrada = visitantesEsperadosEntrada;
    }

    public ArrayList<Visitante> getVisitantesEsperadosSalida() {
        return visitantesEsperadosSalida;
    }

    public void setVisitantesEsperadosSalida(ArrayList<Visitante> visitantesEsperadosSalida) {
        this.visitantesEsperadosSalida = visitantesEsperadosSalida;
    }

    public ArrayList<Visitante> getVisitantesTotales() {
        return visitantesTotales;
    }

    public void setVisitantesTotales(ArrayList<Visitante> visitantesTotales) {
        this.visitantesTotales = visitantesTotales;
    }

    @Override
    public String toString() {
        return "GestorVisitante{" + "visitantesEsperadosEntrada=" + visitantesEsperadosEntrada + ", visitantesEsperadosSalida=" + visitantesEsperadosSalida + ", visitantesTotales=" + visitantesTotales + '}';
    }
    
    

    
    
    
}
