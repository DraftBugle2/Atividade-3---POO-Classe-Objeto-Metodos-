package Questao04;

public class NotaAluno {
    private double nota1;
    private double nota2;
    private double nota3;

    // Construtor
    public NotaAluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular a nota final
    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    // Verificar se está aprovado
    public boolean estaAprovado() {
        return calcularNotaFinal() >= 70;
    }

    // Calcular pontos faltando para aprovação
    public double calcularPontosFaltando() {
        double pontosFaltando = 70 - calcularNotaFinal();
        return Math.max(0, pontosFaltando);
    }

    // Getters e Setters
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
