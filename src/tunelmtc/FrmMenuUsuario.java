/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunelmtc;

/**
 *
 * @author User
 */
public class FrmMenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuUsuario
     */
    public FrmMenuUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVerOperarios = new javax.swing.JButton();
        btnNuevoOperario1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(931, 580));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVerOperarios.setBackground(new java.awt.Color(0, 51, 102));
        btnVerOperarios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnVerOperarios.setForeground(new java.awt.Color(255, 255, 255));
        btnVerOperarios.setText("Ver operarios");
        btnVerOperarios.setBorder(null);
        btnVerOperarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerOperariosMouseClicked(evt);
            }
        });
        btnVerOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerOperariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerOperarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 240, 170, 40));

        btnNuevoOperario1.setBackground(new java.awt.Color(0, 51, 102));
        btnNuevoOperario1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnNuevoOperario1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoOperario1.setText("Nuevo operario");
        btnNuevoOperario1.setBorder(null);
        btnNuevoOperario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoOperario1MouseClicked(evt);
            }
        });
        btnNuevoOperario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoOperario1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoOperario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 159, 170, 40));

        jLabel5.setBackground(new java.awt.Color(212, 208, 200));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gestión de operarios");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        btnAtras1.setBackground(new java.awt.Color(0, 51, 102));
        btnAtras1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnAtras1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras1.setText("Atrás");
        btnAtras1.setBorder(null);
        btnAtras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtras1MouseClicked(evt);
            }
        });
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerOperariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerOperariosMouseClicked

    }//GEN-LAST:event_btnVerOperariosMouseClicked

    private void btnVerOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerOperariosActionPerformed
        // TODO add your handling code here:
        FrmGestion gestion = new FrmGestion();
        gestion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerOperariosActionPerformed

    private void btnNuevoOperario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoOperario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoOperario1MouseClicked

    private void btnNuevoOperario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoOperario1ActionPerformed
        // TODO add your handling code here:
        FrmNuevo nuevo = new FrmNuevo();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNuevoOperario1ActionPerformed

    private void btnAtras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtras1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtras1MouseClicked

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // TODO add your handling code here:
        FrmManual manual = new FrmManual();
        manual.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnNuevoOperario1;
    private javax.swing.JButton btnVerOperarios;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}