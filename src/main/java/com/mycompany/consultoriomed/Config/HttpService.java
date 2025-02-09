package com.mycompany.consultoriomed.Config;

import com.mycompany.projeto_consultoriomedico.Manager.TokenManager;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpService {

    private static final String BASE_URL = "http://localhost:14498";

    // Método para fazer requisições POST
    public static String sendPostRequest(String endpoint, String jsonBody, boolean requiresAuth) {
        try {
            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            // Adiciona o token se necessário
            if (requiresAuth) {
                String token = TokenManager.getToken();
                if (token == null || token.isEmpty()) {
                    return "Erro: Token de autenticação não encontrado!";
                }
                connection.setRequestProperty("Authorization", "Bearer " + token);
            }

            // Envia o JSON no corpo da requisição
            connection.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                wr.writeBytes(jsonBody);
                wr.flush();
            }

            // Obtém a resposta
            return getResponse(connection);
        } catch (Exception e) {
            return "Erro na requisição: " + e.getMessage();
        }
    }

    // Método para fazer requisições GET
    public static String sendGetRequest(String endpoint, boolean requiresAuth) {
        try {
            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Adiciona o token se necessário
            if (requiresAuth) {
                String token = TokenManager.getToken();
                if (token == null || token.isEmpty()) {
                    return "Erro: Token de autenticação não encontrado!";
                }
                connection.setRequestProperty("Authorization", "Bearer " + token);
            }

            // Obtém a resposta
            return getResponse(connection);
        } catch (Exception e) {
            return "Erro na requisição: " + e.getMessage();
        }
    }

    // Método auxiliar para ler a resposta da requisição
    private static String getResponse(HttpURLConnection connection) {
        try {
            int responseCode = connection.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                responseCode == HttpURLConnection.HTTP_OK ? 
                connection.getInputStream() : connection.getErrorStream()
            ));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } catch (Exception e) {
            return "Erro ao processar resposta: " + e.getMessage();
        }
    }
}