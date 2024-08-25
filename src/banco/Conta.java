package banco;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo, limite;

    // Construtor da classe Conta
    public Conta(String numero, Pessoa titular, double saldo, double limite) { 
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    // ********
    // Métodos getters e setters da Classe Conta
    // ********

    // Número:

    // Método para gettar o número da conta
    public String getNumero() {
        return numero;
    }
    // Método para settar o número da conta
    public void setNumero(String numero) {
        if (numero.length() > 0) {
            this.numero = numero;
        } else {
            System.out.println("Digite um número de conta válido!");
        }
    }

    // Titular:

    // Método para gettar o titular da conta
    public Pessoa getTitular() {
        return titular;
    }
    // Método para gettar o nome do titular da conta
    public String getNomeTitular() {
        return titular.getNome();
    }
    // Método para settar o titular da conta
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    // Saldo, Limite e Disponível:

    // Método para gettar o saldo da conta
    public double getSaldo() {
        return saldo;
    }
    // Método para gettar o limite da conta
    public double getLimite() {
        return limite;
    }
    // Método para gettar o valor disponível da conta
    public double disponível() {
        return this.saldo + this.limite;
    }
    // Método para settar o limite da conta
    public void setLimite(double limite) {
            this.limite = limite;
    }

    // ********
    // Métodos de ação da classe Conta
    // ********

    // Extrato:
    void extrato() {
        System.out.println("***Extrato da conta:***");
        System.out.println("Titular: " + this.getNomeTitular());
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Disponível: " + this.disponível());
        System.out.println("************************");
    }
    
    // Depósito:
    void depositar(double valor) {
        this.saldo += valor; // Soma o valor depositado ao saldo da conta
        // Retorno pro cliente:
        System.out.println("***Depósito***");
        System.out.println("Depósito de R$ " + valor + " na conta " + this.numero + " de titular "
                + this.getNomeTitular() + " realizado com sucesso!");
        System.out.println("Novo saldo: " + this.saldo);
        System.out.println("************************");
    }

    // Saque:
    boolean sacar(double valor) {
        if (valor <= this.disponível()) { // Checa se o valor do saque é menor ou igual ao disponível
            this.saldo -= valor; // Subtrai o valor do saque do saldo da conta
            // Retorno pro cliente:   
            System.out.println("***Saque***");
            System.out.println("Saque de R$ " + valor + " na conta " + this.numero + " de titular "
            + this.getNomeTitular() + " realizado com sucesso!");
            System.out.println("Valor disponível para saque: " + this.disponível());
            System.out.println("************************");
            // Retorno pro programa:
            return true;
        } else {
            // Retorno pro cliente:
            System.out.println("***Saque***");
            System.out.println("Não foi possível realizar o saldo de no valor de R$ " + valor
                    + " pois o valor de saque disponível é de R$ " + this.disponível());
            System.out.println("************************");
            // Retorno pro programa:
            return false;
        }
    }
    
    // Transferência:
    boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) { // Checa se é possível sacar o valor da conta de origem
            this.saldo -= valor; // Subtrai o valor da conta de origem
            destino.depositar(valor); // Deposita o valor na conta de destino
            // Retorno pro cliente:
            System.out.println("***Transferência***");
            System.out.println("Transferência de R$ " + valor + " da conta " + this.numero + " de titular "
                    + this.titular.getNome() + " para a conta " + destino.numero + " de titular "
                    + destino.titular.getNome() + " realizada com sucesso!");
            System.out.println("Novos saldos:");
            System.out.println("Conta " + this.numero + ": " + this.saldo);
            System.out.println("Conta " + destino.numero + ": " + destino.saldo);
            System.out.println("************************");
            // Retorno pro programa:
            return true;
        } else {
            // Retorno pro cliente:
            System.out.println("***Transferência***");
            System.out.println("Não foi possível realizar a transferência de R$ "
                    + valor + " da conta " + this.numero + " de titular " + this.titular.getNome() +
                    " para a conta " + destino.numero + " de titular " + destino.titular.getNome() +
                    " pois o saldo disponível é de R$ " + this.disponível());
            System.out.println("************************");
            // Retorno pro programa:
            return false;
        }
    }
}
