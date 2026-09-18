// Exercicio 14 - Veiculo e passagem de parametros
class Veiculo {
    private String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
}

public class Exercicio14 {
    // altera o objeto referenciado
    public static void alterarPlaca(Veiculo v) {
        v.setPlaca("AAA0A11");
    }

    // cria outro objeto e tenta atribuir ao parametro (nao afeta a variavel original)
    public static void reatribuirVeiculo(Veiculo v) {
        v = new Veiculo("BBB0B22");
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("XYZ9999");
        System.out.println("Placa inicial: " + carro.getPlaca());

        alterarPlaca(carro);
        System.out.println("Apos alterarPlaca: " + carro.getPlaca()); // muda para AAA0A11

        reatribuirVeiculo(carro);
        System.out.println("Apos reatribuirVeiculo: " + carro.getPlaca()); // continua AAA0A11
    }
}
