package com.diegomd.ficticiobank;

import com.diegomd.ficticiobank.database.DataBase;
import com.diegomd.ficticiobank.entities.Cliente;
import com.diegomd.ficticiobank.entities.Conta;
import com.diegomd.ficticiobank.layouts.ATMFrame;
import com.diegomd.ficticiobank.models.ServerModel;
import com.diegomd.ficticiobank.view.View;

public class App extends ServerModel {
    public static void main( String[] args ) {
//        View view = new View();
//        DataBase db = new DataBase();
//        db.addCorrentista(new Conta(new Cliente("Sr. Foo", 12312312312.0)));
//        db.addCorrentista(new Conta(new Cliente("Sr. Bar", 99999999999.0)));
//
//        view.print("cabecalho");
//        menuPrincipal(db);
//        //ATM atm = new ATM();
//        // ATM atm2 = new ATM();
        new ATMFrame();
    }
}
