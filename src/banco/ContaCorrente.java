package banco;

public class ContaCorrente extends Conta {
    double limite;

    public ContaCorrente(String numero, Pessoa titular, double saldo, Data criacao, Gerente ger, double limite) {
        super(numero, titular, saldo, criacao, ger);
        this.limite = limite;
    }

    // ********
    // Métodos getters e setters da Classe ContaCorrente
    // ********

    // Limite:
    public double getLimite() {
        return this.limite;
    }

    // Disponível:
    public double getDisponível() {
        return this.saldo + this.limite;
    }

    // ********
    // Métodos de ação da Classe ContaCorrente
    // ********

    // Extrato:
    public void extrato() {
        System.out.println("***Extrato da Conta Corrente:***");
        System.out.println("Titular: " + this.getTitular().getNome());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
        System.out.println("Disponível: " + this.getDisponível());
        System.out.println("************************");
    }
}
