
public class Instrutor extends Usuario {

    private String cref;
    private String turno;
    private boolean administrador;

    public Instrutor(int id, String nome, String cpf,
                     String senha, String cref,
                     String turno, boolean administrador) {

        super(id, nome, cpf, senha);
        this.cref = cref;
        this.turno = turno;
        this.administrador = administrador;
    }

    public String getCref() {
        return cref;
    }

    public String getTurno() {
        return turno;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void atualizarDados(String cref, String turno) {
        this.cref = cref;
        this.turno = turno;
    }

    public String consultarDados() {
        return "ID: " + getId()
             + "\nNome: " + getNome()
             + "\nCREF: " + cref
             + "\nTurno: " + turno
             + "\nAdministrador: " + administrador;
    }
}
