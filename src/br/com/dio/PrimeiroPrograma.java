package br.com.dio;
import java.util.Scanner;

import br.com.dio.model.Pessoa;

public class PrimeiroPrograma {


    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome1 = scanner.nextLine();
        System.out.println("E seu sobrenome?");
        String sobrenome = scanner.nextLine();
        System.out.println("Qual sua idade? ");
        Integer idade = scanner.nextInt();
        Pessoa pessoa = new Pessoa(nome1,sobrenome,idade);
        System.out.println(pessoa);




        System.out.println("Quantas paginas tem esse livro: ");
        int numPaginas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do livro: ");
        String nome = scanner.nextLine();
        System.out.println("E em quanto semanas voce quer ler esse livro?");
        int meta = scanner.nextInt();

        int  Qntpag = numPaginas / (meta * 7) ;

        Livro livro1 = new Livro(nome,numPaginas);
        System.out.println(livro1 + "\n "+ "E voce tem que ler " + Qntpag + " paginas por dia " +
                "para alcançar sua meta semanal de " + meta + " semanas " );

    }

}
class Livro {

    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "O Livro que voce escolheu foi " +
                 nome  +
                ", e tem " + numPaginas +
                " paginas";
    }
}
