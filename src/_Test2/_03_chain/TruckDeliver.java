package _Test2._03_chain;

public class TruckDeliver extends DeliverHandler {
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
            System.out.println("Truck delivery! Truck driver handle it!");
        }
        else {
            if(nextHandler != null) {
                nextHandler.handleRequest(destination);
                actualDestination = nextHandler.getDestinationBasedOnBarcode();
            }
        }
    }
}
