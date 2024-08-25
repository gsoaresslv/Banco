package banco;

public class Banco {
    public static void main(String[] args) { /// Método main
        /// Criando objetos da classe Data
        Data d1 = new Data(10, 10, 2000);
        Data d2 = new Data(20, 12, 1990);

        /// Criando objetos da classe Pessoa
        Pessoa p1 = new Pessoa("Guilherme", "123.456.789-00", d1, 'M');
        Pessoa p2 = new Pessoa("Maria", "987.654.321-00", d2, 'F');

        /// Criando objetos da classe Conta
        Conta c1 = new Conta("1234-5", p1, 1000, 500);
        Conta c2 = new Conta("5432-1", p2, 2000, 0);

        c1.extrato();
        c2.extrato();
    }
}
