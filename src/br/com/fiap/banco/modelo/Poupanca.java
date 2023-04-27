package br.com.fiap.banco.modelo;

public class Poupanca extends Conta {

    public void rendimento() {
//        this.saldo = this.saldo * 1.005;
        double valor = this.getSaldo();
        valor = valor * 1.005;
        this.setSaldo(valor);
    }

    public String toString() {
        return "Poupanca " + super.toString();
    }
}
