/*
 * SistemaPropietario simula una aplicacion movil 
 * que usa el Propietario para realizar
 * invitaciones
 */
package sisPropietario;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import mycountry.FileManager;
import mycountry.Propietario;
import mycountry.Visitante;

public class SistemaPropietario extends javax.swing.JFrame {

    private Propietario propietario;
    private FileManager fm;
    public SistemaPropietario(Propietario p, FileManager fm) {
        this.propietario = p;
        this.fm = fm;
        initComponents();
        this.lblProp.setText("Propietario: "+p.getApellido());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        confirmExit();
        this.lblAdv.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnInvitar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblPass1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblProp = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        btnInvitar1 = new javax.swing.JButton();
        lblAdv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCountry | SisPropietario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(282, 484));

        lblUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(30, 30, 30));
        lblUser.setText("Nombre de Invitado");

        jSeparator1.setBackground(new java.awt.Color(30, 30, 30));
        jSeparator1.setForeground(new java.awt.Color(30, 30, 30));

        txtName.setBackground(new java.awt.Color(255, 255, 204));
        txtName.setForeground(new java.awt.Color(30, 30, 30));
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(30, 30, 30));
        lblPass.setText("Apellido de Invitado");

        jSeparator2.setBackground(new java.awt.Color(30, 30, 30));
        jSeparator2.setForeground(new java.awt.Color(30, 30, 30));

        btnInvitar.setBackground(new java.awt.Color(255, 102, 0));
        btnInvitar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInvitar.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitar.setText("Invitar");
        btnInvitar.setBorder(null);
        btnInvitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("MyContry");

        lblPass1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPass1.setForeground(new java.awt.Color(30, 30, 30));
        lblPass1.setText("Dni de Invitado");

        jSeparator3.setBackground(new java.awt.Color(30, 30, 30));
        jSeparator3.setForeground(new java.awt.Color(30, 30, 30));

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
                .addComponent(lblProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblLogin1.setText("Invitar ");

        txtDni.setBackground(new java.awt.Color(255, 255, 204));
        txtDni.setForeground(new java.awt.Color(30, 30, 30));
        txtDni.setBorder(null);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
        });

        txtSurname.setBackground(new java.awt.Color(255, 255, 204));
        txtSurname.setForeground(new java.awt.Color(30, 30, 30));
        txtSurname.setBorder(null);
        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });
        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSurnameKeyPressed(evt);
            }
        });

        btnInvitar1.setBackground(new java.awt.Color(255, 255, 204));
        btnInvitar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInvitar1.setForeground(new java.awt.Color(153, 153, 153));
        btnInvitar1.setText("Cerrar Sesion");
        btnInvitar1.setBorder(null);
        btnInvitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitar1ActionPerformed(evt);
            }
        });

        lblAdv.setForeground(new java.awt.Color(0, 0, 0));
        lblAdv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdv.setText("Advertencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnInvitar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(lblUser)
                                        .addComponent(txtName)
                                        .addComponent(lblPass)
                                        .addComponent(jSeparator2)
                                        .addComponent(lblPass1)
                                        .addComponent(jSeparator3)
                                        .addComponent(lblLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(txtDni)
                                        .addComponent(txtSurname))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(btnInvitar1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblAdv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInvitar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblAdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnInvitar1))
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            invitar();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void btnInvitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitarActionPerformed
        invitar();
    }//GEN-LAST:event_btnInvitarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            invitar();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
    }//GEN-LAST:event_txtSurnameActionPerformed

    private void txtSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            invitar();
        }
    }//GEN-LAST:event_txtSurnameKeyPressed

    private void btnInvitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitar1ActionPerformed
        LoginSisPropietario loginSisPropietario = new LoginSisPropietario();
        loginSisPropietario.show();
        dispose();
    }//GEN-LAST:event_btnInvitar1ActionPerformed

    /*
     *Invita al visitante segun el propietario si los campos son validos
    */
    private void invitar(){
        //Actualiza lista de invitados
        fm.CrearGestorVisitante();
        //Comprueba si algun campo esta vacio
        if(this.txtDni.getText().equals("") || this.txtSurname.getText().equals("") || this.txtName.getText().equals("")){
            this.lblAdv.setText("Uno de los campos esta vacio");
            return;
        }
        //Comprueba si el DNI es valido
        if(this.txtDni.getText().length()!=8){
            //Dni no es valido
            this.lblAdv.setText("DNI ingresado no es valido");
            return;
        }
        //Comprueba si hay algun invitado esperado de mismo DNI del mismo propietario
        for (Visitante v:fm.getGestorVisitante().getVisitantesEsperadosEntrada()){
            //Conseguir el objeto Propietario del Visitante
            Propietario prop = null;
            for(Propietario p :fm.getGestorPropietario().getPropietarios()){
                if(p.getIdPropietario() == v.getIdProp()){
                    prop = p;
                }
            }
            if(v.getDNI().equals(this.txtDni.getText()) && prop.getIdPropietario() == this.propietario.getIdPropietario()){
                System.out.println("Este Propietario ya invito a este visitante");
                this.lblAdv.setText("Visitante ya invitado");
                return;
            }
        }
        /*
        //Comprueba si hay algun invitado dentro del barrio (Esperados Salida) de mismo DNI
        for(Visitante v:fm.getGestorVisitante().getVisitantesEsperadosSalida()){
            if(v.getDNI().equals(this.txtDni.getText())){
                System.out.println("Este invitado ya esta adentro del barrio o no ha documentado su salida");
                return;
            }
        }
        */
        //Crea Invitado
        int idVisitante = fm.getUltimoIdVisitante() + 1;
        Visitante visi = new Visitante(idVisitante,this.propietario,this.txtName.getText(),this.txtSurname.getText(),this.txtDni.getText());
        fm.getGestorVisitante().addVisitanteEsperadoEntrada(visi);
        //Guarda Cambios
        fm.guardarObjeto("gestorVisitantes");
        System.out.println("Nuevo invitado: " + visi);
        //Borra texto
        this.txtDni.setText("");
        this.txtName.setText("");
        this.txtSurname.setText("");
        //Esconde ventana y pasa a la siguiente
        this.setVisible(false);
        InvitadoExitoso invitadoExitoso = new InvitadoExitoso(visi,this);
        invitadoExitoso.show();
        
    }
     private void confirmExit(){
       this.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        LoginSisPropietario loginSisPropietario = new LoginSisPropietario();
        loginSisPropietario.show();
        dispose();
    }
});
   }

    public Propietario getPropietario() {
        return propietario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvitar;
    private javax.swing.JButton btnInvitar1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAdv;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblProp;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
