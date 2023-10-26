package com.diegomd.ficticiobank.entities.client;

import com.diegomd.ficticiobank.entities.account.AccountModel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ClientModel {
    private UUID id;
    private long cpf;
    private String fullName;
    private String password;
    private List<AccountModel> accounts;
    private LocalDateTime createdAt;
}
