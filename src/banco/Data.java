package banco;

public class Data {
    private int dia, mes, ano;

    // Construtor da classe Data
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // ********
    // Métodos getters e setters
    // ********

    // Método para gettar o dia
    public int getDia() {
        return dia;
    }

    // Método para gettar o mês
    public int getMes() {
        return mes;
    }

    // Método para gettar o ano
    public int getAno() {
        return ano;
    }

    
}
