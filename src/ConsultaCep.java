/*
  By Sósthenes Lima
  09/07/2024

 */
import org.ietf.jgss.GSSContext;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        URI endereco = "viacep.com.br/ws/" + cep + "/jason";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new


    }
}
