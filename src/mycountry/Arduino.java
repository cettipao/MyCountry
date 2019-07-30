/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        this.ad=ad;
        this.addProp=false;
        ino = new PanamaHitek_Arduino();
        
        listener = (SerialPortEvent spe) -> {
            try {
                if (ino.isMessageAvailable()) {
                    String id = ino.printMessage();
                    System.out.println(addProp);
                    if (addProp) {
                        System.out.println(ad);
                        System.out.println(id);
                        ad.setTextRfid(id);
                    } else {
                        for (Propietario p : gp.getPropietarios()) {
                            System.out.println(p.getRfid() + " " + ino.printMessage());
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
    public void prenderRele() throws ArduinoException, SerialPortException{
        this.ino.sendData("p");
    }

    public void setAddProp(boolean addProp) {
        this.addProp = addProp;
        System.out.println(this.addProp);
    }

    public AddPropietario getAd() {
        return ad;
    }

    public void setAd(AddPropietario ad) {
        
        this.ad = ad;
    }
    
        
}
