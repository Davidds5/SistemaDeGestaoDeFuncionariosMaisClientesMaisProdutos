package Cliente;

import Usuario.Usuario;

public class Cliente extends Usuario {
    private int pontoFidelidade;

    public Cliente(String nome, String email, int pontoFidelidade) {
        super(nome, email);
        this.pontoFidelidade = pontoFidelidade;
    }

    public int getPontoFidelidade() {
        return pontoFidelidade;
    }
    @Override
    public String toString(){
        return super.toString() + "| Pontos de Fidelidade: " + pontoFidelidade;
    }
}
