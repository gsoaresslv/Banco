package banco;

public class Pessoa {       // Classe Pessoa e seus atributos 
    private String nome, cpf;
    private Data nasc;
    private char sexo;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, Data nasc, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
        this.sexo = sexo;
    }

    // ********
    // Métodos getters e setters
    // ********

    // Método para gettar o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método para settar o nome da pessoa
    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        } else {
            System.out.println("Digite um nome válido!");
        }
    }

    // Método para gettar o CPF da pessoa
    public String getCpf() {
        return cpf;
    }

    // Método para settar o CPF da pessoa
    public void setCpf(String cpf) {
        if (cpf.length() == 14) {
            this.cpf = cpf;
        } else {
            System.out.println("Digite um CPF válido!");
        }
    }

    // Método para gettar a idade da pessoa
    public int getIdade(Data hoje) {
        int idade = hoje.getAno() - this.nasc.getAno();
        if (hoje.getMes() < this.nasc.getMes() || (hoje.getMes() == this.nasc.getMes() && hoje.getDia() < this.nasc.getDia())) {
            idade--;
        }
        return idade;
    }

    // Método para gettar o sexo da pessoa
    public char getSexo() {
        return sexo;
    }

    // Método para settar o sexo da pessoa
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Digite um sexo válido!");
        }
    }
}
