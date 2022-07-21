package br.com.dio;

public class primeiroprograma {
    public static void main(String[] args) {
       Gato gato = new Gato();

       System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos", "300");
        System.out.println(Livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello, World!" + (a+b));*/
    }

}
class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro() {
    }

    public Livro(String nome, String numPaginas) {
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


    }
