package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class AdminManager {

    private static final String BASE_URL = "https://lucas4897.c44.integrator.host/admin/";

    // Método para buscar um administrador pelo CPF
    public static String getAdminByCpf(String cpf) {
        return sendGetRequest("get/" + cpf);
    }

    // Método para buscar todos os administradores
    public static String getAllAdmins() {
        return sendGetRequest("get/all");
    }

    // Método para atualizar um administrador
    public static String updateAdmin(String cpf, String nome, String login, String password) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("nome", nome);
            requestBody.put("cpf", cpf);
            requestBody.put("login", login);
            requestBody.put("password", password);
            requestBody.put("role", "ADMIN");

            return sendPutRequest("update/" + cpf, requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Método para deletar um administrador pelo CPF
    public static String deleteAdmin(String cpf) {
        return sendDeleteRequest("delete/" + cpf);
    }

    // Métodos auxiliares para requisições HTTP

    private static String sendGetRequest(String endpoint) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + authToken);

            return getResponse(connection);
        } catch (Exception e) {
            return "Erro na requisição: " + e.getMessage();
        }
    }

    private static String sendPutRequest(String endpoint, String jsonBody) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Authorization", "Bearer " + authToken);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                outputStream.writeBytes(jsonBody);
                outputStream.flush();
            }

            return getResponse(connection);
        } catch (Exception e) {
            return "Erro na requisição: " + e.getMessage();
        }
    }

    private static String sendDeleteRequest(String endpoint) {
    try {
        String authToken = TokenManager.getToken();
        if (authToken == null || authToken.isEmpty()) {
            return "Token de autenticação inválido ou não encontrado!";
        }

        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Authorization", "Bearer " + authToken);

        int responseCode = connection.getResponseCode();

        // Verifica se o código é 204 (sem conteúdo) e trata como sucesso
        if (responseCode == 204) {
            return "Administrador excluído com sucesso!";
        }

        return getResponse(connection);
    } catch (Exception e) {
        return "Erro na requisição: " + e.getMessage();
    }
}


    // Método para obter a resposta da requisição HTTP
    private static String getResponse(HttpURLConnection connection) {
        try {
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString();
            } else {
                return "Erro na requisição: Código " + responseCode;
            }
        } catch (Exception e) {
            return "Erro ao ler resposta: " + e.getMessage();
        }
    }
}