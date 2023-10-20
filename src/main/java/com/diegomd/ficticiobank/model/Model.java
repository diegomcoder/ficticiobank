package com.diegomd.ficticiobank.model;

import com.diegomd.ficticiobank.database.DataBase;
import com.diegomd.ficticiobank.entities.Cliente;
import com.diegomd.ficticiobank.entities.Conta;
import com.diegomd.ficticiobank.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

// CLASSE RESPONSÁVEL PELAS REGRAS DE NEGÓCIO
public class Model {
    static View view = new View();

    public static void menuPrincipal(DataBase db) {
        view.print("menu-principal");
        int opc = Integer.parseInt(obterEtradaDados("^[1-7]{1}$"));

        switch (opc) {
            case 1 -> criarConta(db);
            case 2 -> listarCorrentistas(db);
            case 3 -> sacar(db);
            case 4 -> depositar(db);
            case 5 -> transferir(db);
            case 6 -> encerrarConta(db);
            default -> System.exit(1);
        }
    }

    static String obterEtradaDados(String regex) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        if (Pattern.compile(regex).matcher(entrada).matches())
            return entrada;

        view.print("entrada-invalida");
        return obterEtradaDados(regex);
    }

    static void criarConta(DataBase db) {
        view.print("cabecalho");
        view.print("qual-seu-nome");
        String nome = obterEtradaDados("^\\w+\\s\\w+.*$");

        view.print("qual-seu-cpf");
        long cpf = Long.parseLong(obterEtradaDados("^\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}$")
                .replace("-", "").replace(".", ""));

        boolean voidDb = db.getCorrentistas().isEmpty();
        boolean clienteNovo = db.getConta(0, cpf) == null;

        view.print("cabecalho");
        if (voidDb || clienteNovo) {
            db.addCorrentista(new Conta(new Cliente(nome, cpf)));
            view.print("operacao-realizada");
        }
        else
            view.print("ja-possui-conta");
        menuPrincipal(db);
    }

    static void listarCorrentistas(DataBase db) {
        view.print("cabecalho");
        if (db.getCorrentistas().isEmpty())
            view.print("nenhum-correntista");
        else {
            view.print("correntistas");
            db.getCorrentistas().forEach( conta ->
                    view.imprimirDadosCorrentista(conta));
        }
        menuPrincipal(db);
    }

    static Conta getContaByContaOrCpf(DataBase db) {
        String entrada = obterEtradaDados("^\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}|\\d{7}$");
        entrada = entrada.replace(".", "").replace("-", "");
        int conta = 0;
        double cpf = 0;

        if (entrada.length() == 7)
            conta = Integer.parseInt(entrada);
        else
            cpf = Double.parseDouble(entrada);
        return db.getConta(conta, cpf);
    }

    static void encerrarConta(DataBase db) {
        view.print("qual-conta/cpf");
        Conta conta = getContaByContaOrCpf(db);

        view.print("cabecalho");
        if (conta == null)
            view.print("correntista-nao-cadastrado");
        else {
            db.getCorrentistas().remove(conta);
            view.print("operacao-realizada");
        }
        menuPrincipal(db);
    }

    static void sacar(DataBase db) {
        view.print("qual-sua-conta/cpf");
        Conta minhaConta = getContaByContaOrCpf(db);

        if (minhaConta == null)
            view.print("correntista-nao-cadastrado");
        else {
            view.print("que-valor");
            double valor = Double.parseDouble(
                    obterEtradaDados("^-?\\d+((\\.|\\,)\\d+)?$").replace(",","."));
            view.print("cabecalho");
            if (minhaConta.sacar(valor))
                view.print("operacao-realizada");
            else
                view.print("operacao-negada");
        }
        menuPrincipal(db);
    }

    static void depositar(DataBase db) {
        view.print("qual-sua-conta/cpf");
        Conta minhaConta = getContaByContaOrCpf(db);

        if (minhaConta == null) {
            view.print("cabecalho");
            view.print("correntista-nao-cadastrado");
        } else {
            view.print("que-valor");
            double valor = Double.parseDouble(
                    obterEtradaDados("^-?\\d+((\\.|\\,)\\d+)?$").replace(",","."));

            minhaConta.depositar(valor);
            view.print("cabecalho");
            view.print("operacao-realizada");
        }
        menuPrincipal(db);
    }

    static void transferir(DataBase db) {
        view.print("qual-sua-conta/cpf");
        Conta minhaConta = getContaByContaOrCpf(db);

        if (minhaConta == null) {
            view.print("cabecalho");
            view.print("correntista-nao-cadastrado");
        }
        else {
            view.print("qual-conta/cpf-destinatario");
            Conta contaDestinatario = getContaByContaOrCpf(db);

            if (contaDestinatario == null) {
                view.print("cabecalho");
                view.print("correntista-nao-cadastrado");
            }
            else {
                view.print("que-valor");
                double valor = Double.parseDouble(
                        obterEtradaDados("^-?\\d+((\\.|\\,)\\d+)?$").replace(",","."));
                boolean transacaoOk = minhaConta.transferir(valor,contaDestinatario);

                view.print("cabecalho");
                if (transacaoOk)
                    view.print("operacao-realizada");
                else
                    view.print("operacao-negada");
            }
        }
        menuPrincipal(db);
    }
}

