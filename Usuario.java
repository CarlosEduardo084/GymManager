public abstract class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String senha;

    public Usuario(int id, String nome, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public int getId() {
    return id;
}

    public boolean autenticar(String cpf, String senha) {
        return this.cpf.equals(cpf) && this.senha.equals(senha);
    }
}