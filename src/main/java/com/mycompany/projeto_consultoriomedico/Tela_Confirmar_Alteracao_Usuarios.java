/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico;

/**
 *
 * @author User
 */
public class Tela_Confirmar_Alteracao_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form TELA_ADM_CONFIRMAR_ALTERACAO_USUARIOS
     */
    public Tela_Confirmar_Alteracao_Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        TelaUtil.padronizarTela(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox4 = new javax.swing.JCheckBox();
        JTFusuario6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JBTsair = new javax.swing.JButton();
        JLBversion1 = new javax.swing.JLabel();
        JLBusuario2 = new javax.swing.JLabel();
        JTFusuario = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        JLBusuario3 = new javax.swing.JLabel();
        JTFusuario2 = new javax.swing.JTextField();
        JLBusuario4 = new javax.swing.JLabel();
        JBTsair1 = new javax.swing.JButton();
        JLBsenha2 = new javax.swing.JLabel();
        JTFusuario3 = new javax.swing.JTextField();
        JLBversion2 = new javax.swing.JLabel();
        JBTsair2 = new javax.swing.JButton();
        JTFusuario4 = new javax.swing.JTextField();
        JLBusuario5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        JTFusuario5 = new javax.swing.JTextField();
        JTFusuario7 = new javax.swing.JTextField();
        JLBusuario6 = new javax.swing.JLabel();
        JLBusuario7 = new javax.swing.JLabel();

        jCheckBox4.setText("nao alterar");

        JTFusuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 104, 41));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        JBTsair.setText("Voltar");
        JBTsair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLBversion1.setText("Version 0.01");

        JLBusuario2.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLBusuario2.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario2.setText("ALTERAR USUARIO");

        JTFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuarioActionPerformed(evt);
            }
        });

        jCheckBox1.setText("nao alterar");

        JLBusuario3.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario3.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario3.setText("Novo Nome ");

        JTFusuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario2ActionPerformed(evt);
            }
        });

        JLBusuario4.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario4.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario4.setText("Antigo CPF");

        JBTsair1.setText("Salvar e Sair");
        JBTsair1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLBsenha2.setBackground(new java.awt.Color(88, 93, 96));
        JLBsenha2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBsenha2.setForeground(new java.awt.Color(101, 98, 98));
        JLBsenha2.setText("Antigo numero Telefone");

        JTFusuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario3ActionPerformed(evt);
            }
        });

        JLBversion2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        JLBversion2.setForeground(new java.awt.Color(88, 93, 96));
        JLBversion2.setText("OBS: nao deixe campos vazios se nao for alterar tique em nao alterar");

        JBTsair2.setText("Prosseguir");
        JBTsair2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTFusuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario4ActionPerformed(evt);
            }
        });

        JLBusuario5.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario5.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario5.setText("Antigo Nome");

        jCheckBox2.setText("nao alterar");

        jCheckBox5.setText("nao alterar");

        JTFusuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario5ActionPerformed(evt);
            }
        });

        JTFusuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuario7ActionPerformed(evt);
            }
        });

        JLBusuario6.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario6.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario6.setText("Novo numero Telefone");

        JLBusuario7.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario7.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario7.setText("Novo CPF ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBTsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(JBTsair2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLBversion2))
                .addGap(183, 183, 183))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JTFusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JTFusuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addComponent(JLBusuario5)
                            .addComponent(JLBusuario4)
                            .addComponent(JLBsenha2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JTFusuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBusuario6)
                            .addComponent(JTFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBusuario3)
                            .addComponent(JTFusuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFusuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBusuario7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(JLBversion1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(JLBusuario2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(JBTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLBusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBusuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBusuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFusuario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(JTFusuario7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBusuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBusuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(JTFusuario5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBusuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBsenha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFusuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(JLBversion2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTsair1)
                    .addComponent(JBTsair2))
                .addGap(18, 18, 18)
                .addComponent(JBTsair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(JLBversion1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void JTFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioActionPerformed

    private void JTFusuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario2ActionPerformed

    private void JTFusuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario3ActionPerformed

    private void JTFusuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario4ActionPerformed

    private void JTFusuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario5ActionPerformed

    private void JTFusuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario6ActionPerformed

    private void JTFusuario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuario7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuario7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Confirmar_Alteracao_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Alteracao_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Alteracao_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Alteracao_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Confirmar_Alteracao_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTsair;
    private javax.swing.JButton JBTsair1;
    private javax.swing.JButton JBTsair2;
    private javax.swing.JLabel JLBsenha2;
    private javax.swing.JLabel JLBusuario2;
    private javax.swing.JLabel JLBusuario3;
    private javax.swing.JLabel JLBusuario4;
    private javax.swing.JLabel JLBusuario5;
    private javax.swing.JLabel JLBusuario6;
    private javax.swing.JLabel JLBusuario7;
    private javax.swing.JLabel JLBversion1;
    private javax.swing.JLabel JLBversion2;
    private javax.swing.JTextField JTFusuario;
    private javax.swing.JTextField JTFusuario2;
    private javax.swing.JTextField JTFusuario3;
    private javax.swing.JTextField JTFusuario4;
    private javax.swing.JTextField JTFusuario5;
    private javax.swing.JTextField JTFusuario6;
    private javax.swing.JTextField JTFusuario7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
