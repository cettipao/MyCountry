/*
 * Proyecto Programacion: MyCountry
 * Profesores: Nicolas Fanin, Martín Navarro y Jeremías Antequera. 
 * Cetti Paolo y Ninci Matias.
 */
package mycountry;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MyCountry {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
    
}

//Primer uso de GSON
/*
FileManager fileManager = new FileManager();
        Gson gson = new Gson();
       //Creo Gestor de Propietario
        GestorPropietario gp = new GestorPropietario();
        //Creo Propietarios
        Propietario propietario1 = new Propietario(0,"cettipao","123","9A 24 5A 89","Paolo","Cetti","44739152");
        Propietario propietario2 = new Propietario(1,"Thaats","123","A7 08 92 B9","Matias","Ninci","44000000");
        //Agrego los propietarios al Gestor
        gp.addPropietario(propietario2);
        gp.addPropietario(propietario1);
        
        //Creo Gestor de Visitante
        GestorVisitante gv = new GestorVisitante();
        //Creo Visitantes
        Visitante visitante = new Visitante(0,propietario1,"Gonzalo","Bisio","44444444");
        
        //Agrego los visitantes al Gestor
        gv.addVisitanteEsperadoEntrada(visitante);
        
        
        
        
        //Escritura de Archivos
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("src/json/gestorPropietario.txt");
            pw = new PrintWriter(fichero);

            //Conversion de clase usuario a String tipo JSON
            String JSON = gson.toJson(gv);
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

*/
