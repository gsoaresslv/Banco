package banco;

public class Poupanca extends Conta {
    public Poupanca(String numero, Pessoa titular, double saldo, Data criacao, Gerente ger, double taxaRendimento) {
        super(numero, titular, saldo, criacao, ger);

    }

    // ********
    // Métodos getters e setters da Classe Poupanca
    // ********

    // Disponível:
    public double getDisponível() {
        return this.saldo;
    }

    // ********
    // Métodos de ação da Classe Poupanca
    // ********
    
    // Extrato:
    public void extrato() {
        System.out.println("***Extrato da conta:***");
        System.out.println("Titular: " + this.getTitular().getNome());
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Disponível: " + this.getDisponível());
        System.out.println("************************");
    }

}
