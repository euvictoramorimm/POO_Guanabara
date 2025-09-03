package aula02;
public class Celular {

    //atributtes
    String cor;
    String sistema;
    int nivelBateria;
    int volume;
    boolean ligado;

    //methods
    void ligar() {
        ligado = true
    }

    void desligar() {
        ligado = false;
    }

    void carregar(){
        if (this.nivelBateria < 100) {
            System.out.println("Carregando o celular... ");
            this.nivelBateria = this.nivelBateria + 10
        }

        if (this.nivelBateria > 100) {
            this.nivelBateria = 100;
            System.out.println("Celular carregado!" )
        }
    }
}