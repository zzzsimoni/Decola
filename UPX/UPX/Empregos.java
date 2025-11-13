package UPX.UPX;

import java.util.ArrayList;

public class Empregos {
    private String nome;
    private ArrayList<Profissoes> lstProfissoes = new ArrayList<>();

    public Empregos() {
    }

    public Empregos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void adicionarProfissoes(Profissoes p){
        lstProfissoes.add(p);
    }


    

}
