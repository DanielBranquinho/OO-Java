package Gomes.Branquinho.Daniel;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.setValor(59.90);

        System.out.println("Valor atual: "+livro.getValor());

        if(!livro.aplicaDescontoDe(0.1)){
            System.out.println("Desconto não pode ser maior do que 30%");

        }else {
            System.out.println("Valor com desconto: "+livro.getValor());
        }

    }
}
