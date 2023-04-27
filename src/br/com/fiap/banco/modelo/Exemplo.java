package br.com.fiap.banco.modelo;

public class Exemplo {
    public static void main(String[] args) {
        Conta c = new Conta();
        Corrente cor = new Corrente(25);
        Poupanca poup = new Poupanca();



        System.out.println(cor.getManutencao());

    }
}
