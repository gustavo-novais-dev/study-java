package br.com.java;

public class ContaCorrente extends Conta {

    private String tipo;
    private double chequeEspecial;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel(){
        return super.getSaldo() + chequeEspecial;
    }

    @Override
    public void sacar(double valor){ //sobreescrita --> isso leva ao Polimorfismo
        valor += 10;
        super.sacar(valor);
    }
}
