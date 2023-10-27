package com.diegomd.ficticiobank.models.response;

import com.diegomd.ficticiobank.entities.account.AccountTypes;
import com.diegomd.ficticiobank.entities.account.BankingOperation;

import java.util.ArrayList;
import java.util.UUID;

public class Account {
    public UUID accountId;
    public long accountNumber;
    public AccountTypes accountType;
    public boolean hasPositiveBalance;
    public double balance;
    public ArrayList<BankingOperation> statement;
}
