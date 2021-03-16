package Gomes.Branquinho.Daniel;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo";
        autor.email = "rodrigo@hotmail.com";
        autor.cpf = "452.215.365.8";

        Livros livro = new Livros();
        livro.nome = "Teste Java";
        livro.descricao = "Fala sobre java";
        livro.valor = 59;
        livro.isbn = "7777";
        livro.autor = autor;
        livro.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.nome = "Antonio";
        autor2.email = "antonio@uol.com";
        autor2.cpf = "896.658.964.32";

        Livros livro2 = new Livros();
        livro2.nome = "Programando";
        livro2.descricao = "Programação";
        livro2.valor = 150;
        livro2.isbn = "696969";
        livro2.autor = autor2;
        livro2.mostrarDetalhes();

    }

}
