// Exercicio 10 - Ingresso
class Ingresso {
    private String tipo;
    private double valor;

    public Ingresso(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // versao 1: apenas percentual
    public void aplicarDesconto(double percentual) {
        this.valor -= this.valor * (percentual / 100);
    }

    // versao 2: com limite maximo de desconto (chama a primeira versao)
    public void aplicarDesconto(double percentual, double maxDesconto) {
        double descontoCalculado = this.valor * (percentual / 100);
        if (descontoCalculado > maxDesconto) {
            this.valor -= maxDesconto;
        } else {
            aplicarDesconto(percentual);
        }
    }
}

public class Exercicio10 {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso("VIP", 200.0);
        i1.aplicarDesconto(10); // 10%
        System.out.println("Ingresso VIP com desconto: R$ " + i1.getValor());

        Ingresso i2 = new Ingresso("Camarote", 500.0);
        i2.aplicarDesconto(20, 50.0); // 20% limitando a R$ 50
        System.out.println("Ingresso Camarote com teto: R$ " + i2.getValor());
    }
}
