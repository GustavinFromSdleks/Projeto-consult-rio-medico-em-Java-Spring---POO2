package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class DisponibilidadeManager {

    private static final String BASE_URL = "https://lucas4897.c44.integrator.host/disponibilidades/";

    // Criar uma nova disponibilidade
    public static String createDisponibilidade(String data, boolean disponivel, int medicoId) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("data", data);
            requestBody.put("disponivel", disponivel);
            requestBody.put("medicoId", medicoId);

            return sendPostRequest("", requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Buscar uma disponibilidade pelo ID
    public static String getDisponibilidadeById(int id) {
        return sendGetRequest(id);
    }

    // Atualizar uma disponibilidade pelo ID
    public static String updateDisponibilidade(int id, String data, boolean disponivel) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("data", data);
            requestBody.put("disponivel", disponivel);

            return sendPutRequest(id, requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Deletar uma disponibilidade pelo ID
    public static String deleteDisponibilidade(int id) {
        return sendDeleteRequest(id);
    }

    // Buscar todas as disponibilidades
    public static String getAllDisponibilidades() {
        return sendGetRequest("all");
    }

    // Buscar disponibilidades de um médico específico
    public static String getDisponibilidadesByMedico(int medicoId) {
        return sendGetRequest("medico/" + medicoId);
    }

    // Métodos auxiliares para requisições HTTP

    private static String sendGetRequest(Object endpoint) {
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

    private static String sendPostRequest(String endpoint, String jsonBody) {
        return sendWriteRequest(endpoint, jsonBody, "POST");
    }

    private static String sendPutRequest(int id, String jsonBody) {
        return sendWriteRequest("update/" + id, jsonBody, "PUT");
    }

    private static String sendDeleteRequest(int id) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + "delete/" + id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("DELETE");
            connection.setRequestProperty("Authorization", "Bearer " + authToken);

            return getResponse(connection);
        } catch (Exception e) {
            return "Erro na requisição: " + e.getMessage();
        }
    }

    private static String sendWriteRequest(String endpoint, String jsonBody, String method) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
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