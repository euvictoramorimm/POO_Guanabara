package aula03;
public class Caneta {

    //atributtes
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    //methods
    void status() {
        System.out.println("Modelo: " + this.modelo + ".");
        System.out.println("Uma caneta " + this.cor + ".");
        System.out.println("Ponta: "+ this.ponta + ".");
        System.out.println("Carga: "+this.carga + "%.");
        System.out.println("Está tampada? " + this.tampada + ".");
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Rabiscando...");
        }


    }

    protected void tampar(){
        this.tampada = true;

    }

    protected void destampar(){
        this.tampada = false;

    }

}