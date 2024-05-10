package test2.chain;

public class InsuranceExecutive extends InsuranceHandler {
    @Override
    public void compensation(double amount) {
        System.out.println("The amount of money was returned by executive!");
        if(nextHandler != null) {
            nextHandler.compensation(amount);
        }
    }
}
