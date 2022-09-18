package IntroducaoPOO.entities;

public class ContaBanco {

    private int numeroConta;

    private String name;

    private double saldoValor;


    public ContaBanco(){}

    public ContaBanco(int numeroConta, String name, double depositoInicial){
        this.numeroConta = numeroConta;
        this.name = name;
        depositarValor(depositoInicial);
    }

    public ContaBanco(int numeroConta, String name){
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSaldoValor(){
        return saldoValor;
    }

    public void setDepositoValor(double depositoValor){
        this.saldoValor = depositoValor;
    }

    public void depositarValor(double valor){
        this.saldoValor += valor;
    }

    public void sacarValor(double valor){
        if(this.saldoValor < valor){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldoValor -= valor + 5;
        }
    }

    public String toString(){
        return "Account " + this.numeroConta + " Holder: " + this.name + ", Balance: $ " + String.format("%.2f", this.saldoValor);
    }
}
