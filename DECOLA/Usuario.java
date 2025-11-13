package DECOLA;

public class Usuario {
    private String nome;
    private String email;
    private String interesse;

    public Usuario() {}
    
    public Usuario(String nome, String email, String interesse) {
        this.nome = nome;
        this.email = email;
        this.interesse = interesse;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public String Mostrar() {
        String msg = "Nome: " + nome + ", Email: " + email + ", Interesse: " + interesse;
        
        return msg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
