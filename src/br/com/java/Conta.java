package br.com.java;


/**
 * Classe que abstrai uma Conta Bancaria
 * @author Gustavo Novais
 * @version 1.0
 */
public class Conta {
        int agencia;
        int numero;
        double saldo;

        public Conta(){  //contrutor padrão

        }

        public Conta(int agencia, int numero, double saldo){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = saldo;
        }

        /**
         * Realiza um deposito na conta corrente
        * @param valor é o valor do qual será depositado
        */
        public void depositar(double valor){
            this.saldo += valor;
        }

        /**
         * Realiza o saque na conta corrente
         * @param valor é o valor que será sacado
         */
        public void sacar(double valor){
                this.saldo -= valor;
        }

        /**
         * Verificar saldo
         * @return valor no saldo da conta
         */
        public double verificarSaldo(){
                return this.saldo;
        }
}
