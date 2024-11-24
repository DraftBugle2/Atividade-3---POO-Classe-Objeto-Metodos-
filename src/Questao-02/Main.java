package Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);

        funcionario.mostrarDados();

        scanner.close();
    }
}
