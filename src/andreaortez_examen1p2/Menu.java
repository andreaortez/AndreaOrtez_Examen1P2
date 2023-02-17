package andreaortez_examen1p2;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tarjeta = new javax.swing.ButtonGroup();
        tipo = new javax.swing.ButtonGroup();
        almacenamiento = new javax.swing.ButtonGroup();
        RGB = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CRUD = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pn_agregar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_host = new javax.swing.JTextField();
        tf_mascara = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_ip = new javax.swing.JTextField();
        escritorio = new javax.swing.JRadioButton();
        laptop = new javax.swing.JRadioButton();
        enviar3 = new javax.swing.JButton();
        pn_laptop = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_definicion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        enviar1 = new javax.swing.JButton();
        rgb = new javax.swing.JComboBox<>();
        pn_escritorio = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_ram = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_almacenamiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enviar2 = new javax.swing.JButton();
        tipoa = new javax.swing.JComboBox<>();
        tarjeta1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 217, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(0, 0, 0));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 217, 224));
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelMin))
                .addGap(7, 7, 7))
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Menu");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setText("CRUD PC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 130, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Ingresar PC");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        CRUD.setBackground(new java.awt.Color(214, 217, 224));
        CRUD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 217, 224));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabelMin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });
        header.add(jLabelMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        CRUD.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Listar");

        jButton5.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(89, 89, 89)
                .addComponent(jButton5)
                .addGap(95, 95, 95))
        );

        CRUD.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 440));

        pn_agregar.setBackground(new java.awt.Color(214, 217, 224));
        pn_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Máscara de red");
        pn_agregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Hostname");
        pn_agregar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        pn_agregar.add(tf_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 30));
        pn_agregar.add(tf_mascara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo");
        pn_agregar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Dirección IP");
        pn_agregar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        pn_agregar.add(tf_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 30));

        tipo.add(escritorio);
        escritorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        escritorio.setText("Escritorio");
        escritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escritorioActionPerformed(evt);
            }
        });
        pn_agregar.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        tipo.add(laptop);
        laptop.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        laptop.setText("Laptop");
        pn_agregar.add(laptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        enviar3.setBackground(new java.awt.Color(0, 255, 0));
        enviar3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        enviar3.setForeground(new java.awt.Color(255, 255, 255));
        enviar3.setText("Enviar");
        enviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar3ActionPerformed(evt);
            }
        });
        pn_agregar.add(enviar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        CRUD.add(pn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 260, 440));

        pn_laptop.setBackground(new java.awt.Color(214, 217, 224));
        pn_laptop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("RGB");
        pn_laptop.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        pn_laptop.add(tf_definicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 230, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Marca");
        pn_laptop.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        pn_laptop.add(tf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Definición de pantalla");
        pn_laptop.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Laptop");
        pn_laptop.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        enviar1.setBackground(new java.awt.Color(0, 255, 0));
        enviar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        enviar1.setForeground(new java.awt.Color(255, 255, 255));
        enviar1.setText("Enviar");
        enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar1ActionPerformed(evt);
            }
        });
        pn_laptop.add(enviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        rgb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        pn_laptop.add(rgb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, -1));

        CRUD.add(pn_laptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 300, 440));

        pn_escritorio.setBackground(new java.awt.Color(214, 217, 224));
        pn_escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Capacidad RAM");
        pn_escritorio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        pn_escritorio.add(tf_ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Capacidad de almacenamiento");
        pn_escritorio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        pn_escritorio.add(tf_almacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tipo de almacenamiento");
        pn_escritorio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tarjeta Gráfica");
        pn_escritorio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        enviar2.setBackground(new java.awt.Color(0, 255, 0));
        enviar2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        enviar2.setForeground(new java.awt.Color(255, 255, 255));
        enviar2.setText("Enviar");
        enviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar2ActionPerformed(evt);
            }
        });
        pn_escritorio.add(enviar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        tipoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDD", "SSD" }));
        pn_escritorio.add(tipoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 270, 30));

        tarjeta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        pn_escritorio.add(tarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, -1));

        CRUD.add(pn_escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 300, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pn_agregar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void enviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar2ActionPerformed

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar1ActionPerformed

    private void escritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioActionPerformed

    private void enviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar3ActionPerformed
        try {
            if (escritorio.isSelected()) {
                pn_escritorio.isVisible();
                pcs.add(new PC_Escritorio(Integer.parseInt(tf_ram.getText()), Integer.parseInt(tf_almacenamiento.getText()),
                        tipoa.getSelectedItem().toString(), tarjeta1.getSelectedItem().toString(), Integer.parseInt(tf_ip.getText()),
                        Integer.parseInt(tf_mascara.getText()), tf_host.getText()));
            } else {
                pn_laptop.isVisible();
                pcs.add(new Laptop(tf_marca.getText(), Integer.parseInt(tf_definicion.getText()), rgb.getSelectedItem().toString(),
                        Integer.parseInt(tf_ip.getText()), Integer.parseInt(tf_mascara.getText()), tf_host.getText()));
            }

            tf_ip.setText("");
            tf_mascara.setText("");
            tf_host.setText("");
            tf_ram.setText("");
            tf_almacenamiento.setText("");
            tf_marca.setText("");
            tf_definicion.setText("");

            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_enviar3ActionPerformed

    ArrayList<PC> pcs = new ArrayList();

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD;
    private javax.swing.ButtonGroup RGB;
    private javax.swing.ButtonGroup almacenamiento;
    private javax.swing.JPanel barra;
    private javax.swing.JButton enviar1;
    private javax.swing.JButton enviar2;
    private javax.swing.JButton enviar3;
    private javax.swing.JRadioButton escritorio;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton laptop;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_escritorio;
    private javax.swing.JPanel pn_laptop;
    private javax.swing.JComboBox<String> rgb;
    private javax.swing.ButtonGroup tarjeta;
    private javax.swing.JComboBox<String> tarjeta1;
    private javax.swing.JTextField tf_almacenamiento;
    private javax.swing.JTextField tf_definicion;
    private javax.swing.JTextField tf_host;
    private javax.swing.JTextField tf_ip;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_mascara;
    private javax.swing.JTextField tf_ram;
    private javax.swing.ButtonGroup tipo;
    private javax.swing.JComboBox<String> tipoa;
    // End of variables declaration//GEN-END:variables
}
