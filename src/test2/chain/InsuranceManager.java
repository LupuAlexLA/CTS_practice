package test2.chain;

public class InsuranceManager extends InsuranceHandler {
    @Override
    public void compensation(double amount) {
        if(amount < 5000) {
            System.out.println("The amount of money was returned by manager!");
        }
        else {
            if (nextHandler != null) {
                nextHandler.compensation(amount);
            }
        }
    }
}
