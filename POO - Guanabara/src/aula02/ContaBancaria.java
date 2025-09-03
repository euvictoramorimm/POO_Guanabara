package aula02;
public class ContaBancaria {

    //atributtes;

    int usuario;
    String senha;
    double saldo;
    String tipoConta;
    String nomeDaEmpresa;
    int cooperativa;
    int conta;

    //methods

    void depositar(double valorParaDepositar) {
        if (valorParaDepositar > 0) {
            this.saldo += valorParaDepositar;
            System.out.println("Depósito de R$" + valorParaDepositar + " realizado com sucesso.");
        } else {
            System.out.println("ERRO: Valor de depósito inválido");
        }

    }


}