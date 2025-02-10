package com.mycompany.projeto_consultoriomedico.Manager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class MedicoManager {

    private static final String BASE_URL = "https://lucas4897.c44.integrator.host/medico/";

    // Cadastra um novo médico
    public static String createMedico(String cpf, String nome, String crm, String especialidade, String estado, 
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

            return sendPostRequest("create", requestBody.toString());
        } catch (Exception e) {
            return "Erro ao criar JSON: " + e.getMessage();
        }
    }

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

    // Métodos para buscar médicos
    public static String getMedicoByEspecialidade(String especialidade) {
        return sendGetRequest("get/" + especialidade);
    }

    public static String getMedicoByCrm(String crm) {
        return sendGetRequest("get/" + crm);
    }

    public static String getMedicoByCpf(String cpf) {
        return sendGetRequest("get/" + cpf);
    }

    public static String getAllMedicos() {
        return sendGetRequest("get/all");
    }

    // Deleta um médico pelo CPF
    public static String deleteMedico(String cpf) {
        return sendDeleteRequest(cpf);
    }

    // Métodos auxiliares para requisições HTTP
    private static String sendGetRequest(String endpoint) {
        return sendHttpRequest(endpoint, "GET", null);
    }

    private static String sendPostRequest(String endpoint, String jsonBody) {
        return sendWriteRequest(endpoint, jsonBody, "POST");
    }

    private static String sendPutRequest(String endpoint, String jsonBody) {
        return sendWriteRequest(endpoint, jsonBody, "PUT");
    }

    private static String sendDeleteRequest(String cpf) {
        return sendHttpRequest("delete/" + cpf, "DELETE", null);
    }

    private static String sendWriteRequest(String endpoint, String jsonBody, String method) {
        return sendHttpRequest(endpoint, method, jsonBody);
    }

    private static String sendHttpRequest(String endpoint, String method, String jsonBody) {
        try {
            String authToken = TokenManager.getToken();
            if (authToken == null || authToken.isEmpty()) {
                return "Token de autenticação inválido ou não encontrado!";
            }

            URL url = new URL(BASE_URL + endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            connection.setRequestProperty("Authorization", "Bearer " + authToken);
            if (jsonBody != null) {
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);
                try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                    outputStream.writeBytes(jsonBody);
                    outputStream.flush();
                }
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
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                responseCode == HttpURLConnection.HTTP_OK ? connection.getInputStream() : connection.getErrorStream()
            ));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();
            return response.toString();
        } catch (Exception e) {
            return "Erro ao ler resposta: " + e.getMessage();
        }
    }
}
