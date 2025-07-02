import java.util.Scanner;

public class JogoDaVelha{
    static int[][] matriz = new int[3][3]; // 0 = vazio, 1 = jogador 1, 2 = jogador 2

    public static void main(String[] args){
        int jogadas = 0;
        int jogador = 1;

            for(int i = 0; i < 9; i++){
                
                System.out.print("Rodada "+(i+1)+"\n");
                tabela();// mostra o tabuleiro
                System.out.print("JOGADOR "+jogador+"\n");
                System.out.print("x----------------\n");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a linha: ");
                int linha = scanner.nextInt();
                System.out.print("Digite a coluna: ");
                int coluna = scanner.nextInt();
                // ve as coordenadas, armazena um 2 la

                if (matriz[linha][coluna] == 0){
                    matriz[linha][coluna] = jogador;
                    jogadas++;

                int vencedor = verificarVencedor();
                if(vencedor != 0){
                tabela();
                System.out.println("jogador "+vencedor+" venceu!");
                return;
            }

            jogador = (jogador == 1) ? 2 : 1;

        }else {
            System.out.println("onvalido");
        }
        }
tabela();        
                System.out.println("empate");

    
    }
    public static void tabela() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if(matriz[linha][coluna] == 0){
                System.out.print("   ");
                }else if( matriz[linha][coluna] == 1){
                System.out.print(" X ");
                }else{
                System.out.print(" O ");

                }


                if (coluna < 2) {
                    System.out.print("|");
                }
            }

            System.out.println(); // pula pra próxima linha

        }
    }

public static int verificarVencedor() {
    // Verifica linhas
    for (int i = 0; i < 3; i++) {
        if (matriz[i][0] != 0 &&
            matriz[i][0] == matriz[i][1] &&
            matriz[i][1] == matriz[i][2]) {
            return matriz[i][0]; // retorna o jogador que venceu
        }
    }

    // Verifica colunas
    for (int j = 0; j < 3; j++) {
        if (matriz[0][j] != 0 &&
            matriz[0][j] == matriz[1][j] &&
            matriz[1][j] == matriz[2][j]) {
            return matriz[0][j];
        }
    }

    // Verifica diagonal principal
    if (matriz[0][0] != 0 &&
        matriz[0][0] == matriz[1][1] &&
        matriz[1][1] == matriz[2][2]) {
        return matriz[0][0];
    }

    // Verifica diagonal secundária
    if (matriz[0][2] != 0 &&
        matriz[0][2] == matriz[1][1] &&
        matriz[1][1] == matriz[2][0]) {
        return matriz[0][2];
    }

    return 0; // ninguém venceu ainda
}

}