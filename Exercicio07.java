// Exercicio 07 - Cliente com construtores encadeados
class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente() {
        this("Anonimo", "sem email", "sem telefone");
    }

    public Cliente(String nome) {
        this(nome, "sem email", "sem telefone");
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void exibir() {
        System.out.println("Cliente: " + nome + " | Email: " + email + " | Tel: " + telefone);
    }
}

public class Exercicio07 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Diego");
        Cliente c3 = new Cliente("Marcos", "marcos@email.com", "9999-8888");

        c1.exibir();
        c2.exibir();
        c3.exibir();
    }
}
