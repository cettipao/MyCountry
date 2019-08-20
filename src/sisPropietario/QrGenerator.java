/*
 * QrGenerator es el encargado de generar Qr's
 *
 * 
 */
package sisPropietario;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class QrGenerator {

    public QrGenerator() {
    }
    
    /*
     *Genera un Qr y lo guarda en img/qr/ para ser mostrado en invitadoExitoso
     *@param id informacion a guardar en el Qr
     */
    public void generarQr(int id){
        try {
            
            String content = Integer.toString(id);
            String filePath = "img/qr/";
            String fileType = "png";
            int size = 125;
            QRCodeWriter qrcode = new QRCodeWriter();
            BitMatrix matrix = qrcode.encode(content, BarcodeFormat.QR_CODE, size, size);
            File qrFile = new File(filePath + content + "." + fileType);
            int matrixWidth = matrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
            
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, matrixWidth, matrixWidth);
            graphics.setColor(Color.BLACK);
            
            for (int b = 0; b < matrixWidth; b++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(b, j)) {
                        graphics.fillRect(b, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, fileType, qrFile);
        } catch (WriterException ex) {
            System.out.println("Error al Generar Qr");
        } catch (IOException ex) {
            System.out.println("Error al Generar Qr");
        }
    }
    
}
