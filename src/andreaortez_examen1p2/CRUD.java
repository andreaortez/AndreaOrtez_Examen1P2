
package andreaortez_examen1p2;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;

public class CRUD extends javax.swing.JFrame {

    public CRUD() {
        initComponents();
        pn_agregar.setVisible(false);
        pn_escritorio.setVisible(false);
        pn_laptop.setVisible(false);
        pn_listar.setVisible(false);
        pn_eliminar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CRUD = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
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
        pn_listar = new javax.swing.JPanel();
        listarinfo = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        title1 = new javax.swing.JLabel();
        pn_eliminar = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaeliminar = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CRUD.setBackground(new java.awt.Color(214, 217, 224));
        CRUD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header1.setBackground(new java.awt.Color(0, 0, 0));
        header1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 217, 224));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        header1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabelMin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });
        header1.add(jLabelMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        CRUD.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        botones.setBackground(new java.awt.Color(0, 153, 153));

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(eliminar)
                    .addComponent(listar)
                    .addComponent(agregar))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(listar)
                .addGap(89, 89, 89)
                .addComponent(eliminar)
                .addGap(95, 95, 95))
        );

        CRUD.add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 440));

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

        tf_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ipActionPerformed(evt);
            }
        });
        pn_agregar.add(tf_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 30));

        escritorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        escritorio.setText("Escritorio");
        escritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escritorioActionPerformed(evt);
            }
        });
        pn_agregar.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

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

        pn_listar.setBackground(new java.awt.Color(214, 217, 224));
        pn_listar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info.setColumns(20);
        info.setRows(5);
        listarinfo.setViewportView(info);

        pn_listar.add(listarinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 500, 340));

        title1.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Lista de PCs");
        pn_listar.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, -1));

        CRUD.add(pn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 560, 440));

        pn_eliminar.setBackground(new java.awt.Color(214, 217, 224));

        title2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Eliminar PC");

        tablaeliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dirección IP", "Máscara de red", "Hostname"
            }
        ));
        tablaeliminar.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tablaeliminar);

        jToggleButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jToggleButton1.setText("Eliminar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_eliminarLayout = new javax.swing.GroupLayout(pn_eliminar);
        pn_eliminar.setLayout(pn_eliminarLayout);
        pn_eliminarLayout.setHorizontalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jToggleButton1)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
        );
        pn_eliminarLayout.setVerticalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(22, 22, 22))
            .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );

        CRUD.add(pn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 560, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        pn_agregar.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        pn_listar.setVisible(true);
        info.setText(pcs.toString());

    }//GEN-LAST:event_listarActionPerformed

    private void escritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioActionPerformed

    private void enviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar3ActionPerformed
        try {
            if (escritorio.isSelected()) {
                pn_escritorio.setVisible(true);
//                String a = tf_ram.getText();
//                String b = tf_almacenamiento.getText();
                String c = tf_ip.getText();
                String d = tf_mascara.getText();
                String e = tf_host.getText();
                pcs.add(new PC_Escritorio(tf_ram.getText(), tf_almacenamiento.getText(),
                    tipoa.getSelectedItem().toString(), tarjeta1.getSelectedItem().toString(), Integer.parseInt(c),
                    Integer.parseInt(d), e));
        } else {
            pn_laptop.setVisible(true);
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

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar1ActionPerformed

    private void enviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar2ActionPerformed

    private void tf_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ipActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       pn_eliminar.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (tablaeliminar.getSelectedRow() >= 0) {
            int r = JOptionPane.showConfirmDialog(tablaeliminar, "¿Desea elimnar producto?", "Eliminar producto", YES_NO_OPTION);
            if (r == 0) {
                pcs.remove(tablaeliminar.getSelectedRow());
                listarTabla();
                JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente");
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }
    
    private void listarTabla() {
        try {
            //limpiar tabla
            tablaeliminar.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                    new String[]{"Marca", "Modelo", "Fecha", "Color", "Tipo", "Millas", "Cámara"}));

            // TODO add your handling code here:
            for (PC t : pcs) {
                
                Object[] row = {t.getIP(), t.getMascara(), t.getHost().toString()};
                DefaultTableModel modelo = (DefaultTableModel) tablaeliminar.getModel();
                modelo.addRow(row);
                tablaeliminar.setModel(modelo);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD;
    private javax.swing.JButton agregar;
    private javax.swing.JPanel botones;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton enviar1;
    private javax.swing.JButton enviar2;
    private javax.swing.JButton enviar3;
    private javax.swing.JRadioButton escritorio;
    private javax.swing.JPanel header1;
    private javax.swing.JTextArea info;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton laptop;
    private javax.swing.JButton listar;
    private javax.swing.JScrollPane listarinfo;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_eliminar;
    private javax.swing.JPanel pn_escritorio;
    private javax.swing.JPanel pn_laptop;
    private javax.swing.JPanel pn_listar;
    private javax.swing.JComboBox<String> rgb;
    private javax.swing.JTable tablaeliminar;
    private javax.swing.JComboBox<String> tarjeta1;
    private javax.swing.JTextField tf_almacenamiento;
    private javax.swing.JTextField tf_definicion;
    private javax.swing.JTextField tf_host;
    private javax.swing.JTextField tf_ip;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_mascara;
    private javax.swing.JTextField tf_ram;
    private javax.swing.JComboBox<String> tipoa;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
