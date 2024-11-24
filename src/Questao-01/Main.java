package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar informações do produto
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = lerValorDouble(scanner);

            System.out.print("Digite a quantidade no estoque: ");
            int quantidadeNoEstoque = lerValorInteiro(scanner);

            Produto produto = new Produto(nome, preco, quantidadeNoEstoque);

            // Menu interativo
            boolean continuar = true;
            while (continuar) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Mostrar dados do produto");
                System.out.println("2. Adicionar quantidade ao estoque");
                System.out.println("3. Remover quantidade do estoque");
                System.out.println("4. Sair");
                System.out.print("Opção: ");

                int opcao = lerValorInteiro(scanner);

                switch (opcao) {
                    case 1:
                        // Mostrar dados do produto
                        System.out.println("\nDados do produto:");
                        produto.mostrarDados();
                        break;

                    case 2:
                        // Adicionar ao estoque
                        System.out.print("\nDigite a quantidade a ser adicionada ao estoque: ");
                        int quantidadeEntrada = lerValorInteiro(scanner);
                        produto.adicionarEstoque(quantidadeEntrada);
                        System.out.println("\nQuantidade adicionada com sucesso!");
                        break;

                    case 3:
                        // Remover do estoque
                        System.out.print("\nDigite a quantidade a ser removida do estoque: ");
                        int quantidadeSaida = lerValorInteiro(scanner);
                        produto.removerEstoque(quantidadeSaida);
                        break;

                    case 4:
                        // Sair
                        System.out.println("Saindo do programa. Obrigado!");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Métodos auxiliares para validação de entrada
    private static double lerValorDouble(Scanner scanner) {
        double valor;
        while (true) {
            try {
                valor = Double.parseDouble(scanner.nextLine());
                if (valor >= 0) {
                    break;
                } else {
                    System.out.print("Digite um valor válido (maior ou igual a zero): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um valor numérico: ");
            }
        }
        return valor;
    }

    private static int lerValorInteiro(Scanner scanner) {
        int valor;
        while (true) {
            try {
                valor = Integer.parseInt(scanner.nextLine());
                if (valor >= 0) {
                    break;
                } else {
                    System.out.print("Digite um valor válido (maior ou igual a zero): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
        return valor;
    }
}
