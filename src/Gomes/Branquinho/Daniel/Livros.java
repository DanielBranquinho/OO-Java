package Gomes.Branquinho.Daniel;

public class Livros {
    private String  nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livros(){
    }

    public Livros(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }



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
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor*porcentagem;
        return true;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn (String isbn){
        this.isbn = isbn;
    }

    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }




}
