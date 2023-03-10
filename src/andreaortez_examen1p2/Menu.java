package andreaortez_examen1p2;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tarjeta = new javax.swing.ButtonGroup();
        tipo = new javax.swing.ButtonGroup();
        almacenamiento = new javax.swing.ButtonGroup();
        RGB = new javax.swing.ButtonGroup();
        menu = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_crud = new javax.swing.JButton();
        b_ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(214, 217, 224));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        menu.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Menu");
        menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        b_crud.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        b_crud.setText("CRUD PC");
        b_crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crudActionPerformed(evt);
            }
        });
        menu.add(b_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 130, -1, -1));

        b_ingresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        b_ingresar.setText("Ingresar PC");
        b_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ingresarActionPerformed(evt);
            }
        });
        menu.add(b_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_crudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crudActionPerformed
        CRUD c = new CRUD();
        this.menu.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_b_crudActionPerformed

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

    private void b_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ingresarActionPerformed
        this.setVisible(false);
        CRUD c = new CRUD();
        String ip = JOptionPane.showInputDialog(null, "Ingrese una direcci??n IP: ");

        for (PC t : c.pcs) {
            if (t.getIP().equals(ip)) {
                System.out.print("Ingrese comando: ");

                String cad = sc.next();

                if ("show".equals(cad)) {
                    String s = "";
                    for (Object o : c.pcs) {
                        s += "\n" + c.pcs.indexOf(o) + " - " + o + "\n";
                    }
                    System.out.println(s);
                } else if ("exit".equals(cad)) {
                    this.setVisible(true);
                } else if ("ping".equals(cad.contains("ping"))) {
                    PC p = new PC();
                    String ip2 = JOptionPane.showInputDialog(null, "Ingrese segunda direcci??n IP: ");
                    p.Ping(ip2);
                }else{
                    System.out.println("Opci??n no v??lida");
                }
            }
        }
    }//GEN-LAST:event_b_ingresarActionPerformed

    Scanner sc = new Scanner(System.in);
    
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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.ButtonGroup RGB;
    private javax.swing.ButtonGroup almacenamiento;
    private javax.swing.JButton b_crud;
    private javax.swing.JButton b_ingresar;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel menu;
    private javax.swing.ButtonGroup tarjeta;
    private javax.swing.ButtonGroup tipo;
    // End of variables declaration//GEN-END:variables
}
