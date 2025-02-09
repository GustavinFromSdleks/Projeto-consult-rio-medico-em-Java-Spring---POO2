package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class MedicoManager {

    private static final String BASE_URL = "http://localhost:14498/medico/";

    // Atualiza um médico pelo CPF
    public static String updateMedico(String cpf, String nome, String crm, String especialidade, String estado, 
                                      String cidade, String bairro, String rua, int numero, String telefone, 
                                      String login, String password) {
        try {
            JSONObject requestBody = new JSONObject();
            requestBody.put("nome", nome);
            requestBody.put("cpf", cpf);
            requestBody.put("crm", crm);
            requestBody.put("especialidade", especialidade);
            requestBody.put("estado", estado);
            requestBody.put("cidade", cidade);
            requestBody.put("bairro", bairro);
            requestBody.put("rua", rua);
            requestBody.put("numero", numero);
            requestBody.put("telefone", telefone);
            requestBody.put("login", login);
            requestBody.put("password", password);
            requestBody.put("role", "ADMIN");

            return sendPutRequest("update/" + cpf, requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

    // Busca médicos por especialidade
    public static String getMedicoByEspecialidade(String especialidade) {
        return sendGetRequest("get/" + especialidade);
    }

    // Busca um médico pelo CRM
    public static String getMedicoByCrm(String crm) {
        return sendGetRequest("get/" + crm);
    }

    // Busca um médico pelo CPF
    public static String getMedicoByCpf(String cpf) {
        return sendGetRequest("get/" + cpf);
    }

    // Busca todos os médicos
    public static String getAllMedicos() {
        return sendGetRequest("get/all");
    }

    // Deleta um médico pelo CPF
    public static String deleteMedico(String cpf) {
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