package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RecepcionistaManager {

    private static final String BASE_URL = "http://localhost:14498/recepcionista/";

    // Atualiza um recepcionista pelo CPF
    public static String updateRecepcionista(String cpf, String nome, String estado, String cidade, String bairro, 
                                              String rua, int numero, String telefone, String login, String password) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("nome", nome);
            requestBody.put("cpf", cpf);
            requestBody.put("estado", estado);
            requestBody.put("cidade", cidade);
            requestBody.put("bairro", bairro);
            requestBody.put("rua", rua);
            requestBody.put("numero", numero);
            requestBody.put("telefone", telefone);
            requestBody.put("login", login);
            requestBody.put("password", password);
            requestBody.put("role", "RECEPCIONISTA");

            return sendPutRequest("update/" + cpf, requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Busca um recepcionista pelo CPF
    public static String getRecepcionistaByCpf(String cpf) {
        return sendGetRequest("get/" + cpf);
    }

    // Busca todos os recepcionistas
    public static String getAllRecepcionistas() {
        return sendGetRequest("get/all");
    }

    // Deleta um recepcionista pelo CPF
    public static String deleteRecepcionista(String cpf) {
        return sendDeleteRequest(cpf);
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
        return sendWriteRequest(endpoint, jsonBody, "PUT");
    }

    private static String sendDeleteRequest(String cpf) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + "delete/" + cpf);
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