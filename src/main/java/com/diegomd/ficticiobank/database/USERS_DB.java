package com.diegomd.ficticiobank.database;

import com.diegomd.ficticiobank.entities.account.AccountModel;
import com.diegomd.ficticiobank.entities.client.ClientModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class USERS_DB {
    private static final List<ClientModel> users = new ArrayList<>();
    public static void save(ClientModel client) {
        users.add(client);
    }
}
