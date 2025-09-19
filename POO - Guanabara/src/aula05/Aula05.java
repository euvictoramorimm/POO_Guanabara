package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1111);
        p1.setDono("Kilguess");
        p1.abrirConta("CC");

        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setDono("Rodriguess");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p1.sacar(150);

        p1.fecharConta();

        p1.EstadoAtual();
        p2.EstadoAtual();


    }
}