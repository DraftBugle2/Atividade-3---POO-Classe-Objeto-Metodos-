package Questao01;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeNoEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeNoEstoque) {
        this.nome = nome;
        this.preco = preco > 0 ? preco : 0.0;
        this.quantidadeNoEstoque = quantidadeNoEstoque > 0 ? quantidadeNoEstoque : 0;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        if (quantidadeNoEstoque >= 0) {
            this.quantidadeNoEstoque = quantidadeNoEstoque;
        } else {
            System.out.println("Quantidade no estoque não pode ser negativa.");
        }
    }

    // Métodos principais
    public void mostrarDados() {
        double valorTotalNoEstoque = preco * quantidadeNoEstoque;
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Preço: %.2f%n", preco);
        System.out.printf("Quantidade no estoque: %d%n", quantidadeNoEstoque);
        System.out.printf("Valor total no estoque: %.2f%n", valorTotalNoEstoque);
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeNoEstoque += quantidade;
        } else {
            System.out.println("Quantidade para adicionar deve ser maior que zero.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (quantidade > quantidadeNoEstoque) {
                System.out.println("Quantidade solicitada excede a quantidade disponível no estoque.");
            } else {
                this.quantidadeNoEstoque -= quantidade;
            }
        } else {
            System.out.println("Quantidade para remover deve ser maior que zero.");
        }
    }
}
