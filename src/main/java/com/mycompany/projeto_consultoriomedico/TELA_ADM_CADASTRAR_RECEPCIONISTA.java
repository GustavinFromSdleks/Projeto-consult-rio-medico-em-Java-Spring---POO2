/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico;

/**
 *
 * @author User
 */
public class TELA_ADM_CADASTRAR_RECEPCIONISTA extends javax.swing.JFrame {

    /**
     * Creates new form TELA_ADM_CADASTRAR_RECEPCIONISTA
     */
    public TELA_ADM_CADASTRAR_RECEPCIONISTA() {
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

        jPanel2 = new javax.swing.JPanel();
        JLBnomeClinica = new javax.swing.JLabel();
        JLBiconeClinica = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLBsenha = new javax.swing.JLabel();
        JTFsenha = new javax.swing.JTextField();
        JTFusuario = new javax.swing.JTextField();
        JLBusuario1 = new javax.swing.JLabel();
        JLBusuario2 = new javax.swing.JLabel();
        JLBversion = new javax.swing.JLabel();
        JBTvoltar = new javax.swing.JButton();
        JBTsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(43, 104, 41));

        JLBnomeClinica.setBackground(new java.awt.Color(255, 255, 255));
        JLBnomeClinica.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        JLBnomeClinica.setForeground(new java.awt.Color(255, 255, 255));
        JLBnomeClinica.setText("SDLEKS MED");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(JLBnomeClinica)
                .addGap(18, 18, 18)
                .addComponent(JLBiconeClinica)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBnomeClinica)
                    .addComponent(JLBiconeClinica))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        JLBsenha.setBackground(new java.awt.Color(88, 93, 96));
        JLBsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBsenha.setForeground(new java.awt.Color(101, 98, 98));
        JLBsenha.setText("CPF");

        JTFsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFsenhaActionPerformed(evt);
            }
        });

        JTFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFusuarioActionPerformed(evt);
            }
        });

        JLBusuario1.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLBusuario1.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario1.setText("Nome Completo");

        JLBusuario2.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLBusuario2.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario2.setText("CADASTRAR RECEPCIONISTA");

        JLBversion.setText("Version 0.01");

        JBTvoltar.setText("Continuar");
        JBTvoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBTsair.setText("Voltar");
        JBTsair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBusuario2)
                            .addComponent(JLBsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBusuario1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(JTFsenha, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(JLBversion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(JBTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(JBTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JLBusuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLBusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTvoltar)
                .addGap(12, 12, 12)
                .addComponent(JBTsair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBversion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFsenhaActionPerformed

    private void JTFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFusuarioActionPerformed

    private void JBTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsairActionPerformed
        this.dispose();
         TELA_ADM_VIEW_RECEPCIONISTA telaAnterior = new TELA_ADM_VIEW_RECEPCIONISTA();
         telaAnterior.setVisible(true);
    }//GEN-LAST:event_JBTsairActionPerformed

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
            java.util.logging.Logger.getLogger(TELA_ADM_CADASTRAR_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_CADASTRAR_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_CADASTRAR_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_CADASTRAR_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_ADM_CADASTRAR_RECEPCIONISTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTsair;
    private javax.swing.JButton JBTvoltar;
    private javax.swing.JLabel JLBiconeClinica;
    private javax.swing.JLabel JLBnomeClinica;
    private javax.swing.JLabel JLBsenha;
    private javax.swing.JLabel JLBusuario1;
    private javax.swing.JLabel JLBusuario2;
    private javax.swing.JLabel JLBversion;
    private javax.swing.JTextField JTFsenha;
    private javax.swing.JTextField JTFusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
