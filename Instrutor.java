public class Instrutor extends Usuario {
    private boolean administrador;

    public Instrutor(
        int id,
        String nome,
        String cpf,
        String senha,
        boolean administrador
    ) {
        super(id, nome, cpf, senha);
        this.administrador = administrador;
    }

    public boolean isAdministrador() {
        return administrador;
    }
}