# GymManager

Sistema de gerenciamento de academia desenvolvido em Java, com foco na organização de alunos e instrutores e na aplicação dos conceitos de Programação Orientada a Objetos.

## Sobre o projeto

O GymManager é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos da UFERSA. Seu objetivo é construir, de forma incremental, um sistema que auxilie na organização das atividades de uma academia, com funcionalidades adequadas aos perfis de aluno e instrutor.

A versão atual funciona pelo terminal e implementa a etapa inicial de autenticação de usuários. As demais funcionalidades de gerenciamento serão adicionadas conforme o desenvolvimento do projeto.

## Funcionalidades implementadas

- Menu inicial com opções de acesso para alunos e instrutores.
- Autenticação por CPF e senha.
- Verificação de campos vazios durante o login.
- Mensagens de sucesso ou falha na autenticação.
- Identificação de instrutores com atributo de administrador.
- Encerramento do programa pelo menu.

O atributo de administrador já existe na classe `Instrutor`, mas o controle de permissões ainda não está implementado.

## Tecnologias e conceitos

- Java.
- Interface de texto no terminal.
- `Scanner` para leitura de dados.
- Encapsulamento de atributos.
- Herança entre `Usuario`, `Aluno` e `Instrutor`.
- Classe abstrata para representar características comuns dos usuários.
- Polimorfismo no método de login, que recebe um `Usuario` e aceita alunos ou instrutores.

## Classes atuais

| Arquivo | Responsabilidade |
| --- | --- |
| `Usuario.java` | Classe abstrata com os dados comuns dos usuários e a autenticação. |
| `Aluno.java` | Representa o aluno e herda os atributos e métodos de `Usuario`. |
| `Instrutor.java` | Representa o instrutor e armazena sua identificação como administrador. |
| `Main.java` | Inicia o programa, exibe o menu e conduz o login. |

## Como executar

É necessário ter o JDK 11 ou superior instalado, pois o código utiliza `String.isBlank()`.

Com os quatro arquivos `.java` na mesma pasta e sem declaração de pacote, abra o terminal nessa pasta e compile:

```sh
javac Main.java Usuario.java Aluno.java Instrutor.java
```

Em seguida, execute:

```sh
java Main
```

## Dados de demonstração

A versão inicial cria os seguintes usuários diretamente no código:

| Perfil | Nome | CPF | Senha |
| --- | --- | --- | --- |
| Aluno | Ana | `11111111111` | `1234` |
| Instrutor administrador | Carlos | `22222222222` | `5678` |

Esses dados servem apenas para testar o funcionamento do login.

## Estado do desenvolvimento

O projeto está em desenvolvimento. Atualmente, os usuários são definidos no código, sem cadastro pelo menu ou persistência em arquivos ou banco de dados. As senhas são comparadas diretamente, sem proteção por hash, nesta etapa acadêmica.

Como possibilidades de evolução, o sistema poderá receber cadastro e consulta de usuários, menus específicos por perfil e funcionalidades para organização de treinos. Esses recursos ainda não fazem parte da versão atual.

## Contexto acadêmico

Projeto desenvolvido para o estudo e a prática de Programação Orientada a Objetos em Java na Universidade Federal Rural do Semi-Árido (UFERSA).
