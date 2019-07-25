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
public class GestorVisitante {
    private ArrayList<Visitante> visitantesEsperadosEntrada;
    private ArrayList<Visitante> visitantesEsperadosSalida;
    private ArrayList<Visitante> visitantesTotales;

    public GestorVisitante(ArrayList<Visitante> visitantesEsperadosEntrada, ArrayList<Visitante> visitantesEsperadosSalida, ArrayList<Visitante> visitantesTotales) {
        this.visitantesEsperadosEntrada = visitantesEsperadosEntrada;
        this.visitantesEsperadosSalida = visitantesEsperadosSalida;
        this.visitantesTotales = visitantesTotales;
    }
    
    public void addVisitanteEsperadoEntrada(Visitante v){
        this.visitantesEsperadosEntrada.add(v);
        this.visitantesTotales.add(v);
    }
    public void addVisitanteEsperadoSalida(Visitante v){
        this.visitantesEsperadosSalida.add(v);
        this.visitantesEsperadosEntrada.remove(v);
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
    

    
    
    
}
