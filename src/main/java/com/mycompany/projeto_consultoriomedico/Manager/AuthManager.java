package com.mycompany.projeto_consultoriomedico.Manager;

import com.mycompany.consultoriomed.Config.HttpService;
import org.json.JSONObject;

public class AuthManager {

    // Método para obter a role do usuário logado
    public static String getUserRole() {
        // Endpoint da API para pegar a role
        String endpoint = "/auth/role";
        String response = HttpService.sendGetRequest(endpoint, true);

        // Exibindo a resposta recebida para debug
        System.out.println("Resposta da API para getUserRole(): " + response);

        // Verifica se a resposta não está vazia
        if (response == null || response.trim().isEmpty()) {
            return "Resposta vazia da API!";
        }

        // Nesse caso, como a resposta já é diretamente a role, retornamos ela diretamente
        return response.trim();  // Remove espaços em branco ao redor da string, se houver
    }



    // Método para registrar um administrador
    public static String registerAdmin(String nome, String cpf, String login, String password) {
        String endpoint = "/auth/admin/register";
        JSONObject json = new JSONObject();
        json.put("nome", nome);
        json.put("cpf", cpf);
        json.put("login", login);
        json.put("password", password);
        json.put("role", "ADMIN");

        return HttpService.sendPostRequest(endpoint, json.toString(), true);
    }

    // Método para registrar um médico
    public static String registerMedico(String nome, String cpf, String crm, String especialidade,
                                        String estado, String cidade, String bairro, String rua,
                                        int numero, String telefone, String login, String password) {
        String endpoint = "/auth/medico/register";
        JSONObject json = new JSONObject();
        json.put("nome", nome);
        json.put("cpf", cpf);
        json.put("crm", crm);
        json.put("especialidade", especialidade);
        json.put("estado", estado);
        json.put("cidade", cidade);
        json.put("bairro", bairro);
        json.put("rua", rua);
        json.put("numero", numero);
        json.put("telefone", telefone);
        json.put("login", login);
        json.put("password", password);
        json.put("role", "ADMIN");

        return HttpService.sendPostRequest(endpoint, json.toString(), true);
    }

    // Método para registrar uma recepcionista
    public static String registerRecepcionista(String nome, String cpf, String estado, String cidade, 
                                               String bairro, String rua, int numero, String telefone,
                                               String login, String password) {
        String endpoint = "/auth/recepcionista/register";
        JSONObject json = new JSONObject();
        json.put("nome", nome);
        json.put("cpf", cpf);
        json.put("estado", estado);
        json.put("cidade", cidade);
        json.put("bairro", bairro);
        json.put("rua", rua);
        json.put("numero", numero);
        json.put("telefone", telefone);
        json.put("login", login);
        json.put("password", password);
        json.put("role", "ADMIN");

        return HttpService.sendPostRequest(endpoint, json.toString(), true);
    }

    // Método para fazer login e armazenar o token
    public static String login(String login, String password) {
        String endpoint = "/auth/login";
        JSONObject json = new JSONObject();
        json.put("login", login);
        json.put("password", password);

        String response = HttpService.sendPostRequest(endpoint, json.toString(), false);

        try {
            System.out.println("Resposta da API: " + response);  // Imprimir resposta da API para debugar

            JSONObject jsonResponse = new JSONObject(response);

            // Verifica se a resposta contém o campo "token" e se o token não é uma mensagem de erro
            if (jsonResponse.has("token")) {
                String token = jsonResponse.getString("token");

                // Verifica se o token é uma mensagem de erro
                if (token.equals("Falha na autenticação!")) {
                    return "Falha na autenticação! Usuário ou senha incorretos.";
                }

                // Se o token for válido, armazene o token
                TokenManager.setToken(token);
                return "Login bem-sucedido! Token armazenado.";
            } else {
                // Se não contiver o token, retorna mensagem de erro
                return "Erro no login: Token não encontrado na resposta.";
            }
        } catch (Exception e) {
            return "Erro ao processar resposta do login: " + e.getMessage();
        }
    }
}