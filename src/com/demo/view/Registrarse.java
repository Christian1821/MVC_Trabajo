/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Christian
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        setLocationRelativeTo(null);
        setSize(400, 323);
        setResizable(false);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        IngresarNombre = new javax.swing.JTextField();
        IngresarApellido = new javax.swing.JTextField();
        IngresarID = new javax.swing.JTextField();
        IngresarContraseña = new javax.swing.JTextField();
        IngresarCorreo = new javax.swing.JTextField();
        FechaDia = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        FechaAño = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("REGISTRATE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 120, 14);

        jLabel2.setFont(new java.awt.Font("TI-Nspire Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 40, 60, 17);

        jLabel3.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 70, 80, 19);

        jLabel4.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 100, 30, 19);

        jLabel5.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 140, 90, 19);

        jLabel6.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Correo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 170, 60, 19);

        jLabel7.setFont(new java.awt.Font("TI-Nspire Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 220, 140, 19);

        jButton1.setText("Aceptar");
        getContentPane().add(jButton1);
        jButton1.setBounds(79, 269, 90, 23);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(238, 269, 90, 23);

        IngresarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarNombre);
        IngresarNombre.setBounds(186, 36, 133, 20);
        getContentPane().add(IngresarApellido);
        IngresarApellido.setBounds(186, 67, 133, 20);
        getContentPane().add(IngresarID);
        IngresarID.setBounds(186, 98, 133, 20);
        getContentPane().add(IngresarContraseña);
        IngresarContraseña.setBounds(186, 136, 133, 20);
        getContentPane().add(IngresarCorreo);
        IngresarCorreo.setBounds(186, 174, 133, 20);
        getContentPane().add(FechaDia);
        FechaDia.setBounds(186, 212, 37, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiempre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(229, 212, 76, 20);
        getContentPane().add(FechaAño);
        FechaAño.setBounds(323, 212, 52, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/demo/view/caballitos-de-totora.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarNombreActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        VistaLogin vl2 = new VistaLogin();
        vl2.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FechaAño;
    private javax.swing.JTextField FechaDia;
    private javax.swing.JTextField IngresarApellido;
    private javax.swing.JTextField IngresarContraseña;
    private javax.swing.JTextField IngresarCorreo;
    private javax.swing.JTextField IngresarID;
    private javax.swing.JTextField IngresarNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}