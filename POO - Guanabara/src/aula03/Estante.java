package aula03;

public class Estante {

    //atributtes
    public String cor;
    public String material;
    public int prateleira;
    public boolean vazia;

    //methods
    void status() {
        System.out.println("A cor da estante é " + this.cor + ".");
        System.out.println("O estante é feita de " + this.material + ".");
        System.out.println("A estante tem " + this.prateleira + ".");
    }



}
