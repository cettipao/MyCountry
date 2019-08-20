/*
La clase Arduino lleva el control entre el microprocesador Arduino y el software MyCountry
*/
package mycountry;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class Arduino {
    private PanamaHitek_Arduino ino;
    private SerialPortEventListener listener;
    private GestorPropietario gp;
    private Guardia guardia;
    private AddPropietario ad;
    private boolean addProp;
      
    public Arduino(GestorPropietario gp, Guardia g, AddPropietario ad) throws ArduinoException{
        this.gp = gp;
        this.guardia = g;
        this.addProp=false;
        
        ino = new PanamaHitek_Arduino();//Instancia una conexion con el puerto serial de tipo Arduino
        
        listener = (SerialPortEvent spe) -> {//Crea un Listener para estar leyendo constantemente informacion que manda el arduino
            try {
                if (ino.isMessageAvailable()) {
                    String id = ino.printMessage();
                    if (addProp) {
                        guardia.setTxtNewProp(id);
                    } else {
                        for (Propietario p : gp.getPropietarios()) {
                            if (id.equals(p.getRfid())) {
                                System.out.println("Usuario Permitido. Propietario: " + p);
                                guardia.propietarioEnPuerta(p);
                                ino.sendData("p");
                            }
                        }
                    }

                }
            } catch (SerialPortException | ArduinoException ex) {
                System.out.println("Error de Arduino: " + ex);
            }
        };
        ino.arduinoRXTX("/dev/ttyACM0", 9600, listener);
    }
    /*
    Envia informacion al arduino para encender el Rele y dejar pasar a la persona
    */
    public void prenderRele() throws ArduinoException, SerialPortException{
        this.ino.sendData("p");
    }

    public void setAddProp(boolean addProp) {
        this.addProp = addProp;
        
    }

    @Override
    public String toString() {
        return "Arduino{" + "ino=" + ino + ", listener=" + listener + ", gp=" + gp + ", guardia=" + guardia + ", ad=" + ad + ", addProp=" + addProp + '}';
    }
    
    
    
        
}
