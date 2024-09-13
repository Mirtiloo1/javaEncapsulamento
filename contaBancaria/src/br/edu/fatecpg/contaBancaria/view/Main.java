package br.edu.fatecpg.contaBancaria.view;

import br.edu.fatecpg.contaBancaria.model.contaBancaria;

public class Main {
    public static void main(String[] args) {
        contaBancaria contaJefferson = new contaBancaria("Jefferson");

        System.out.println("Saldo inicial de " + contaJefferson.getTitular() + ": R$ " + contaJefferson.getSaldo());

        contaJefferson.depositar(1000);

        contaJefferson.sacar(500);

        contaJefferson.sacar(600);

        System.out.println("Saldo final de " + contaJefferson.getTitular() + ": R$ " + contaJefferson.getSaldo());
    }
}
