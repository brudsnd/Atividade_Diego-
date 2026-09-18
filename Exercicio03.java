// Exercicio 03 - Funcionario
class Funcionario {
    private String nome;
    private double salarioBase;
    private double bonus;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double getSalarioTotal() {
        return salarioBase + bonus;
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Carlos");
        f1.setSalarioBase(2500.0);
        f1.setBonus(500.0);

        Funcionario f2 = new Funcionario();
        f2.setNome("Juliana");
        f2.setSalarioBase(3800.0);
        f2.setBonus(800.0);

        System.out.println(f1.getNome() + " - Salario total: R$ " + f1.getSalarioTotal());
        System.out.println(f2.getNome() + " - Salario total: R$ " + f2.getSalarioTotal());
    }
}
