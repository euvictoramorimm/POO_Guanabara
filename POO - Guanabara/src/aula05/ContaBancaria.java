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

    public void EstadoAtual() {
        System.out.println("==========================");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Dono: "+ this.dono);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Status: "+ this.status);
    }




    public void abrirConta(String tipo) {
        //Se abrir conta corrente ganha R$50,00 se for conta poupança ganha R$150,00
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC") {
            this.setSaldo(50);
        }else if (tipo == "CP")  {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, é necessário estar zerada para fechamento da conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta está em débito, é necessário estar em dia para fechamento da conta.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }


    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo += v;
            this.setSaldo(this.getSaldo() + v) ;
            System.out.println("Déposito realizado de R$" + v + " na conta de " + this.getDono() + ".");
        } else {
            System.out.println("Impossível depositar.");
        }


    }

    public void sacar(float v) {
        if (this.getStatus()) {
           if (this.getSaldo() >= v) {
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque de " + v + "realizado!");
           } else {
               System.out.println("Saldo insuficiente, o saque não pode ser realizado.");
           }

        } else {
            System.out.println("Conta fechada, o saque não pode ser realizado.");
        }
    }

    public void pagarMensal(double v) {
    //A mensalidade a ser paga na conta corrente é de R$12 e o de conta poupança R$20
        if (this.getTipo() == "CC") {
                v = 12;
        } else if (this.getTipo() == "CP") {
                v = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v); {
                System.out.println("Mensalidade paga com sucesso!");
            }
        } else {
            System.out.println("Saldo insuficiente.");
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //constructor method
    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }

}

