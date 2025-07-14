import java.util.Scanner;
public class Estoque {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Produto produto1 = new Produto();

            System.out.println("Nome do produto: ");
            produto1.name = scanner.nextLine();

            System.out.println("Preco: ");
            produto1.price = scanner.nextDouble();

            System.out.println("Quantidade em estoque: ");
            produto1.quantidade = scanner.nextInt();

            System.out.println(produto1.mensagem());

            System.out.println("adicionar produtos no estoque: ");
            int estoque = scanner.nextInt();
            produto1.adicionarProdutos(estoque);
            System.out.println(produto1.mensagem());

            System.out.println("remover produtos do estoque: ");
            estoque = scanner.nextInt();
            produto1.removerProdutos(estoque);
            System.out.println(produto1.mensagem());

            scanner.close();
    }
}
