package Gomes.Branquinho.Daniel;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor1 = new Autor();
        autor1.setNome("Rodrigo");
        autor1.setEmail("rodrigo@hotmail.com");
        autor1.setCpf("452.215.365.8");

        Livros livro1 = new Livros(autor1);
        livro1.setNome("Teste Java");
        livro1.setDescricao("Fala sobre java");
        livro1.setValor(59);
        livro1.setIsbn("7777");


        livro1.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.setNome("Alberto");
        autor2.setEmail("alb@gmail.com");
        autor2.setCpf("357.890.678.5");

        Livros livro2 = new Livros(autor2);
        livro2.setNome("Teste OO");
        livro2.setDescricao("Fala sobre OO");
        livro2.setValor(150);
        livro2.setIsbn("9999");


        livro2.mostrarDetalhes();

    }

}
