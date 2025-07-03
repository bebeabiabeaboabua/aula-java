import java.util.Scanner;

public class JogoDaVelha {
    
    static int[][] matriz = new int[3][3]; // 0 = vazio, 1 = jogador 1, 2 = jogador 2

    public static void main(String[] args) {

//X========== VARIAVEIS ============X
        Scanner scanner = new Scanner(System.in);
        String resposta; // vai guardar o s ou n de jogar de novo
        boolean deNovo; // vai ver se a pessoa digitou s para armazenar true e rodar o while pra jogar de novo
        int jogador = 1; //declara o jogador, começando no 1
        boolean venceu = false; //variavel boolean pra caso alguem vença

//X=========== LOOP PRINCIPAL ===============X

        do { //vai rodar tudo uma vez anttes de ler o while
            // Resetando a matriz e variáveis
            for (int i = 0; i < 3; i++) { //linha
                for (int j = 0; j < 3; j++) { //coluna
                    matriz[i][j] = 0; //limpa pra jogar a próxima partida colocando 0 em cada posição, faz efeito quando a pessoa que jogar de novo
                }
            }

//------------- FOR PARA RODAR O JOGO ATÉ O LIMITE DAS 9 CASAS DO TABULEIRO

            for (int i = 0; i < 9; i++) {
                limparTela(); //chama pra limpar a tela

//--------------INPUT DO USUARIO
                System.out.print("Rodada " + (i + 1) + "\n"); // imprime o numero da rodada baseado no i do for, somando 1 pra come
                System.out.print("x----------------\n");
                tabela(); //chama a função e mostra o tabuleiro

                System.out.print("JOGADOR " + jogador + "\n"); //imprime o jogador 1 ou 2, comecando no 1
                System.out.print("x----------------\n");

                System.out.print("Digite a linha: ");
                int linha = scanner.nextInt();
                System.out.print("Digite a coluna: ");
                int coluna = scanner.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && matriz[linha][coluna] == 0) { //analisa se as coordenadas que o jogador digitou sao validas
                    matriz[linha][coluna] = jogador; // aqui ele vai colocar o valor de jogador, que equivale a 1 ou 2, depende se é o jogador 1 ou 2, no lugar da matriz que ele digitou

                    int vencedor = verificarVencedor(); //depois do jogador fazer a jogada ele verifique se alguem ganhou
                    if (vencedor != 0) { //caso alguem tenha ganho, ele vai executar e colocar o valor que retornou que é jogador 1 ou 2
                        limparTela();
                        tabela(); //mostra o tabuleiro atualizado
                        System.out.println("Jogador " + vencedor + " venceu!"); // mostra o vencedor
                        venceu = true; //avisa que tem vencedor
                        break; // Sai do for
                    }

                    jogador = (jogador == 1) ? 2 : 1; // alterna entre jogador 1 e 2

                } else { //caso a pessoa digitou algo invalido
                    System.out.println("Jogada invalida. Tente novamente.");
                    i--; // Volta uma jogada
                }
            }

            if (!venceu) { // caso não tenha avisado que tem vencedor. Só vai rodar depois que o for acabar e se o for acabar sem vencedores, só pode ser empate
                limparTela();
                tabela();
                System.out.println("Empate!");
            }

            System.out.println("Jogar de novo? (s/n)"); // depois que acaba o for, pergunta se quer jogar de novo
            scanner.nextLine(); // Limpa o Enter que sobrou
            resposta = scanner.nextLine(); //scanneia a resposta
            deNovo = resposta.equalsIgnoreCase("s"); // diz que deNovo é true se a resposta for s ou S
            jogador = 1;

        } while (deNovo); // caso deNovo seja verdadeiro, roda todo o codigo de novo

        System.out.println("Encerrando o jogo. Obrigada por jogar!");// caso seja falso, nao vai rodar o while e vem direto pra ca, encerrando o programa
    }


//X============== FUNÇÃO PRA LIMPAR A TELA ============X
    public static void limparTela(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println("Erro ao tentar limpar tela");
        }
    }

 // X================== FUNÇÃO DE IMPRIMIR E ATUALIZAR O TABULEIRO ===================X   
    public static void tabela() {
        System.out.println("   0   1   2"); // mostra as coordenadas para ajudar o usuario

        for (int linha = 0; linha < 3; linha++) { //le as linhas
            System.out.print(linha + " "); // coloca um espaço vazio
            for (int coluna = 0; coluna < 3; coluna++) { // le as colunas
                if (matriz[linha][coluna] == 0) { // caso nenhum jogador tenha preenchido, coloca só espaço
                    System.out.print("   ");
                } else if (matriz[linha][coluna] == 1) { // caso o jogador 1 tenha preenchido, imprime um X
                    System.out.print(" X ");
                } else {
                    System.out.print(" O "); // se não for 0 nem 1, so pode ser o jogador 2, então imprime um O
                }

                if (coluna < 2) {
                    System.out.print("|"); //colunas da tabela
                }
            }
            System.out.println();
            if (linha < 2) { // linhas da tabela
                System.out.println("  -----------");
            }
        }
    }

/// X============ FUNÇÃO PARA VERIFICAR SE TEM VENCEDOR ===============X

// Essa função percorre o tabuleiro e verifica se algum jogador venceu
// Se encontrar três símbolos iguais na mesma linha, coluna ou diagonal, ela retorna o número do jogador vencedor (1 ou 2)
// Caso ninguém tenha vencido ainda, retorna 0, o jogo continua

public static int verificarVencedor() {

    // Verificando as LINHAS:
    // Vamos passar por cada linha da matriz (de 0 até 2)
    for (int i = 0; i < 3; i++) {
        // Checa se a primeira célula da linha NÃO está vazia (precisa ter sido preenchida por algum jogador)
        // E se os três valores da linha são iguais (ou seja, um jogador dominou a linha inteira)
        if (matriz[i][0] != 0 && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
            return matriz[i][0];  // Retorna o número do jogador que venceu (1 ou 2)
        }
    }

    // Verificando as COLUNAS:
    // Agora vamos passar por cada coluna (de 0 até 2)
    for (int j = 0; j < 3; j++) {
        // Checa se a primeira célula da coluna NÃO está vazia
        // E se os três valores da coluna são iguais (o jogador dominou a coluna inteira)
        if (matriz[0][j] != 0 && matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j]) {
            return matriz[0][j];  // Retorna o número do jogador vencedor
        }
    }

    // Verificando a DIAGONAL PRINCIPAL:
    // Checa se o canto superior esquerdo, o centro e o canto inferior direito têm o mesmo valor e não estão vazios
    if (matriz[0][0] != 0 && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
        return matriz[0][0];  // Retorna o jogador que venceu pela diagonal principal
    }

    // Verificando a DIAGONAL SECUNDARIA:
    // Checa se o canto superior direito, o centro e o canto inferior esquerdo têm o mesmo valor e não estão vazios
    if (matriz[0][2] != 0 && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
        return matriz[0][2];  // Retorna o jogador que venceu pela diagonal secundária
    }

    // Se nenhuma condição de vitória foi satisfeita, retorna 0:
    // Isso significa que ninguém venceu ainda (o jogo pode continuar ou dar empate)
    return 0;
}
}