
import java.time.LocalDate;

public class Aluno extends Usuario {

    private LocalDate dataNascimento;
    private String telefone;

    public Aluno(int id, String nome, String cpf, String senha,
                 LocalDate dataNascimento, String telefone) {

        super(id, nome, cpf, senha);
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public void cadastrar(String nome, String cpf,
                          LocalDate dataNascimento, String telefone) {
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public void atualizarDados(String telefone) {
        this.telefone = telefone;
    }

    public String consultarDados() {
        return "ID: " + getId()
             + "\nNome: " + getNome()
             + "\nData de nascimento: " + dataNascimento
             + "\nTelefone: " + telefone;
    }
}
