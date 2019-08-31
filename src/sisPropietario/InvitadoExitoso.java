/*
 * Invitado Exitoso es un form con labels y codigo
 * qr acerca del invitado que puede entrar en guardia
 * 
 */
package sisPropietario;

import javax.swing.ImageIcon;
import mycountry.Propietario;
import mycountry.Visitante;

public class InvitadoExitoso extends javax.swing.JFrame {

    private Visitante visitante;
    private Propietario propietario;
    private SistemaPropietario sisProp;
    private QrGenerator qrGen;
    public InvitadoExitoso(Visitante v,SistemaPropietario sp) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        confirmExit();
        this.visitante = v;
        this.sisProp = sp;
        //Generador de Qr
        this.qrGen = new QrGenerator();
        this.propietario = this.sisProp.getPropietario();
        this.lblName.setText(this.visitante.getNombre());
        this.lblSurname.setText(this.visitante.getApellido());
        this.lblDni.setText(this.visitante.getDNI());
        this.lblId.setText(Integer.toString(this.visitante.getIdVisitante()));
        this.qrGen.generarQr(v.getIdVisitante());
        System.out.println("Id Visitante: "+v.getIdVisitante());
        this.lblImagen.setIcon(new ImageIcon("img/qr/"+Integer.toString(v.getIdVisitante()) + ".png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        btnInvitar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblProp = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCountry | Invitado Exitoso");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(282, 484));

        lblName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(30, 30, 30));
        lblName.setText("Nombre de Invitado");

        lblSurname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(30, 30, 30));
        lblSurname.setText("Apellido de Invitado");

        btnInvitar.setBackground(new java.awt.Color(255, 102, 0));
        btnInvitar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInvitar.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitar.setText("Volver");
        btnInvitar.setBorder(null);
        btnInvitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("MyContry");

        lblDni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDni.setForeground(new java.awt.Color(30, 30, 30));
        lblDni.setText("Dni de Invitado");

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        lblProp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblProp.setForeground(new java.awt.Color(255, 255, 204));
        lblProp.setText("Propietario: propietario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblProp, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lblProp)
                .addContainerGap())
        );

        lblLogin1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(30, 30, 30));
        lblLogin1.setText("Invitado Exitoso");

        lblId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(30, 30, 30));
        lblId.setText("Id de Invitado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblSurname)
                            .addComponent(lblLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDni)
                                .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnInvitar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId)
                .addGap(29, 29, 29)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnInvitar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitarActionPerformed
        // TODO add your handling code here:
        
        this.sisProp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInvitarActionPerformed

     private void confirmExit(){
       this.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        sisProp.setVisible(true);
        dispose();
    }
});
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvitar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProp;
    private javax.swing.JLabel lblSurname;
    // End of variables declaration//GEN-END:variables
}
