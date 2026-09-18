// Exercicio 15 - Usuario e comparacao de Strings (== vs equals)
import java.util.Scanner;

class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void autenticar(String senhaInformada) {
        System.out.println("Comparacao com == : " + (this.senha == senhaInformada));
        System.out.println("Comparacao com equals: " + this.senha.equals(senhaInformada));
    }
}

public class Exercicio15 {
    public static void main(String[] args) {
        Usuario user = new Usuario("diego", "senha123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha correta (senha123): ");
        String senhaDigitada = scanner.nextLine();

        // O == vai dar false (objetos String diferentes na memoria lidos via teclado)
        // O equals vai dar true (conteudo igual)
        user.autenticar(senhaDigitada);

        scanner.close();
    }
}
