package com.diegomd.ficticiobank.models;

import com.diegomd.ficticiobank.entities.client.ClientModel;
import com.diegomd.ficticiobank.layouts.components.Screen;
import com.diegomd.ficticiobank.models.request.RequestModel;
import com.google.gson.Gson;

import java.util.UUID;

public class ATMModel {
    private final String endpoint = "http://ficticiobank.com/new-section";
    private String context;
    private final UUID atmId;
    Gson gson = new Gson();
    public ATMModel(UUID atmId) {
        this.atmId = atmId;
    }

    public void handleActionCommand(Screen screen, int actionCommand) {

        if (context == null) {
            //ServerModel.fetch(endpoint, new ClientModel("Diego Medeiros", 12345678910L, "pass123"));

            RequestModel myRequest = new RequestModel();
            myRequest.getContext = "newSection";
            myRequest.atmClientId = this.atmId;

            String response = ServerModel.importRequest(gson.toJson(myRequest));
            System.out.println(response);
        }

        if (actionCommand == 7) {
            screen.redesign("src/main/assets/I-01.png");
        }

        if (actionCommand == 8) {
            screen.redesign("src/main/assets/atm-main-menu.png");
        }
    }
}
