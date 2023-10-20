package com.diegomd.ficticiobank;

import com.diegomd.ficticiobank.database.DataBase;
import com.diegomd.ficticiobank.entities.Cliente;
import com.diegomd.ficticiobank.entities.Conta;
import com.diegomd.ficticiobank.model.Model;
import com.diegomd.ficticiobank.view.View;

/**
 * Hello world!
 *
 */
public class App extends Model {
    public static void main( String[] args ) {
        View view = new View();
        DataBase db = new DataBase();
        db.addCorrentista(new Conta(new Cliente("Sr. Foo", 12312312312.0)));
        db.addCorrentista(new Conta(new Cliente("Sr. Bar", 99999999999.0)));

        view.print("cabecalho");
        menuPrincipal(db);
    }
}
