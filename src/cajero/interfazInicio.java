/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.Color;

/**
 *
 * @author Julian Esteban Polan
 */
public class interfazInicio extends javax.swing.JFrame {

    /**
     * Creates new form interfazInicio
     */
    public interfazInicio() {
        initComponents();
        //TextPrompt usuario = new TextPrompt("Escriba su numero de identificacion", txtUsuario);
        TextPrompt contrasena = new TextPrompt("Recuerde cambiar su clave periodicamente", txtContra);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(254,244,232));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        botonNueve = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonCorregir = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonOcho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Digite su clave para continuar y presione continuar");

        txtContra.setBackground(new java.awt.Color(254, 244, 232));
        txtContra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero/twitter_header_photo_1.png"))); // NOI18N

        botonNueve.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonNueve.setText("9");
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });

        botonCero.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        botonCancelar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setPreferredSize(new java.awt.Dimension(189, 51));

        botonUno.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonUno.setText("1");
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });

        botonCorregir.setBackground(new java.awt.Color(255, 255, 51));
        botonCorregir.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCorregir.setText("Corregir");
        botonCorregir.setPreferredSize(new java.awt.Dimension(189, 51));
        botonCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCorregirActionPerformed(evt);
            }
        });

        botonDos.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonDos.setText("2");
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(51, 255, 51));
        botonContinuar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonContinuar.setText("Continuar");

        botonTres.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonTres.setText("3");
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });

        botonCuatro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });

        botonCinco.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonCinco.setText("5");
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });

        botonSeis.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonSeis.setText("6");
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });

        botonSiete.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonSiete.setText("7");
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("■");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonOcho.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonOcho.setText("8");
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCuatro)
                        .addGap(6, 6, 6)
                        .addComponent(botonCinco)
                        .addGap(6, 6, 6)
                        .addComponent(botonSeis)
                        .addGap(10, 10, 10)
                        .addComponent(botonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTres)
                        .addGap(10, 10, 10)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSiete)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonOcho)
                                .addGap(6, 6, 6)
                                .addComponent(botonNueve)
                                .addGap(10, 10, 10)
                                .addComponent(botonContinuar)))))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonUno)
                    .addComponent(botonDos)
                    .addComponent(botonTres)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCuatro)
                    .addComponent(botonCinco)
                    .addComponent(botonSeis)
                    .addComponent(botonCorregir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSiete)
                    .addComponent(botonOcho)
                    .addComponent(botonNueve)
                    .addComponent(botonContinuar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"9");
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"0");
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"1");
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCorregirActionPerformed
        // TODO add your handling code here:
        txtContra.setText("");
    }//GEN-LAST:event_botonCorregirActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"2");
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"3");
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"4");
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"5");
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"6");
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"7");
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        // TODO add your handling code here:
        String texto = txtContra.getText();
        txtContra.setText(texto+"8");
    }//GEN-LAST:event_botonOchoActionPerformed

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
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonCorregir;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
}