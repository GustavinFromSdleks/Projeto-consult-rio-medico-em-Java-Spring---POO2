/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico;

/**
 *
 * @author User
 */
public class TELA_ADM_RESULTADO_CONSULTA_MEDICO extends javax.swing.JFrame {

    /**
     * Creates new form TELA_ADM_RESULTADO_CONSULTA_MEDICO
     */
    public TELA_ADM_RESULTADO_CONSULTA_MEDICO() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        JBTcadastrarRecepcionista = new javax.swing.JButton();
        JBTconsultarRecepcionista = new javax.swing.JButton();
        JBTalterarRecepcionista = new javax.swing.JButton();
        JBTexcluirRecepcionista = new javax.swing.JButton();
        JLBusuario2 = new javax.swing.JLabel();
        JLBversion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 104, 41));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "ID", "Telefone", "CRM"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(245, 245, 245));
        jButton1.setForeground(new java.awt.Color(88, 93, 96));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\ICONS\\icons8-retornar-24.png")); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setIconTextGap(1);

        JBTcadastrarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTcadastrarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTcadastrarRecepcionista.setForeground(new java.awt.Color(88, 93, 96));
        JBTcadastrarRecepcionista.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\ICONS\\icons8-cadastro-50.png")); // NOI18N
        JBTcadastrarRecepcionista.setText("CADASTRAR");
        JBTcadastrarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTcadastrarRecepcionista.setIconTextGap(1);

        JBTconsultarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTconsultarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTconsultarRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTconsultarRecepcionista.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\ICONS\\icons8-pesquisar-documento-50.png")); // NOI18N
        JBTconsultarRecepcionista.setText("NOVA CONSULTA");
        JBTconsultarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTconsultarRecepcionista.setIconTextGap(1);

        JBTalterarRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTalterarRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTalterarRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTalterarRecepcionista.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\ICONS\\icons8-editar-usuário-masculino-48.png")); // NOI18N
        JBTalterarRecepcionista.setText("ALTERAR");
        JBTalterarRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTalterarRecepcionista.setIconTextGap(1);
        JBTalterarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTalterarRecepcionistaActionPerformed(evt);
            }
        });

        JBTexcluirRecepcionista.setBackground(new java.awt.Color(245, 245, 245));
        JBTexcluirRecepcionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBTexcluirRecepcionista.setForeground(new java.awt.Color(60, 63, 65));
        JBTexcluirRecepcionista.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\ICONS\\icons8-excluir-propriedade-50.png")); // NOI18N
        JBTexcluirRecepcionista.setText("EXCLUIR");
        JBTexcluirRecepcionista.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        JBTexcluirRecepcionista.setHideActionText(true);
        JBTexcluirRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JBTexcluirRecepcionista.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBTexcluirRecepcionista.setIconTextGap(1);
        JBTexcluirRecepcionista.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JLBusuario2.setBackground(new java.awt.Color(88, 93, 96));
        JLBusuario2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        JLBusuario2.setForeground(new java.awt.Color(101, 98, 98));
        JLBusuario2.setText("RESULTADO DE SUA CONSULTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBTcadastrarRecepcionista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(JBTconsultarRecepcionista)
                .addGap(30, 30, 30)
                .addComponent(JBTalterarRecepcionista)
                .addGap(30, 30, 30)
                .addComponent(JBTexcluirRecepcionista)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(JLBusuario2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(JLBusuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTcadastrarRecepcionista)
                    .addComponent(JBTconsultarRecepcionista)
                    .addComponent(JBTalterarRecepcionista)
                    .addComponent(JBTexcluirRecepcionista))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JLBversion1.setText("Version 0.01");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLBversion1)
                        .addGap(442, 442, 442))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBversion1)
                .addContainerGap())
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

    private void JBTalterarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTalterarRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTalterarRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(TELA_ADM_RESULTADO_CONSULTA_MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_RESULTADO_CONSULTA_MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_RESULTADO_CONSULTA_MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TELA_ADM_RESULTADO_CONSULTA_MEDICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TELA_ADM_RESULTADO_CONSULTA_MEDICO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTalterarRecepcionista;
    private javax.swing.JButton JBTcadastrarRecepcionista;
    private javax.swing.JButton JBTconsultarRecepcionista;
    private javax.swing.JButton JBTexcluirRecepcionista;
    private javax.swing.JLabel JLBusuario2;
    private javax.swing.JLabel JLBversion1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
