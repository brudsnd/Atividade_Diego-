// Exercicio 12 - Ponto
class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ponto outro = (Ponto) obj;
        return this.x == outro.x && this.y == outro.y;
    }
}

public class Exercicio12 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(10, 20);
        Ponto p2 = new Ponto(10, 20);
        Ponto p3 = p1; // apontando para o mesmo objeto

        System.out.println("p1 == p2: " + (p1 == p2));           // false (enderecos diferentes)
        System.out.println("p1.equals(p2): " + p1.equals(p2));   // true (mesmos valores)

        System.out.println("p1 == p3: " + (p1 == p3));           // true (mesma referencia)
        System.out.println("p1.equals(p3): " + p1.equals(p3));   // true
    }
}
