package _Test._03_chain;

public class Courier extends DeliverHandler {
    @Override
    public String getDestinationBasedOnBarcode() {
        if("receiver".equals(actualDestination)) {
            return "receiver";
        } else if(nextHandler != null) {
            return nextHandler.getDestinationBasedOnBarcode();
        }
        else {
            return "error";
        }
    }

    @Override
    public void handleRequest(String destination) {
        if("receiver".equals(destination)) {
            actualDestination = "receiver";
            System.out.println("Courier delivery");
        }
        else {
            if(nextHandler != null) {
                nextHandler.handleRequest(destination);
                actualDestination = nextHandler.getDestinationBasedOnBarcode();
            }
            else {
                System.out.println("request cannot handle");
            }
        }
    }
}
