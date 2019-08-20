/*
 * FileManager realiza el manejo de los archivos JSON.
 * Convierte txt formato JSON a objetos GestorPropietario y
 * GestorVisitante y viceversa.
 */
package mycountry;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {
    private Gson gson;
    private GestorPropietario gestorPropietario;
    private GestorVisitante gestorVisitante;
    private GuardiaLogin guardiaLogin;
    

    public FileManager() {
        this.gson = new Gson();
    }
    /*
     * Convierte el String guardado en gestorPropietario.txt
     * en un objeto tipo GestorPropietario mediante el uso
     * de la libreria Gson
     */
    public void CrearGestorPropietario(){
        try{
        File archivo = new File("src/json/gestorPropietario.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        GestorPropietario obj = gson.fromJson(linea, GestorPropietario.class);
        gestorPropietario = obj;
        }
        catch(IOException e){
            System.out.println(e);
        } 
    }
    
    /*
     * Convierte el String guardado en gestorVisitante.txt
     * en un objeto tipo GestorVisitante mediante el uso
     * de la libreria Gson
     */
    public void CrearGestorVisitante(){
        try{
        File archivo = new File("src/json/gestorVisitante.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        GestorVisitante obj = gson.fromJson(linea, GestorVisitante.class);
        gestorVisitante = obj;
        }
        catch(IOException e){
            System.out.println(e);
        } 
    }
    /*
     * Convierte el String guardado en guardiaLogin.txt
     * en un objeto tipo GestorVisitante mediante el uso
     * de la libreria Gson
     */
    public void CrearGuardiaLogin(){
        try{
        File archivo = new File("src/json/guardiaLogin.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        GuardiaLogin obj = gson.fromJson(linea, GuardiaLogin.class);
        guardiaLogin = obj;
        }
        catch(IOException e){
            System.out.println(e);
        } 
    }
    
    
    /*
     * Guarda los cambios en el objeto por parametro
     * en el archivo correspondiente y lo actualiza
     * @param String obj
     */
    public void guardarObjeto(String obj){
        String path = "";
        Object objeto = new Object();
        switch (obj) {
            case "gestorPropietario":
                path = "src/json/gestorPropietario.txt";
                objeto = this.gestorPropietario;
                break;
            case "gestorVisitantes":
                path = "src/json/gestorVisitante.txt";
                objeto = this.gestorVisitante;
                break;
            case "guardiaLogin":
                path = "src/json/guardiaLogin.txt";
                objeto = this.guardiaLogin;
                break;
            default:
                break;
        }
        //Escritura de Archivos
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            //Conversion de clase usuario a String tipo JSON
            String JSON = gson.toJson(objeto);
            pw.println(JSON);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.CrearGestorVisitante();

    }
    
    
    
    public int getUltimoIdPropietario(){
        if(this.gestorPropietario.getPropietarios().isEmpty()){
            return 0;
        }
        return this.gestorPropietario.getPropietarios().get(this.gestorPropietario.getPropietarios().size()-1).getIdPropietario();
    }
    
    public int getUltimoIdVisitante(){
        if(this.gestorVisitante.getVisitantesEsperadosEntrada().isEmpty()){
            return -1;
        }
        return this.gestorVisitante.getVisitantesEsperadosEntrada().get(this.gestorVisitante.getVisitantesEsperadosEntrada().size()-1).getIdVisitante();
    }

    public GestorPropietario getGestorPropietario() {
        return gestorPropietario;
    }

    public GestorVisitante getGestorVisitante() {
        return gestorVisitante;
    }

    public GuardiaLogin getGuardiaLogin() {
        return guardiaLogin;
    }

    public void setGestorPropietario(GestorPropietario gestorPropietario) {
        this.gestorPropietario = gestorPropietario;
    }

    public void setGestorVisitante(GestorVisitante gestorVisitante) {
        this.gestorVisitante = gestorVisitante;
    }

    @Override
    public String toString() {
        return "FileManager{" + "gson=" + gson + ", gestorPropietario=" + gestorPropietario + ", gestorVisitante=" + gestorVisitante + ", guardiaLogin=" + guardiaLogin + '}';
    }
    
    
    
}
