package Gomes.Branquinho.Daniel;

public class Livros {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);
        autor.mostrarDetalhes();
        System.out.println("--");


    }

}
