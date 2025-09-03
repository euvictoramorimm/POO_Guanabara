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
              this.aberto = true;
        } else {
          System.out.println("O livro já está aberto. ");
        }
    }
    void fechar() {
        if (this.aberto ==true) {
            System.out.println("Fechando o livro... ");
            this.aberto = false;
        } else {
            System.out.println("O livro já está fechado");
        }
    }

}