package ExercicioExcecao.entities;

import ExercicioExcecao.exceptions.BusinessExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withDrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getWithDrawLimit(){
        return this.withDrawLimit;
    }

    public void deposit(Double amount){
        this.balance = balance + amount;
    }

    public void withDraw(Double amount){
        validateWithdraw(amount);
        this.balance = balance - amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithDrawLimit()) {
            throw new BusinessExceptions("Erro de saque: A quantia excede o limete de saque");
        }

        if(amount > getBalance()){
            throw new BusinessExceptions("Erro de saque: saldo insuficiente");
        }

    }
}
