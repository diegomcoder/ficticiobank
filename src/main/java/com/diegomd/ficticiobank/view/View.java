package com.diegomd.ficticiobank.view;

import com.diegomd.ficticiobank.entities.Conta;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

// CLASSE QUE REALIZA IMPRESSÕES DE TEXTOS NO TERMINAL
public class View {
    private HashMap<String, String> imprimir;
    public View() {
        this.imprimir = new HashMap<>();
        this.imprimir.put("cabecalho", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n_____________________________________\nBANCO FICTICIOBANK.INC\n");
        this.imprimir.put("menu-principal", """
            
            
            (1) Criar nova conta
            (2) Listar correntistas
            (3) Sacar
            (4) Depositar
            (5) Transferir
            (6) Encerrar uma conta
            (7) Fechar a aplicação
            
            O que deseja fazer?\s""");
        this.imprimir.put("entrada-invalida", "\nEntrada inválida! Tente novamente.\n");
        this.imprimir.put("operacao-realizada", "\nOperação realizada com sucesso!\n");
        this.imprimir.put("operacao-negada", "\nOperação negada!\nConfira se há saldo suficiente.\n");
        this.imprimir.put("correntistas", "CORRENTISTAS CADASTRADOS\n");
        this.imprimir.put("nenhum-correntista", "\nNenhum correntista cadastrado\n");
        this.imprimir.put("correntista-nao-cadastrado", "\nCorrentista não cadastrado!\n");
        this.imprimir.put("qual-seu-nome", "\nQual seu nome e sobrenome? ");
        this.imprimir.put("qual-seu-cpf", "\nQual seu CPF? ");
        this.imprimir.put("que-valor", "\nQual o Valor? ");
        this.imprimir.put("ja-possui-conta", "\nCliente já possui conta cadastrada. Operação não permitida\n");
        this.imprimir.put("qual-conta/cpf", "\nInforme os números da conta ou do CPF: ");
        this.imprimir.put("qual-sua-conta/cpf", "\nInforme os números de sua conta ou seu CPF: ");
        this.imprimir.put("qual-conta/cpf-destinatario", "\nInforme CPF ou conta do destinatário: ");
    }
    public void print(String chave) {
        System.out.print(this.imprimir.get(chave));
    }

    private String formatarCpf(double cpf) {
        NumberFormat nf = NumberFormat.getInstance();
        String cpfNaoFormatado = nf.format(cpf).replace(".", "");
        while (cpfNaoFormatado.length() < 11)
            cpfNaoFormatado = "0".concat(cpfNaoFormatado);
        String p1, p2, p3, p4;
        p1 = cpfNaoFormatado.substring(0,3) + ".";
        p2 = cpfNaoFormatado.substring(3,6) + ".";
        p3 = cpfNaoFormatado.substring(6,9) + "-";
        p4 = cpfNaoFormatado.substring(9,11);
        return p1 + p2 + p3 + p4;
    }
    public void imprimirDadosCorrentista(Conta conta) {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat currency = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("\nNOME: " + conta.getCliente().getNome());
        System.out.println("CPF: " + formatarCpf(conta.getCliente().getCpf()));
        System.out.println(("CONTA: " + nf.format(conta.getNumConta()).replace(".", "")));
        System.out.println("SALDO: " + currency.format(conta.getSaldo()));
    }
}