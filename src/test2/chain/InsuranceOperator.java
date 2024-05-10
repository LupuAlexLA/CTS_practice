package test2.chain;

public class InsuranceOperator extends InsuranceHandler {
    @Override
    public void compensation(double amount) {
        if(amount <= 2000) {
            System.out.println("The amount of money was returned by operator!");
        }
        else {
            if(nextHandler != null) {
                nextHandler.compensation(amount);
            }
        }
    }
}
