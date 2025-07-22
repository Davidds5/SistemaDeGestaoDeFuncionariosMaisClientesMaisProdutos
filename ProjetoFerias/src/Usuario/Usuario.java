package Usuario;

public abstract class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public String toString(){
        return String.format("Nome: %s | Email %s", nome, email);
    }
}
