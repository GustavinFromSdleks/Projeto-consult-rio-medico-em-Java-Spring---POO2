/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico;

/**
 *
 * @author lucas
 */
import javax.swing.JFrame;

public class TelaUtil {

    public static void padronizarTela(JFrame frame) {
        frame.setSize(800, 600); // Define um tamanho inicial
        frame.setMinimumSize(new java.awt.Dimension(960, 600)); // Define um tamanho mínimo
        frame.setLocationRelativeTo(null); // Centraliza a tela
        frame.pack(); // Ajusta automaticamente ao conteúdo
    }
}
