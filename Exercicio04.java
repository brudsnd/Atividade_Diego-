// Exercicio 04 - Conta Bancaria
class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }
}

public class Exercicio04 {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.setNumero(1020);
        c.setTitular("Diego");

        c.depositar(500.0);
        System.out.println("Apos deposito de 500: R$ " + c.getSaldo());

        c.sacar(200.0);
        System.out.println("Apos saque de 200: R$ " + c.getSaldo());

        c.sacar(600.0);
        System.out.println("Apos tentar sacar 600: R$ " + c.getSaldo());
    }
}
