package br.com.fiap.banco.modelo;

public class Corrente extends Conta {

    private double manutencao;

    public Corrente(double manutencao) {
        this.manutencao = manutencao;
    }


    public double getManutencao() {
        return manutencao;
    }

    public void setManutencao(double manutencao) {
        this.manutencao = manutencao;
    }
}
