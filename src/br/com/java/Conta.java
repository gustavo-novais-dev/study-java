package br.com.java;

public class Conta {
        int agencia;
        int numero;
        double saldo = 0;

        public Conta(){  //contrutor padrão

        }

        public Conta(int agencia, int numero, double saldo){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = saldo;
        }

        public void depositar(double valor){
            this.saldo += valor;
        }

        public void sacar(double valor){
            this.saldo -= valor;
        }

        public double verificarSaldo(){
            return this.saldo;
        }
}
