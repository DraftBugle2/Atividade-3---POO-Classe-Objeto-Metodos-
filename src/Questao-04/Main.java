package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Ler as notas com validação
        double nota1 = lerNota(scanner, "primeiro trimestre", 0, 30);
        double nota2 = lerNota(scanner, "segundo trimestre", 0, 35);
        double nota3 = lerNota(scanner, "terceiro trimestre", 0, 35);

        // Criar objeto NotaAluno
        NotaAluno aluno = new NotaAluno(nota1, nota2, nota3);

        // Calcular e exibir nota final
        double notaFinal = aluno.calcularNotaFinal();
        System.out.printf("Nota final de %s: %.2f%n", nome, notaFinal);

        // Verificar aprovação ou reprovação
        if (aluno.estaAprovado()) {
            System.out.printf("Aluno %s aprovado!%n", nome);
        } else {
            double pontosFaltando = aluno.calcularPontosFaltando();
            System.out.printf("Aluno %s reprovado! Faltam %.2f pontos para aprovação.%n", nome, pontosFaltando);
        }

        scanner.close();
    }

    // Método auxiliar para validar e ler notas
    private static double lerNota(Scanner scanner, String trimestre, double min, double max) {
        double nota;
        while (true) {
            System.out.printf("Digite a nota do %s (%.0f a %.0f): ", trimestre, min, max);
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= min && nota <= max) {
                    break; // Nota válida
                } else {
                    System.out.println("Nota fora do intervalo permitido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpar entrada inválida
            }
        }
        return nota;
    }
}
