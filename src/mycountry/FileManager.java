/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycountry;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cetti
 */
public class FileManager {
    private Gson gson;

    public FileManager() {
        this.gson = new Gson();
    }
    
    public GestorPropietario CrearGestorPropietarioDesdeJson(String path){
        try{
        File archivo = new File(path);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        GestorPropietario obj = gson.fromJson(linea, GestorPropietario.class);
        return obj;
        }
        catch(IOException e){
            System.out.println(e);
            return null;
        } 
    }
    
    
}
