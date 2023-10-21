package br.com.java;


import java.io.Serial;
import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancaria
 * @author Gustavo Novais
 * @version 1.0
 */
public class Conta implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;
        private int agencia;
        private int numero;
        private double saldo;

        // Métodos getters
        public int getAgencia() {
                return agencia;
        }

        public int getNumero() {
                return numero;
        }


        // Métodos Setters
        public void setAgencia(int numero) {
                this.agencia = agencia;
        }

        public void setNumero(int numero) {
                this.numero = numero;
        }

        // Construtores
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
        public double getSaldo(){
                return this.saldo;
        }
}
