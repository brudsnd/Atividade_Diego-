// Exercicio 08 - Data
class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // chama o primeiro construtor assumindo dia 1 e mes 1
    public Data(int ano) {
        this(1, 1, ano);
    }

    public void exibirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}

public class Exercicio08 {
    public static void main(String[] args) {
        Data d1 = new Data(15, 8, 2024);
        Data d2 = new Data(2026);

        d1.exibirData();
        d2.exibirData();
    }
}
