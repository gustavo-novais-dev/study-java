package br.com.java;

public class HelloJava {
    public static void main(String[] args) {

        Conta contaCorrente = new Conta();

        contaCorrente.saldo = 1000;
        contaCorrente.agencia = 0101;
        contaCorrente.numero = 1111;

        contaCorrente.depositar(1000);
        contaCorrente.sacar(100);
        System.out.println(contaCorrente.verificarSaldo());
    }
}