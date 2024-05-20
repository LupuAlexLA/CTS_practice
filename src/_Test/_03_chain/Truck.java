package _Test._03_chain;

public class Truck extends DeliverHandler {
    @Override
    public String getDestinationBasedOnBarcode() {
        if("deposit".equals(actualDestination)) {
            return "deposit";
        } else if(nextHandler != null) {
            return nextHandler.getDestinationBasedOnBarcode();
        }
        else {
            return "error";
        }
    }

    @Override
    public void handleRequest(String destination) {
        if("deposit".equals(destination)) {
            actualDestination = "deposit";
            System.out.println("Truck delivery");
        }
        else {
            nextHandler.handleRequest(destination);
            actualDestination = nextHandler.getDestinationBasedOnBarcode();
        }
    }
}
