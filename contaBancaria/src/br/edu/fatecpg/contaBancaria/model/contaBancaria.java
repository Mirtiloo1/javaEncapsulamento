package br.edu.fatecpg.contaBancaria.model;

public class contaBancaria {
    private double saldo;
    private String titular;

    public contaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public String getTitular() {
        return this.titular;
    }
}

