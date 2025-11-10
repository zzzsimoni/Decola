package UPX.UPX;

import java.util.ArrayList;

public class Trilha {
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Trilha() {
    }

    public Trilha(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCurso(Curso c) {
        cursos.add(c);
    }

    public String mostrar() {
        String msg = "\nCursos do Decola: " + cursos;
        for (Curso c : cursos) {
            System.out.println(" * " + c.getTitulo());
        }
        return msg;
    }
}
