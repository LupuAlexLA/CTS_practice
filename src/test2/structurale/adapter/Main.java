package test2.structurale.adapter;

public class Main {
    public static void main(String[] args) {

        AbstractHdmiOutput hdmiOutput = new HdmiOutput();

        AbstractVgaInput vgaInput = new HdmiToVgaObjAdapter(hdmiOutput);
        vgaInput.receiveVideoSignal("alb-negru", 1080);

        vgaInput = new HdmiToVgaClsAdapter();
        vgaInput.receiveVideoSignal("color", 2160);
    }
}
