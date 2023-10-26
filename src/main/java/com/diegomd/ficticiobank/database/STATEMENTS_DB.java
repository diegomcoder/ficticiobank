package com.diegomd.ficticiobank.database;

import com.diegomd.ficticiobank.entities.account.BankingOperation;

import java.util.ArrayList;
import java.util.List;

public class STATEMENTS_DB {
    private static final List<BankingOperation> operations = new ArrayList<>();
    public static void save(BankingOperation operation) {
        operations.add(operation);
    }
}
