package Cliente;

import Usuario.Usuario;

public class Administrador extends Usuario {
    private String setor;

    public Administrador(String nome, String email, String setor) {
        super(nome, email);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return super.toString() + "| Setor: " + setor;
    }
}
