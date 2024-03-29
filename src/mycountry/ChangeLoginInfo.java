/*
 La clase ChangeLoginInfo permite cambiar el login de la guardia y resetear listas de Propietarios y Visitantes
*/
package mycountry;

import dialogos.Advertencia;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class ChangeLoginInfo extends javax.swing.JFrame {
    
    private FileManager fm;
    public ChangeLoginInfo(FileManager fm) {
        initComponents();
        this.fm = fm;
        fm.CrearGuardiaLogin();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        confirmExit();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblUser5 = new javax.swing.JLabel();
        txtActualPass = new javax.swing.JPasswordField();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        btnResetVisitantes = new javax.swing.JButton();
        btnResetPropietarios = new javax.swing.JButton();
        btnResetPropietarios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCountry | LoginDataChange");
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(316, 352));
        jPanel1.setMinimumSize(new java.awt.Dimension(316, 352));

        lblLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 102, 0));
        lblLogin.setText("Login Data Change");

        btnChange.setBackground(new java.awt.Color(255, 102, 0));
        btnChange.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Cambiar");
        btnChange.setBorder(null);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(51, 51, 51));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(204, 204, 204));
        lblUser.setText("Username Nuevo");

        lblUser1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(204, 204, 204));
        lblUser1.setText("Password Nuevo");

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        lblUser5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser5.setForeground(new java.awt.Color(204, 204, 204));
        lblUser5.setText("Password Actual");

        txtActualPass.setBackground(new java.awt.Color(51, 51, 51));
        txtActualPass.setForeground(new java.awt.Color(255, 255, 255));
        txtActualPass.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtActualPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualPassActionPerformed(evt);
            }
        });
        txtActualPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtActualPassKeyPressed(evt);
            }
        });

        lblUser2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(204, 204, 204));
        lblUser2.setText("Reiniciar Gestor Visitantes");

        lblUser3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(204, 204, 204));
        lblUser3.setText("Reiniciar Gestor Propietarios");

        btnResetVisitantes.setBackground(new java.awt.Color(255, 102, 0));
        btnResetVisitantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnResetVisitantes.setForeground(new java.awt.Color(255, 255, 255));
        btnResetVisitantes.setText("Reiniciar");
        btnResetVisitantes.setBorder(null);
        btnResetVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetVisitantesActionPerformed(evt);
            }
        });

        btnResetPropietarios.setBackground(new java.awt.Color(255, 102, 0));
        btnResetPropietarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnResetPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPropietarios.setText("Reiniciar");
        btnResetPropietarios.setBorder(null);
        btnResetPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPropietariosActionPerformed(evt);
            }
        });

        btnResetPropietarios1.setBackground(new java.awt.Color(255, 102, 0));
        btnResetPropietarios1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnResetPropietarios1.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPropietarios1.setText("Seguimiento");
        btnResetPropietarios1.setBorder(null);
        btnResetPropietarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPropietarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResetPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUser)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(lblUser1)
                        .addComponent(txtPass)
                        .addComponent(lblUser5)
                        .addComponent(txtActualPass)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser2)
                            .addComponent(lblUser3)
                            .addComponent(btnResetVisitantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnResetPropietarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblUser2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(lblUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser5)
                    .addComponent(btnResetPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtActualPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetPropietarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        changeLoginData();
        
    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            changeLoginData();
        }

    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            changeLoginData();
        }

    }//GEN-LAST:event_txtPassKeyPressed

    private void txtActualPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualPassActionPerformed
    }//GEN-LAST:event_txtActualPassActionPerformed

    private void txtActualPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActualPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            changeLoginData();
        }
    }//GEN-LAST:event_txtActualPassKeyPressed
    /*
        El metodo se ejecuta al presionar el boton, y resetea todo el Json de los Propietarios
    */
    private void btnResetVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetVisitantesActionPerformed
        fm.setGestorPropietario(new GestorPropietario());
        fm.guardarObjeto("gestorPropietario");
        Advertencia advertencia = new Advertencia(this,true,"Gestor de Propietarios reseteado");
        advertencia.show();
    }//GEN-LAST:event_btnResetVisitantesActionPerformed
    /*
        El metodo se ejecuta al presionar el boton, y resetea todo el Json de los Visitantes
    */
    private void btnResetPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPropietariosActionPerformed
        fm.setGestorVisitante(new GestorVisitante());
        fm.guardarObjeto("gestorVisitantes");
         Advertencia advertencia = new Advertencia(this,true,"Gestor de Visitantes reseteado");
        advertencia.show();
    }//GEN-LAST:event_btnResetPropietariosActionPerformed

    private void btnResetPropietarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPropietarios1ActionPerformed
        // TODO add your handling code here:
        SeguimientoFrame seguimientoFrame = new SeguimientoFrame(this.fm);
        seguimientoFrame.show();
    }//GEN-LAST:event_btnResetPropietarios1ActionPerformed
    /*
    El metodo changeLoginData cambia los datos del login si es que los campos son correctos (Se necesita la pass actual)
    */
    private void changeLoginData(){
        //Comprueba si el PassActual es correcto
        if(this.txtActualPass.getText().equals(fm.getGuardiaLogin().getPassword())){
            //Comprueba si el user nuevo esta vacio, de lo contrario cambia el user
            if(!this.txtUser.getText().equals("")){
                fm.getGuardiaLogin().setUsername(this.txtUser.getText());
            }
            if(!this.txtPass.getText().equals("")){
                fm.getGuardiaLogin().setPassword(this.txtPass.getText());
            }
            //Guarda cambios
            System.out.println(fm.getGuardiaLogin());
            System.out.println("Cambios Guardados con Exito");
            Advertencia advertencia = new Advertencia(this,true,"Cambios Guardados con Exito");
            advertencia.show();
            this.txtActualPass.setText("");
            this.txtUser.setText("");
            this.txtPass.setText("");
        }
        else{
            Advertencia advertencia = new Advertencia(this,true,"Password Actual Incorrecta");
            advertencia.show();
            return;
        }
        
    }
    private void confirmExit() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                txtActualPass.setText("");
                txtUser.setText("");
                txtPass.setText("");
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnResetPropietarios;
    private javax.swing.JButton btnResetPropietarios1;
    private javax.swing.JButton btnResetVisitantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JPasswordField txtActualPass;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
