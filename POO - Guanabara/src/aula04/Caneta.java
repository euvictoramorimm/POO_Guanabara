package aula04;
public class Caneta {

    //atributtes
    private String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    //methods
    void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("==============");
        System.out.println("Modelo: " + this.modelo + ".");
        //System.out.println("Cor: " + this.cor + ".");
        System.out.println("Ponta: " + this.ponta + ".");
        /*System.out.println("Carga: " + this.carga + "%.");
        if (this.tampada = true) {
            System.out.println("A caneta está tampada");
        }else {
            System.out.println("A caneta está destampada");
        }*/
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não foi possível rabiscar, a caneta está tampada");
        }else {
            System.out.println("Rabiscando...");
        }


    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }

}