package banco;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente ger;

    // Construtor da classe Conta
    public Conta(String numero, Pessoa titular, double saldo, Data criacao, Gerente ger) { 
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.criacao = criacao; 
        this.ger = ger;
    }

    // ********
    // Métodos getters e setters da Classe Conta
    // ********

    // Método para gettar o número da conta
    public String getNumero() {
        return this.numero;
    }

    // Método para gettar o titular da conta
    public Pessoa getTitular() {
        return this.titular;
    }

    // Método para gettar o saldo da conta
    public double getSaldo() {
        return this.saldo;
    }

    public Data getCriacao() {
        return this.criacao;
    }

    public Gerente getGerente() {
        return this.ger;
    }
}