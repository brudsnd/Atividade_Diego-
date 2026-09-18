// Exercicio 11 - Musica
import java.util.ArrayList;
import java.util.List;

class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracao + "s)";
    }
}

public class Exercicio11 {
    public static void main(String[] args) {
        Musica m1 = new Musica("Faroeste Caboclo", "Legiao Urbana", 540);
        Musica m2 = new Musica("Tempo Perdido", "Legiao Urbana", 300);

        // direto no println
        System.out.println(m1);

        // em concatenacao
        System.out.println("Tocando agora: " + m2);

        // dentro de lista
        List<Musica> playlist = new ArrayList<>();
        playlist.add(m1);
        playlist.add(m2);
        System.out.println("Playlist: " + playlist);
    }
}
