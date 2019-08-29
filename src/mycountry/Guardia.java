/*
 * La clase Guardia es la clase principal para la entarda y salida
 * de personas en el bario, debe ser manejada por el guardia
 * y accede a mayori de clase
 */
package mycountry;

import com.panamahitek.ArduinoException;
import dialogos.Advertencia;

public class Guardia extends javax.swing.JFrame {

    private Arduino ino;
    private FileManager fm;
    private AddPropietario addPropietario;
    public Guardia(FileManager fm) {
        initComponents();
        reloj();
        this.fm = fm;
        fm.CrearGestorPropietario();
        fm.CrearGestorVisitante();

        try {
            ino = new Arduino(fm.getGestorPropietario(), this, addPropietario);//Instancio Ino (Necesita addprop)
        } catch (ArduinoException ex) {
            System.out.println("No se pudo establecer conexion con arduino");
            Advertencia advertencia = new Advertencia(this,true,"Error al conectar Arduino");
            advertencia.show();
        }
        addPropietario = new AddPropietario(ino, fm);//Instancio addProp (Necesita ino)
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        addProp = new javax.swing.JButton();
        lblInfoPersona = new javax.swing.JLabel();
        lblTipoIngresante = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTipoGreso = new javax.swing.JLabel();
        lblPropAnf = new javax.swing.JLabel();
        lblPropietarioVisitante = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEscanear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 102, 0));
        lblLogin.setText("Sistema Guardia");

        addProp.setBackground(new java.awt.Color(255, 102, 0));
        addProp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addProp.setForeground(new java.awt.Color(255, 255, 255));
        addProp.setText("Agregar Propietario");
        addProp.setBorder(null);
        addProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPropActionPerformed(evt);
            }
        });

        lblInfoPersona.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblInfoPersona.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPersona.setText("Informacion Persona");

        lblTipoIngresante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipoIngresante.setForeground(new java.awt.Color(204, 204, 204));
        lblTipoIngresante.setText("Propietario/Visitante");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 153, 153));
        lblNombre.setText("Nombre:");

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("nombre");

        lblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(153, 153, 153));
        lblApellido.setText("Apellido:");

        lblSurname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(204, 204, 204));
        lblSurname.setText("apellido");

        lblDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(153, 153, 153));
        lblDocumento.setText("DNI:");

        lblDni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDni.setForeground(new java.awt.Color(204, 204, 204));
        lblDni.setText("dni");

        lblTipoGreso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipoGreso.setForeground(new java.awt.Color(204, 204, 204));
        lblTipoGreso.setText("Ingreso/Egreso");

        lblPropAnf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPropAnf.setForeground(new java.awt.Color(153, 153, 153));
        lblPropAnf.setText("Propietario Anfrition:");

        lblPropietarioVisitante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPropietarioVisitante.setForeground(new java.awt.Color(204, 204, 204));
        lblPropietarioVisitante.setText("propietario");

        lblTime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(204, 204, 204));
        lblTime.setText("00:00:00");

        jButton1.setBackground(new java.awt.Color(30, 30, 30));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycountry/conf.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEscanear1.setBackground(new java.awt.Color(255, 102, 0));
        btnEscanear1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEscanear1.setForeground(new java.awt.Color(255, 255, 255));
        btnEscanear1.setText("Escanear QR");
        btnEscanear1.setBorder(null);
        btnEscanear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscanear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoGreso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPropAnf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPropietarioVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addProp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEscanear1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(lblInfoPersona)
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoIngresante)
                    .addComponent(lblNombre)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoGreso)
                    .addComponent(lblApellido)
                    .addComponent(lblSurname))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropAnf)
                    .addComponent(lblDocumento)
                    .addComponent(lblDni)
                    .addComponent(lblPropietarioVisitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEscanear1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addProp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //establece addProp en ino en true
    private void addPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropActionPerformed
        // TODO add your handling code here:
        addPropietario.setVisible(true);
        try{
            ino.setAddProp(true);
        }
        catch(Exception e){
            System.out.println("Arduino NO Conectado");
        }
    }//GEN-LAST:event_addPropActionPerformed

    //Instacia un objeto de qrCodeReader para la lectura del qr
    private void btnEscanear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscanear1ActionPerformed
        // TODO add your handling code here:
        QrCodeReader qrCodeReader = new QrCodeReader(this);
        qrCodeReader.show();
    }//GEN-LAST:event_btnEscanear1ActionPerformed

    //Instancia un objeto de ChangeLoginInfo
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChangeLoginInfo changeLoginInfo = new ChangeLoginInfo(fm);
        changeLoginInfo.show();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /*Cambia los lbl con la informacion del propietario en puerta
     *@param p Propietario
    */
    public void propietarioEnPuerta(Propietario p){       
        this.lblName.setText(p.getNombre());
        this.lblSurname.setText(p.getApellido());
        this.lblDni.setText(p.getDNI());
        this.lblTipoIngresante.setText("Propietario");
        this.lblTipoGreso.setText("");
        this.lblPropietarioVisitante.setText("propietario");
    }
    
    
    /*Cambia el txt de addPropietario para no escribir a mano el RFID
     *@param id String
    */
    public void setTxtNewProp(String id) {
        addPropietario.setTextRfid(id);
    }
    
    //Instancia un objeto RelojThread para que actualize la hora cada segundo
    private void reloj(){
        RelojThread relojThread = new RelojThread(this.lblTime);
        relojThread.start();
    }
    
    /*Cambia la informacion de los labels con la del visitante si es que es esperado
     *@param visitante v
    */
    public void visitante(String id){
        fm.CrearGestorVisitante();
        System.out.println("Qr Detectado");
        for (Visitante v : fm.getGestorVisitante().getVisitantesEsperadosEntrada()) {
            if(Integer.toString(v.getIdVisitante()).equals(id)){
                this.lblName.setText(v.getNombre());
                this.lblSurname.setText(v.getApellido());
                this.lblDni.setText(v.getDNI());
                this.lblTipoIngresante.setText("Visitante");
                this.lblTipoGreso.setText("Ingreso");
                //Conseguir apellido del Propietario del Visitante
                this.fm.getGestorPropietario().getPropietarios().stream().filter((p) -> (p.getIdPropietario() == v.getIdProp())).forEachOrdered((p) -> {
                    this.lblPropietarioVisitante.setText(p.getApellido());
                });     
                fm.getGestorVisitante().addVisitanteEsperadoSalida(v);
                fm.guardarObjeto("gestorVisitantes");
                return;
            }  
        }
        for (Visitante v : fm.getGestorVisitante().getVisitantesEsperadosSalida()) {
            if(Integer.toString(v.getIdVisitante()).equals(id)){
                this.lblName.setText(v.getNombre());
                this.lblSurname.setText(v.getApellido());
                this.lblDni.setText(v.getDNI());
                this.lblTipoIngresante.setText("Visitante");
                this.lblTipoGreso.setText("Egreso");
                //Conseguir apellido del Propietario del Visitante
                this.fm.getGestorPropietario().getPropietarios().stream().filter((p) -> (p.getIdPropietario() == v.getIdProp())).forEachOrdered((p) -> {
                    this.lblPropietarioVisitante.setText(p.getApellido());
                });
                fm.getGestorVisitante().removeVisitanteEsperadoSalida(v);
                fm.guardarObjeto("gestorVisitantes");
                return;
            }  
        }
        Advertencia advertencia = new Advertencia(this,true,"Codigo QR no valido");
        advertencia.show();
        
        
        
        /*
        for(Visitante v : fm.getGestorVisitante().getVisitantesEsperadosEntrada()){
            if(Integer.toString(v.getIdVisitante()).equals(id)){
                System.out.println("Visitante Esperado Entrada en Puerta");
                //fm.getGestorVisitante().addVisitanteEsperadoSalida(v);
                fm.guardarObjeto("gestorVisitantes");
                this.lblName.setText(v.getNombre());
                this.lblSurname.setText(v.getApellido());
                this.lblDni.setText(v.getDNI());
                this.lblTipoIngresante.setText("Visitante");
                this.lblTipoGreso.setText("Ingreso");
                this.lblPropietarioVisitante.setText(v.getPropietario().getApellido());
            }
            else if (Integer.toString(v.getIdVisitante()).equals(id)){
                fm.getGestorVisitante().removeVisitanteEsperadoSalida(v);
                fm.guardarObjeto("gestorVisitantes");
                this.lblName.setText(v.getNombre());
                this.lblSurname.setText(v.getApellido());
                this.lblDni.setText(v.getDNI());
                this.lblTipoIngresante.setText("Visitante");
                this.lblTipoGreso.setText("Egreso");
                this.lblPropietarioVisitante.setText(v.getPropietario().getApellido());
                
            }
            else{
                System.out.println("Qr No valido");
            }

        }
*/
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProp;
    private javax.swing.JButton btnEscanear1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblInfoPersona;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPropAnf;
    private javax.swing.JLabel lblPropietarioVisitante;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTipoGreso;
    private javax.swing.JLabel lblTipoIngresante;
    // End of variables declaration//GEN-END:variables
}

