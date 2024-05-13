package test2.structurale.adapter;

public class HdmiToVgaObjAdapter implements AbstractVgaInput {
    private AbstractHdmiOutput hdmiOutput;

    public HdmiToVgaObjAdapter(AbstractHdmiOutput hdmiOutput) {
        this.hdmiOutput = hdmiOutput;
    }

    @Override
    public void receiveVideoSignal(String color, int resolution) {
        hdmiOutput.getVideoSignal();
    }
}
