// Exercicio 02 - Produto
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preco invalido: nao pode ser negativo");
        }
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade invalida: nao pode ser menor que zero");
        }
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Teclado");
        
        // valores invalidos
        p.setPreco(-50.0);
        p.setQuantidade(-3);

        // valores validos
        p.setPreco(120.0);
        p.setQuantidade(10);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}
