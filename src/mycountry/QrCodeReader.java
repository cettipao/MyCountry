/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycountry;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 *
 * @author Thanos Muere
 */
public class QrCodeReader extends javax.swing.JFrame {

    private Webcam webcam;
    private Guardia guardia;

    public QrCodeReader(Guardia g) {
        this.guardia = g;
        
        initComponents();
        
        setLocationRelativeTo(null);
        if(Webcam.getWebcams().size()==1){
            webcam = Webcam.getDefault();
        }
        else{
            webcam = Webcam.getWebcamByName("USB Camera-B4.09.24.1 /dev/video1");
        }
        /*
        try{
            webcam = Webcam.getWebcamByName("USB Camera-B4.09.24.1 /dev/video1");
        }catch(Exception e){
            webcam = Webcam.getDefault();
            
        }
      */
        webcam.setViewSize(new Dimension(640,480));
        webcam.open();
        new VideoFeedTaker(this).start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        imageHolder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    class VideoFeedTaker extends Thread {
        
        BufferedImage imagen;
        Reader lector = new MultiFormatReader();
        Boolean QRCode = true;
        private QrCodeReader qr;

        public VideoFeedTaker(QrCodeReader qr) {
            this.qr = qr;
        }
        
        @Override
        public void run() {
            while (QRCode ==true) {
                try {
                    Image image = webcam.getImage();
                    ImageIO.write(webcam.getImage(), "JPG", new File("firstcapture.jpg"));
                    File ubicacionImagen = new File("firstcapture.jpg");
                    imagen = ImageIO.read(ubicacionImagen);
                    LuminanceSource fuente = new BufferedImageLuminanceSource(imagen);
                    BinaryBitmap mapaBits = new BinaryBitmap(new HybridBinarizer(fuente));
                    try {
                        Result resultado = lector.decode(mapaBits);
                        if(!resultado.equals("")){
                            webcam.close();
                            QRCode = false;
                            dispose();
                        }
                        System.out.println("Contenido del codigo = "+resultado.getText());
                        this.qr.guardia.visitante(resultado.getText());
                    } catch (NotFoundException ex) {
                    } catch (ChecksumException ex) {
                    } catch (FormatException ex) {
                    } catch (Exception er){                       
                    }
                    
                    imageHolder.setIcon(new ImageIcon(image));
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    System.out.println("error");

                } catch (IOException ex) {
                }
            }
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel imageHolder;
    // End of variables declaration                   
}
