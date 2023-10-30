package com.diegomd.ficticiobank.models;

import com.diegomd.ficticiobank.layouts.components.Screen;
import com.diegomd.ficticiobank.models.request.Request;
import com.diegomd.ficticiobank.models.response.Response;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

public class ATMModel {
    private String context;
    private final UUID atmId;
    Gson gson = new Gson();
    public ATMModel(UUID atmId) {
        this.atmId = atmId;
    }

    public void handleActionCommand(Screen screen, int actionCommand) throws IOException, InterruptedException {

        if (context == null) {
            if (actionCommand !=8) return;

            Request createSectionRq = new Request().toCreateNewSection(atmId);

            // Define como vai ser feita a requisição, o conteúdo, o que é a chamada, o que vai ser enviado,
            // qual vai ser o método, qual a url, os headers etc
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("http://localhost:8080/api/new-section"))
                    .header("atm-id", String.valueOf(atmId))
                    .build();

            // Executa a requisição, pode definir o timeout da conexão, como vai ser feita a chamada (se síncrona
            // ou assíncrona), se vai usar redirect ou não
            HttpClient httpClient = HttpClient.newBuilder().build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());
//            String jsonResp = Server.importRequest(gson.toJson(createSectionRq));
//            Response respObj = gson.fromJson(jsonResp, Response.class);
//            context = respObj.currentContext;
//
//            screen.redesign("src/main/assets/atm-main-menu.png");

        } else if (context.equals("newSection") && actionCommand == 7) {

            screen.redesign("src/main/assets/I-01.png");

        }
    }
}
