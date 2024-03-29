/*
 * La clase RelojThread inicia un hilo donde actualizara la
 * hora de Guardia cada segundo
 *
 */
package mycountry;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class RelojThread extends Thread{
    private Calendar calendar;
    private SimpleDateFormat formatter;
    private javax.swing.JLabel lbl;

    public RelojThread(JLabel lbl) {
        formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        this.lbl = lbl;
    }
    
    @Override
    public void run() {
        while (true) {
            calendar = Calendar.getInstance();
            lbl.setText(formatter.format(calendar.getTime()));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
}
