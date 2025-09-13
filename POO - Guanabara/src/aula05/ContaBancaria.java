package aula05;
import java.util.Scanner;

public class ContaBancaria {

    //attributes
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    //methods
    public void abrirConta(String tipo) {
        //Se abrir conta corrente ganha R$50,00 se for conta poupança ganha R$150,00
        setTipo(tipo);
        setStatus(true);
        if(tipo == "CC") {
            saldo = 50;
        }else if (tipo == "CP")  {
            saldo = 150;
        }

    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro, é necessário estar zerada para fechamento da conta.");
        } else if (saldo < 0) {
            System.out.println("A conta está em débito, é necessário estar em dia para fechamento da conta");
        } else {
            System.out.println("Conta fechada com sucesso!");
            status = false;
        }


    }

    public void depositar(double v) {
        if (status == true) {
            saldo += v;
        } else {
            System.out.println("Impossível depositar");
        }


    }

    public void sacar(double v) {
        if (status == true) {
            saldo -= v;
        } else {
            System.out.println("Impossível sacar");
        }

    }

    public void pagarMensal(double v) {
    //A mensalidade a ser paga na conta corrente é de R$12 e o de conta poupança R$20
        if (tipo == "CC") {
                v = 12;
        } else if (tipo == "CP") {
                v = 20;
        }

        if (status == true) {
            if (saldo >= v) {
                saldo -= v;
            }else {
                System.out.println("Saldo insuficiente.");
            }
        }else {
            System.out.println("Impossível pagar!");
        }
    }

    //getters e setters
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //constructor method
    public ContaBancaria() {
        saldo = 0;
        status = false;
    }

}

