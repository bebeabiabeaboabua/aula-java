import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        System.out.println("Digite os dados da Pessoa 1:");
        preencherPessoa(pessoa1, scanner);

        System.out.println("\nDigite os dados da Pessoa 2:");
        preencherPessoa(pessoa2, scanner);

        System.out.println("\nDigite os dados da Pessoa 3:");
        preencherPessoa(pessoa3, scanner);

        System.out.println("\n--------- INFORMAÇÕES DAS PESSOAS ---------");
        exibirPessoa(pessoa1, "Pessoa 1");
        exibirPessoa(pessoa2, "Pessoa 2");
        exibirPessoa(pessoa3, "Pessoa 3");

        System.out.println("----------------------------------------------------");

        System.out.println("\nAgora preencha os dados do Aluno:");
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        aluno.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Cor do cabelo: ");
        aluno.setCorCabelo(scanner.nextLine());

        System.out.print("Altura: ");
        aluno.setAltura(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Estilo: ");
        aluno.setEstilo(scanner.nextLine());

        System.out.print("Usa oculos? (true/false): ");
        aluno.setUsaOculos(scanner.nextBoolean());
        scanner.nextLine();

        System.out.print("Nota: ");
        aluno.setNota(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Comportamento: ");
        aluno.setComportamento(scanner.nextLine());

        System.out.print("Cor do caderno: ");
        aluno.setCorFavorita(scanner.nextLine());

        aluno.exibirInformacoes();

        System.out.println("----------------------------------------------------");

        System.out.println("\nAgora preencha os dados do Professor:");
        Professor professor = new Professor();

        System.out.print("Nome: ");
        professor.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        professor.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Cor do cabelo: ");
        professor.setCorCabelo(scanner.nextLine());

        System.out.print("Altura: ");
        professor.setAltura(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Estilo: ");
        professor.setEstilo(scanner.nextLine());

        System.out.print("Usa oculos? (true/false): ");
        professor.setUsaOculos(scanner.nextBoolean());
        scanner.nextLine();

        System.out.print("Anos de experiencia: ");
        professor.setAnosExperiencia(scanner.nextInt());
        scanner.nextLine();

        professor.exibirInformacoes();

        scanner.close();
    }

    // MÉTODO PARA PREENCHER UMA PESSOA
    public static void preencherPessoa(Pessoa pessoa, Scanner scanner) {
        System.out.print("Nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Idade: ");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Cor do cabelo: ");
        pessoa.setCorCabelo(scanner.nextLine());

        System.out.print("Altura: ");
        pessoa.setAltura(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Estilo: ");
        pessoa.setEstilo(scanner.nextLine());

        System.out.print("Usa óculos? (true/false): ");
        pessoa.setUsaOculos(scanner.nextBoolean());
        scanner.nextLine();
    }

    // MÉTODO PARA EXIBIR UMA PESSOA
    public static void exibirPessoa(Pessoa pessoa, String titulo) {
        System.out.println("\n" + titulo + ":");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Cor do cabelo: " + pessoa.getCorCabelo());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Estilo: " + pessoa.getEstilo());
        System.out.println("Usa óculos: " + (pessoa.getUsaOculos() ? "Sim" : "Não"));
    }
}
