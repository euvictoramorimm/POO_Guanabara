package aula02;
public class Livro {

    //atributtes
    String nome;
    int quantPag;
    String categoria;
    String autor;
    boolean aberto;

    //methods

    void abrir(){
        if (this.aberto == false) {
              System.out.println("Abrindo o livro... ");
        } else {
          System.out.println("O livro já está aberto. ");
        }
    }
    void fechar() {
        if (this.aberto ==true) {
            System.out.println("Fechando o livro... ");
        } else {
            System.out.println("O livro já está fechado");
        }
    }

}