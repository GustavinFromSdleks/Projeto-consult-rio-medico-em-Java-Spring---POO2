package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ConsultaManager {

    private static final String BASE_URL = "https://lucas4897.c44.integrator.host/consulta/";

    // Criar uma nova consulta
    public static String createConsulta(String data, boolean status, boolean pagamento, int medicoId, int pacienteId) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("data", data);
            requestBody.put("status", status);
            requestBody.put("pagamento", pagamento);
            requestBody.put("medicoId", medicoId);
            requestBody.put("pacienteId", pacienteId);

            return sendPostRequest("create", requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Atualizar uma consulta pelo ID
    public static String updateConsulta(int id, String data, boolean status, boolean pagamento) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("data", data);
            requestBody.put("status", status);
            requestBody.put("pagamento", pagamento);

            return sendPutRequest("update/" + id, requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Buscar uma consulta pelo ID
    public static String getConsultaById(int id) {
        return sendGetRequest("get/" + id);
    }

    // Buscar todas as consultas
    public static String getAllConsultas() {
        return sendGetRequest("get/all");
    }

    // Deletar uma consulta pelo ID
    public static String deleteConsulta(int id) {
        return sendDeleteRequest("delete/" + id);
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

    private static String sendPostRequest(String endpoint, String jsonBody) {
        return sendWriteRequest(endpoint, jsonBody, "POST");
    }

    private static String sendPutRequest(String endpoint, String jsonBody) {
        return sendWriteRequest(endpoint, jsonBody, "PUT");
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