package test2.adapter;

public class HdmiToVgaClsAdapter extends HdmiOutput implements AbstractVgaInput {
    @Override
    public void receiveVideoSignal(String color, int resolution) {
        super.getVideoSignal();
    }
}
