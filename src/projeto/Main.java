package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        String nome;
        double preco;
        int quantidade;

        String nome2;
        double preco2;
        int quantidade2;

        nome = scan.nextLine();

        preco = scan.nextDouble();
        quantidade = scan.nextInt();
        scan.nextLine();

        nome2 = scan.nextLine();

        preco2 = scan.nextDouble();
        quantidade2 = scan.nextInt();

        Livro livro1 = new Livro(nome, preco, quantidade);
        Livro livro2 = new Livro(nome2, preco2, quantidade2);

        double somaPreco = (livro1.getPreco() * livro1.getQuantidade()) + (livro2.getPreco() * livro2.getQuantidade());
        int somaQuantidade = livro1.getQuantidade() + livro2.getQuantidade();

        System.out.println("Valor total da compra: " + deci.format(somaPreco));
        System.out.println("Numero de livros comprados: " + somaQuantidade);
        System.out.println("Obrigado por comprar na nossa livraria!");
        //System.out.println("");

    }

    static class Livro {

        private String nome;
        private double preco;
        private int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public Livro() {
        }

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
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

    }

}
