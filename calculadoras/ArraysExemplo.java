import java.util.Scanner;
import java.util.Random;

public class ArraysExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//-----------------------------------------------------------------------
        //variaveis/armazenamento

        String[] nomes = new String[5];
        double[][] notas = new double[5][4];
        double[] medias = new double[5];

//----------------------------------------------------------------------

        // Escolha se quer digitar manualmente ou usar dados aleatórios
        System.out.print("Quer gerar dados aleatórios? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            gerarDadosAleatorios(nomes, notas);
            System.out.println("Dados aleatórios gerados!\n");
        } else {

        //loop for pra pedir o nome do aluno

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": "); //pergunta o nome do aluno e mostra a numeração dele
            nomes[i] = scanner.nextLine();
//-----------------------------------------------------------------------

            double soma = 0; //🔹 Cria uma variável que vai somar as 4 notas do aluno (pra calcular a média depois).
//----------------------------------------------------------------------

        //loop para pedir as notas

            for (int j = 0; j < 4; j++) { //Laço interno que percorre as 4 notas de cada aluno.

                while (true) { //Protegendo a entrada de notas com validação

                    System.out.print("Digite a nota " + (j + 1) + " de " + nomes[i] + ": ");
                    if (scanner.hasNextDouble()) { //hasNextDouble(): verifica se o que foi digitado é um número (double).
                        notas[i][j] = scanner.nextDouble(); //scanner.nextDouble(): lê a nota e salva na matriz notas[i][j].
                        soma += notas[i][j]; //soma += notas[i][j]: soma a nota à variável soma.
                        break; //break: sai do while se a entrada for válida.

                    } else { // Se a nota for inválida (tipo "abc" ou usar vírgula), ele dá erro amigável e pede de novo.
                        System.out.println("Entrada invalida!");
                        scanner.next(); // limpa a entrada inválida - scanner.next() consome o que estava errado pra limpar o caminho.
                    }
                }
            }
        

//-----------------------------------------------
        //Calcula a média do aluno e guarda no vetor medias. scanner.nextLine() limpa o \n que sobra da leitura do último nextDouble().
            medias[i] = soma / 4;
            scanner.nextLine(); // limpa o buffer
        }
        }

        
        // Calcula médias (se for aleatório, precisa calcular aqui)
        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }
//===========================================================

        // Mostrar boletim
        System.out.println("\n--- Boletim dos Alunos ---");
        for (int i = 0; i < 5; i++) { // Novo laço pra percorrer cada aluno e mostrar os dados.
            System.out.print(nomes[i] + " - Notas: "); //Mostra o nome do aluno.
            for (int j = 0; j < 4; j++) { //Mostra as 4 notas do aluno, formatadas com a função formatarNumero.
                System.out.print(formatarNumero(notas[i][j]) + " ");
            }
            System.out.println("| Media: " + formatarNumero(medias[i])); // Mostra a média, também formatada bonitinha.
            System.out.println(" | Situacao: " + verificarSituacao(medias[i])); //puxa a funcao verificarsituacao e mostra na tela

        }

        scanner.close();
    }


   public static void gerarDadosAleatorios(String[] nomes, double[][] notas) {
        Random random = new Random();
        String[] nomesBase = {"Ana", "João", "Carlos", "Maria", "Bea", "Lucas", "Julia", "Pedro", "Sofia", "Rafael"};

        for (int i = 0; i < nomes.length; i++) {
            // Gera nome aleatório da lista
            nomes[i] = nomesBase[random.nextInt(nomesBase.length)];

            // Gera 4 notas aleatórias entre 0 e 10 (com 1 casa decimal)
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = Math.round(random.nextDouble() * 100) / 10.0; 
                // random.nextDouble() gera entre 0.0 e 1.0
                // Multiplica por 100 para virar 0 a 100, depois divide por 10 para ter uma casa decimal
            }
        }
   }
//=====================================================================================

    public static String formatarNumero(double num) {
        if (num == (long) num) { 
            return String.format("%d", (long) num);
        } else {
            return String.format("%.2f", num).replaceAll("0+$", "").replaceAll("\\.$", "");
        }
    }
        /* 
        
        ✨ O que essa função faz:

Se o número for inteiro (ex: 8.0), ela mostra como 8.

Se tiver casas decimais úteis (ex: 8.5, 7.25), ela mostra com 1 ou 2 casas.

Remove zeros e pontos desnecessários no final (9.00 → 9, 7.50 → 7.5).

==========================================================================================*/

//função que transforma double em string e manda uma resposta dependendo da condição
public static String verificarSituacao(double media) {
    if (media >= 7.0) {
        return "Aprovado";
    } else {
        return "Reprovado";
    
}

    }
}
