/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico;

/**
 *
 * @author User
 */
public class TELA_ADM_VIEW_RECEPCIONISTA extends javax.swing.JFrame {

    /**
     * Creates new form TELA_ADM_VIEW_RECEPCIONISTA
     */
    public TELA_ADM_VIEW_RECEPCIONISTA() {
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
        JBTcadastrarRecepcionista = new javax.swing.JButton();
        JBTalterarRecepcionista = new javax.swing.JButton();
        JBTconsultarRecepcionista = new javax.swing.JButton();
        JBTexcluirRecepcionista = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JLBnomeClinica = new javax.swing.JLabel();
        JLBiconeClinica = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JLBversion = new javax.swing.JLabel();
        JBTvoltar = new javax.swing.JButton();
        JBTsair = new javax.swing.JButton();
        JLBsubtitulo = new javax.swing.JLabel();
        JBTselectMedico = new javax.swing.JButton();
        JBTselectRecepcionista = new javax.swing.JButton();
        JLBtitulo = new javax.swing.JLabel();
        JBTselectMedico1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(104, 104, 104));

        JBTcadastrarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTcadastrarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTcadastrarRecepcionista.setForeground(new java.awt.Color(88, 93, 96));
        JBTcadastrarRecepcionista.setText("CADASTRAR");
        JBTcadastrarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTcadastrarRecepcionista.setIconTextGap(1);
        JBTcadastrarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcadastrarRecepcionistaActionPerformed(evt);
            }
        });

        JBTalterarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTalterarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTalterarRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTalterarRecepcionista.setText("ALTERAR");
        JBTalterarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTalterarRecepcionista.setIconTextGap(1);
        JBTalterarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTalterarRecepcionistaActionPerformed(evt);
            }
        });

        JBTconsultarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTconsultarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTconsultarRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTconsultarRecepcionista.setText("CONSULTAR");
        JBTconsultarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTconsultarRecepcionista.setIconTextGap(1);
        JBTconsultarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTconsultarRecepcionistaActionPerformed(evt);
            }
        });

        JBTexcluirRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTexcluirRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTexcluirRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTexcluirRecepcionista.setText("EXCLUIR");
        JBTexcluirRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTexcluirRecepcionista.setHideActionText(true);
        JBTexcluirRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTexcluirRecepcionista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTexcluirRecepcionista.setIconTextGap(1);
        JBTexcluirRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTexcluirRecepcionistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(JBTcadastrarRecepcionista)
                .addGap(50, 50, 50)
                .addComponent(JBTconsultarRecepcionista)
                .addGap(50, 50, 50)
                .addComponent(JBTalterarRecepcionista)
                .addGap(50, 50, 50)
                .addComponent(JBTexcluirRecepcionista)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTalterarRecepcionista)
                    .addComponent(JBTconsultarRecepcionista)
                    .addComponent(JBTexcluirRecepcionista)
                    .addComponent(JBTcadastrarRecepcionista))
                .addContainerGap())
        );

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
                .addGap(131, 131, 131)
                .addComponent(JLBnomeClinica)
                .addGap(18, 18, 18)
                .addComponent(JLBiconeClinica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLBiconeClinica)
                    .addComponent(JLBnomeClinica))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        JLBversion.setText("Version 0.01");

        JBTvoltar.setText("Voltar");
        JBTvoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTvoltarActionPerformed(evt);
            }
        });

        JBTsair.setText("Sair");
        JBTsair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTsairActionPerformed(evt);
            }
        });

        JLBsubtitulo.setBackground(new java.awt.Color(94, 94, 94));
        JLBsubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLBsubtitulo.setForeground(new java.awt.Color(94, 94, 94));
        JLBsubtitulo.setText("Gerenciando Recepcionista");

        JBTselectMedico.setBackground(new java.awt.Color(245, 245, 245));
        JBTselectMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBTselectMedico.setForeground(new java.awt.Color(94, 94, 94));
        JBTselectMedico.setText("MEDICO");
        JBTselectMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTselectMedico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTselectMedico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTselectMedico.setIconTextGap(35);
        JBTselectMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTselectMedicoActionPerformed(evt);
            }
        });

        JBTselectRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTselectRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBTselectRecepcionista.setForeground(new java.awt.Color(43, 104, 41));
        JBTselectRecepcionista.setText("RECEPCIONISTA");
        JBTselectRecepcionista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTselectRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTselectRecepcionista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTselectRecepcionista.setIconTextGap(35);

        JLBtitulo.setBackground(new java.awt.Color(88, 93, 96));
        JLBtitulo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        JLBtitulo.setForeground(new java.awt.Color(88, 93, 96));
        JLBtitulo.setText("DASHBOARD ADMINISTRADOR");
        JLBtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JLBtitulo.setIconTextGap(1);

        JBTselectMedico1.setBackground(new java.awt.Color(245, 245, 245));
        JBTselectMedico1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBTselectMedico1.setForeground(new java.awt.Color(94, 94, 94));
        JBTselectMedico1.setText("ADMINISTRADOR");
        JBTselectMedico1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTselectMedico1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTselectMedico1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTselectMedico1.setIconTextGap(35);
        JBTselectMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTselectMedico1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(JLBversion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTselectMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTselectMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTselectRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBsubtitulo))
                    .addComponent(JLBtitulo))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JLBtitulo)
                .addGap(45, 45, 45)
                .addComponent(JLBsubtitulo)
                .addGap(18, 18, 18)
                .addComponent(JBTselectRecepcionista)
                .addGap(18, 18, 18)
                .addComponent(JBTselectMedico)
                .addGap(18, 18, 18)
                .addComponent(JBTselectMedico1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTvoltar)
                .addGap(18, 18, 18)
                .addComponent(JBTsair)
                .addGap(18, 18, 18)
                .addComponent(JLBversion))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltarActionPerformed
        this.dispose();
         TELA_CENTRAL_ADM telaAnterior = new TELA_CENTRAL_ADM();
         telaAnterior.setVisible(true);
    }//GEN-LAST:event_JBTvoltarActionPerformed

    private void JBTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBTsairActionPerformed

    private void JBTselectMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTselectMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTselectMedicoActionPerformed

    private void JBTalterarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTalterarRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTalterarRecepcionistaActionPerformed

    private void JBTselectMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTselectMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTselectMedico1ActionPerformed

    private void JBTcadastrarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcadastrarRecepcionistaActionPerformed
        TELA_ADM_CADASTRAR_RECEPCIONISTA telaCadRec = new TELA_ADM_CADASTRAR_RECEPCIONISTA();
        telaCadRec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTcadastrarRecepcionistaActionPerformed

    private void JBTconsultarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTconsultarRecepcionistaActionPerformed
        TELA_ADM_CONSULTAR_RECEPCIONISTA telaConsRec = new TELA_ADM_CONSULTAR_RECEPCIONISTA();
        telaConsRec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTconsultarRecepcionistaActionPerformed

    private void JBTexcluirRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTexcluirRecepcionistaActionPerformed
        TELA_ADM_EXCLUIR_USUARIO telaExclui = new TELA_ADM_EXCLUIR_USUARIO();
        telaExclui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTexcluirRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(TELA_ADM_VIEW_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_VIEW_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_VIEW_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_VIEW_RECEPCIONISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_ADM_VIEW_RECEPCIONISTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTalterarRecepcionista;
    private javax.swing.JButton JBTcadastrarRecepcionista;
    private javax.swing.JButton JBTconsultarRecepcionista;
    private javax.swing.JButton JBTexcluirRecepcionista;
    private javax.swing.JButton JBTsair;
    private javax.swing.JButton JBTselectMedico;
    private javax.swing.JButton JBTselectMedico1;
    private javax.swing.JButton JBTselectRecepcionista;
    private javax.swing.JButton JBTvoltar;
    private javax.swing.JLabel JLBiconeClinica;
    private javax.swing.JLabel JLBnomeClinica;
    private javax.swing.JLabel JLBsubtitulo;
    private javax.swing.JLabel JLBtitulo;
    private javax.swing.JLabel JLBversion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
