package aula04;
public class Aula04 {
    public static void main(String[]args) {

        Caneta c1 = new Caneta("", "verde", 0.5f);
        c1.setModelo("BIC");

        c1.setPonta(0.5);
        c1.status();

        Caneta c2 = new Caneta("leo&leo", "verde", 0.10);
        c2.status();

    }
}