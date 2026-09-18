// Exercicio 01 - Livro
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.setTitulo("Dom Casmurro");
        l1.setAutor("Machado de Assis");
        l1.setAnoPublicacao(1899);
        l1.setPreco(35.0);

        Livro l2 = new Livro();
        l2.setTitulo("O Hobbit");
        l2.setAutor("J.R.R. Tolkien");
        l2.setAnoPublicacao(1937);
        l2.setPreco(59.90);

        Livro l3 = new Livro();
        l3.setTitulo("Clean Code");
        l3.setAutor("Robert Martin");
        l3.setAnoPublicacao(2008);
        l3.setPreco(85.0);

        System.out.println(l1.getTitulo() + " - " + l1.getAutor() + " (" + l1.getAnoPublicacao() + ") R$ " + l1.getPreco());
        System.out.println(l2.getTitulo() + " - " + l2.getAutor() + " (" + l2.getAnoPublicacao() + ") R$ " + l2.getPreco());
        System.out.println(l3.getTitulo() + " - " + l3.getAutor() + " (" + l3.getAnoPublicacao() + ") R$ " + l3.getPreco());
    }
}
