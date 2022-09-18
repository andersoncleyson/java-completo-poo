package heranca.entities;

public class SavingAccountPlus extends SavingsAccount{
    @Override
    public void withDraw(double amount){
        balance -= amount + 2;
    }
}
