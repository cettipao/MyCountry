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

/**
 *
 * @author cetti
 */
public class FileManager {
    private Gson gson;
    private GestorPropietario gestorPropietario;
    private GestorVisitante gestorVisitante;
    

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
     * Guarda los cambios en el objeto gestorPropietario
     * en el archivo gestorPropieratio.txt y lo actualiza
     */
    public void GuardarGestorPropietario(){
        //Escritura de Archivos
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/json/gestorPropietario.txt");
            pw = new PrintWriter(fichero);

            //Conversion de clase usuario a String tipo JSON
            String JSON = gson.toJson(this.gestorPropietario);
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
        this.CrearGestorPropietario();

    }
    
    /*
     * Guarda los cambios en el objeto gestorVisitante
     * en el archivo gestorVisitante.txt y lo actualiza
     */
    public void GuardarGestorVisitante(){
        //Escritura de Archivos
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/json/gestorVisitante.txt");
            pw = new PrintWriter(fichero);

            //Conversion de clase usuario a String tipo JSON
            String JSON = gson.toJson(this.gestorVisitante);
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
        return this.gestorPropietario.getPropietarios().get(this.gestorPropietario.getPropietarios().size()-1).getIdPropietario();
    }
    
    public int getUltimoIdVisitante(){
        return this.gestorVisitante.getVisitantesTotales().get(this.gestorVisitante.getVisitantesTotales().size()-1).getIdVisitante();
    }
    
    
    
}
