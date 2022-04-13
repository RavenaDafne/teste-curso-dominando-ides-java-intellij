package br.com.dio;

import br.com.dio.model.Dog;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog);


        int numPag;
        Livro livro1 = new Livro("O Problema dos três corpos", numPag = 300);
        System.out.println(livro1);
        
/*        int a = 3;
       int b = 5;
        System.out.println( "Hello World  " + (a+b));*/
    }
}
 class  Livro {
    private String nome;
    private Integer numPag;

     public Livro(String nome, Integer numPag) {
         this.nome = nome;
         this.numPag = numPag;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPag() {
         return numPag;
     }

     public void setNumPag(Integer numPag) {
         this.numPag = numPag;
     }

     @Override
     public String toString() {
         return "Livro{" +
                 "nome='" + nome + '\'' +
                 ", numPag=" + numPag +
                 '}';
     }
 }

