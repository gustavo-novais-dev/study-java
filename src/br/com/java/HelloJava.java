package br.com.java;

public class HelloJava {
    public static void main(String[] args) {

        Conta contaCorrente = new Conta();

        contaCorrente.depositar(1000);
        contaCorrente.setAgencia(2222);
        contaCorrente.setNumero(1111);
        contaCorrente.sacar(100);
        System.out.println(contaCorrente.getSaldo());
    }
}