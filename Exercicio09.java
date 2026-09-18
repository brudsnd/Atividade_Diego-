// Exercicio 09 - Calculadora com sobrecarga
class Calculadora {
    // inteiros (2 parametros)
    public int somar(int a, int b) {
        return a + b;
    }

    // inteiros (3 parametros)
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // numeros reais
    public double somar(double a, double b) {
        return a + b;
    }

    // vetor de inteiros
    public int somar(int[] numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        return total;
    }
}

public class Exercicio09 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma 2 inteiros: " + calc.somar(5, 10));
        System.out.println("Soma 3 inteiros: " + calc.somar(2, 4, 6));
        System.out.println("Soma reais: " + calc.somar(3.5, 4.2));

        int[] vetor = { 10, 20, 30 };
        System.out.println("Soma vetor: " + calc.somar(vetor));
    }
}
