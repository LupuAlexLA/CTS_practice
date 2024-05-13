package test2.structurale.adapter;

public class HdmiToVgaClsAdapter extends HdmiOutput implements AbstractVgaInput {
    @Override
    public void receiveVideoSignal(String color, int resolution) {
        super.getVideoSignal();
    }
}
