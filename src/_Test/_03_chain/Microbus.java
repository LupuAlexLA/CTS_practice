package _Test._03_chain;

public class Microbus extends DeliverHandler {
    @Override
    public String getDestinationBasedOnBarcode() {
        if("local".equals(actualDestination)) {
            return "local";
        } else if(nextHandler != null) {
            return nextHandler.getDestinationBasedOnBarcode();
        }
        else {
            return "error";
        }
    }

    @Override
    public void handleRequest(String destination) {
        if("local".equals(destination)) {
            actualDestination = "local";
            System.out.println("Microbus delivery");
        }
        else {
            nextHandler.handleRequest(destination);
            actualDestination = nextHandler.getDestinationBasedOnBarcode();
        }
    }
}
