/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_consultoriomedico.Manager;

/**
 *
 * @author lucas
 */
public class TokenManager {
    
    private static String token;

    // Método para definir o token
    public static void setToken(String newToken) {
        token = newToken;
    }

    // Método para obter o token
    public static String getToken() {
        return token;
    }

    // Método para limpar o token (logout)
    public static void clearToken() {
        token = null;
    }
}
