/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico.Adm;

import com.mycompany.projeto_consultoriomedico.Medico.Tela_Adm_View_Medico;
import com.mycompany.projeto_consultoriomedico.Recepcionista.Tela_Adm_View_Recepcionista;
import com.mycompany.projeto_consultoriomedico.TelaUtil;
import com.mycompany.projeto_consultoriomedico.Tela_Login;

/**
 *
 * @author User
 */
public class Tela_Dashboard_Adm extends javax.swing.JFrame {

    /**
     * Creates new form TELA_CENTRAL_ADM
     */
    public Tela_Dashboard_Adm() {
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

        JLBnome_projeto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLBhome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLBnomeClinica = new javax.swing.JLabel();
        JLBiconeClinica = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JLBBversao = new javax.swing.JLabel();
        JBTvoltar = new javax.swing.JButton();
        JBTsair = new javax.swing.JButton();
        JLBsubtitulo = new javax.swing.JLabel();
        JBTselectMedico = new javax.swing.JButton();
        JBTselectRecepcionista = new javax.swing.JButton();
        JLBtitulo = new javax.swing.JLabel();
        JBTselectMedico1 = new javax.swing.JButton();

        JLBnome_projeto.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        JLBnome_projeto.setForeground(new java.awt.Color(255, 255, 255));
        JLBnome_projeto.setText("SDLEKS MED");
        JLBnome_projeto.setAlignmentY(0.0F);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 104, 41));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(104, 104, 104));

        JLBhome.setBackground(new java.awt.Color(245, 245, 245));
        JLBhome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JLBhome.setForeground(new java.awt.Color(88, 93, 96));
        JLBhome.setText("HOME");
        JLBhome.setIconTextGap(1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(JLBhome)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(JLBhome)
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
                .addGap(207, 207, 207)
                .addComponent(JLBnomeClinica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBiconeClinica)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBiconeClinica)
                    .addComponent(JLBnomeClinica))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        JLBBversao.setText("Version 0.01");

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
        JLBsubtitulo.setText("Gerenciar");

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
        JBTselectRecepcionista.setForeground(new java.awt.Color(94, 94, 94));
        JBTselectRecepcionista.setText("RECEPCIONISTA");
        JBTselectRecepcionista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBTselectRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTselectRecepcionista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTselectRecepcionista.setIconTextGap(35);
        JBTselectRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTselectRecepcionistaActionPerformed(evt);
            }
        });

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
                        .addComponent(JLBBversao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBsubtitulo)
                            .addComponent(JBTselectRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBTselectMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBTsair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JLBtitulo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTselectMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JLBtitulo)
                .addGap(93, 93, 93)
                .addComponent(JLBsubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBTselectRecepcionista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBTselectMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBTselectMedico1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTvoltar)
                .addGap(18, 18, 18)
                .addComponent(JBTsair)
                .addGap(18, 18, 18)
                .addComponent(JLBBversao))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltarActionPerformed
        new Tela_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTvoltarActionPerformed

    private void JBTsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBTsairActionPerformed

    private void JBTselectMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTselectMedico1ActionPerformed
        Tela_Adm_View_Adm TelaViewADM = new Tela_Adm_View_Adm();
        TelaViewADM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTselectMedico1ActionPerformed

    private void JBTselectRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTselectRecepcionistaActionPerformed
        Tela_Adm_View_Recepcionista telaAdmViewRec = new Tela_Adm_View_Recepcionista();
        telaAdmViewRec .setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTselectRecepcionistaActionPerformed

    private void JBTselectMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTselectMedicoActionPerformed
        Tela_Adm_View_Medico telaAdmViewMed = new Tela_Adm_View_Medico();
        telaAdmViewMed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTselectMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Dashboard_Adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Dashboard_Adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTsair;
    private javax.swing.JButton JBTselectMedico;
    private javax.swing.JButton JBTselectMedico1;
    private javax.swing.JButton JBTselectRecepcionista;
    private javax.swing.JButton JBTvoltar;
    private javax.swing.JLabel JLBBversao;
    private javax.swing.JLabel JLBhome;
    private javax.swing.JLabel JLBiconeClinica;
    private javax.swing.JLabel JLBnomeClinica;
    private javax.swing.JLabel JLBnome_projeto;
    private javax.swing.JLabel JLBsubtitulo;
    private javax.swing.JLabel JLBtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
