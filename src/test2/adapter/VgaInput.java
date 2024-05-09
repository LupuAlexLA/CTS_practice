package test2.adapter;

public class VgaInput implements AbstractVgaInput {
    @Override
    public void receiveVideoSignal(String color, int resolution) {
        System.out.println("The signal was received in VGA! color: " + color + " resolution: " + resolution);
    }
}
