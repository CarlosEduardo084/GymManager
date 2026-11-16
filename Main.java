import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    Aluno aluno = new Aluno(
        1,
        "Ana",
        "11111111111",
        "1234",
        LocalDate.of(2005, 8, 15),
        "84999999999"
    );

        Instrutor instrutor = new Instrutor(
            1,
            "Carlos",
            "22222222222",
            "5678",
            true
        );

        String opcao = "";

        while (!opcao.equals("0")) {
            System.out.println("\n--- SISTEMA DA ACADEMIA ---");
            System.out.println("1 - Entrar como aluno");
            System.out.println("2 - Entrar como instrutor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma op��o: ");

            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    fazerLogin(entrada, aluno);
                    break;

                case "2":
                    fazerLogin(entrada, instrutor);
                    break;

                case "0":
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Op��o inv�lida.");
            }
        }

        entrada.close();
    }

    public static void fazerLogin(Scanner entrada, Usuario usuario) {
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();

        System.out.print("Senha: ");
        String senha = entrada.nextLine();

        if (cpf.isBlank() || senha.isBlank()) {
            System.out.println("Preencha o CPF e a senha.");
            return;
        }

            if (usuario instanceof Aluno) {
        Aluno aluno = (Aluno) usuario;
        System.out.println(aluno.consultarDados());
    } else {
            System.out.println("CPF ou senha incorretos.");
        }
    }
}
