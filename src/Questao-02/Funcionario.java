package Questao02;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    double getSalario() {
        return salario;
    }

    void setSalario(double salario) {
        this.salario = salario;
    }

    double calcularSalarioComAumento() {
        double aumento = 0.0;
        if (salario >= 1 && salario <= 1000) {
            aumento = 0.15; // 15%
        } else if (salario >= 1001 && salario <= 1500) {
            aumento = 0.10; // 10%
        } else if (salario >= 1501 && salario <= 2000) {
            aumento = 0.05; // 5%
        }
        return salario * (1 + aumento);
    }


    void mostrarDados() {
        double salarioComAumento = calcularSalarioComAumento();
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salário atual: %.2f%n", salario);
        System.out.printf("Salário com aumento: %.2f%n", salarioComAumento);
    }
}


