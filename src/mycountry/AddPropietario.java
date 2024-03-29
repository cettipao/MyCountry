/*
 La clase AddPropietario agrega un nuevo propietario al Json
 */
package mycountry;

import dialogos.Advertencia;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class AddPropietario extends javax.swing.JFrame {

    /**
     * Creates new form AddPropietario
     */
    private Arduino ino;
    private FileManager fm;
    
    public AddPropietario(Arduino ino, FileManager fm) {
        this.ino = ino;//Necesita el ino para setear false el addProp
        this.fm = fm;
        initComponents();
        this.setResizable(false);
        confirmExit();//Cuando se aprieta cerrar, la ventana se oculta y establece false a addProp
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);//Esta ventana no se cierra hasta que se cierra el programa
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        addProp = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblUser2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblUser3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUser4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        lblUser5 = new javax.swing.JLabel();
        txtRfid = new javax.swing.JTextField();
        lblUser6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyCountry | Propietarios Manager");
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(316, 352));
        jPanel1.setMinimumSize(new java.awt.Dimension(316, 352));

        lblLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 102, 0));
        lblLogin.setText("Propietarios Manager");

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

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        lblUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(204, 204, 204));
        lblUser.setText("Nombre del Propietario");

        lblUser1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(204, 204, 204));
        lblUser1.setText("Apellido del Propietario");

        txtSurname.setBackground(new java.awt.Color(51, 51, 51));
        txtSurname.setForeground(new java.awt.Color(255, 255, 255));
        txtSurname.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        lblUser2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(204, 204, 204));
        lblUser2.setText("Dni del Propietario");

        txtDni.setBackground(new java.awt.Color(51, 51, 51));
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        lblUser3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(204, 204, 204));
        lblUser3.setText("Usename del Propietario");

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

        lblUser4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(204, 204, 204));
        lblUser4.setText("Password del Propietario");

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
        lblUser5.setText("RFID del Propietario");

        txtRfid.setBackground(new java.awt.Color(51, 51, 51));
        txtRfid.setForeground(new java.awt.Color(255, 255, 255));
        txtRfid.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtRfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfidActionPerformed(evt);
            }
        });
        txtRfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRfidKeyPressed(evt);
            }
        });

        lblUser6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUser6.setText("(se agrega automaticamente al escanearlo)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUser)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser1)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser2)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser3)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser4)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser5)
                                    .addComponent(txtRfid, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUser6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addProp, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRfid, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(addProp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void addPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPropActionPerformed

        agregarPropietario();
    }//GEN-LAST:event_addPropActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameActionPerformed

    private void txtSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtSurnameKeyPressed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtRfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfidActionPerformed

    private void txtRfidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfidKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarPropietario();
        }
        
    }//GEN-LAST:event_txtRfidKeyPressed

   public void setTextRfid(String rfid){
        this.txtRfid.setText(rfid);
    }

   /*
    El metodo confirmExit establece el booleano de AddProp de Arduino en false, para asi dejar pasar a propietarios
   */
    private void confirmExit() {
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                try{
                    ino.setAddProp(false);
                }
                catch(Exception e){
                    System.out.println("Arduino NO conectado");
                }
                //Borrar txt
                txtName.setText("");
                txtSurname.setText("");
                txtDni.setText("");
                txtUser.setText("");
                txtPass.setText("");
                txtRfid.setText("");
            }
        });
    }

   /*
    El metodo agregarPropietario agrega un propietario si es que cumple con los requisitos como un DNI valido y sobreescribe un propietario si posee
    el mismo RFID
    */
   private void agregarPropietario(){
       System.out.println("RFID: " + this.txtRfid.getText());
       String rfid = this.txtRfid.getText();
       System.out.println("Previo a Realizar cambios");
       System.out.println(fm.getGestorPropietario().toString());
       //Agregando Propietario
        //Comprobando si alguno de los campos esta vacio
        if(this.txtName.getText().equals("") || this.txtSurname.getText().equals("") || this.txtDni.getText().equals("") || this.txtUser.getText().equals("") || this.txtPass.getText().equals("") || this.txtRfid.getText().equals("")){
            System.out.println("Alguno de los campos esta vacio. Intente otra vez");
            Advertencia advertencia = new Advertencia(this,true,"Algunos de los campos esta vacio");
            advertencia.show();
            return;
        }
        //Comprueba si el DNI es valido
        if(this.txtDni.getText().length()!=8){
            //Dni no es valido
            Advertencia advertencia = new Advertencia(this,true,"DNI no es valido");
            advertencia.show();
            return;
        }
       //Comprobando si el Rfid ya tiene un Propietario Asignado
       for (Propietario p : this.fm.getGestorPropietario().getPropietarios()) {
           if (p.getRfid().equals(this.txtRfid.getText())) {
               System.out.println("El Rfid ya contiene Owner, si desea continuar, los datos se sobrescribiran");
                Advertencia advertencia = new Advertencia(this,true,"El propietario se sobreescribira");
                advertencia.show();
               this.fm.getGestorPropietario().removePropietario(p);
           }
           
       }
        //Agregando Propietario
        int idPropietario = this.fm.getUltimoIdPropietario() + 1;
        this.fm.getGestorPropietario().addPropietario(new Propietario(idPropietario,this.txtUser.getText(),this.txtPass.getText(),this.txtRfid.getText(),this.txtName.getText(),this.txtSurname.getText(),this.txtDni.getText()));
        System.out.println("Propietario agregado con Exito");
        Advertencia advertencia = new Advertencia(this,true,"Propietario agregado con Exito");
        advertencia.show();
        //Guardar
        System.out.println("Despues de Cambios");
        System.out.println(fm.getGestorPropietario().toString());
        this.fm.guardarObjeto("gestorPropietario");
        this.fm.CrearGestorPropietario();
        //Borrar txt
        this.txtName.setText("");
        this.txtSurname.setText("");
        this.txtDni.setText("");
        this.txtUser.setText("");
        this.txtPass.setText("");
        this.txtRfid.setText("");
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JLabel lblUser6;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRfid;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
