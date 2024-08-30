package banco;

public class Gerente extends Pessoa{
    private String matricula, senha;

    public Gerente(String nome, String cpf, Data nasc, char sexo, String matricula, String senha) {
        super(nome, cpf, nasc, sexo);
        this.matricula = matricula;
        this.senha = senha;
    }

    // ********
    // Métodos getters e setters
    // ********

    // Método para gettar a matrícula
    public String getMatricula() {
        return matricula;
    }

    // ********
    // Métodos de ação
    // ********

    // Método para autenticar a senha do gerente
    boolean verSenha(String senha) {
        return this.senha.equals(senha);
    }
}
