package UPX.UPX;

import java.util.ArrayList;

public class Catalogo {
   private ArrayList<Trilha> trilhas = new ArrayList<>();

    public void criarExemplo(){
        Trilha t1 = new Trilha("Desenvolvimento Web");
        t1.adicionarCurso(new Curso("HTML"));
        t1.adicionarCurso(new Curso("CSS"));
        t1.adicionarCurso(new Curso("JavaScript"));
        trilhas.add(t1);

        Trilha t2 = new Trilha("Data Science");
        t2.adicionarCurso(new Curso("Python"));
        t2.adicionarCurso(new Curso("SQL"));
        trilhas.add(t2);
    }
    public String listarCursos() {
        String msg = "\nCursos do Decola:";
        for (Trilha t : trilhas) {
            System.out.println(" * " + t.getNome());
        }
        return msg;
    }
}

