// Exercicio 06 - Retangulo
class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

public class Exercicio06 {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(4.0, 5.0);
        Retangulo r2 = new Retangulo(2.5, 6.0);
        Retangulo r3 = new Retangulo(10.0, 3.0);

        System.out.println("R1 - Area: " + r1.calcularArea() + " | Perimetro: " + r1.calcularPerimetro());
        System.out.println("R2 - Area: " + r2.calcularArea() + " | Perimetro: " + r2.calcularPerimetro());
        System.out.println("R3 - Area: " + r3.calcularArea() + " | Perimetro: " + r3.calcularPerimetro());
    }
}
