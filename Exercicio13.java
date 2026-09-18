// Exercicio 13 - Aluno
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Aluno {
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // Com equals e hashCode ativos:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(ra, aluno.ra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ra);
    }
}

public class Exercicio13 {
    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();

        Aluno a1 = new Aluno("123", "Diego");
        Aluno a2 = new Aluno("123", "Diego Silva");

        alunos.add(a1);
        alunos.add(a2);

        // Com equals/hashCode implementados: vai dar 1 (nao aceita duplicado pelo RA)
        // Se comentar o equals/hashCode: vai dar 2 (compara referencia na memoria)
        System.out.println("Total no HashSet: " + alunos.size());
    }
}
