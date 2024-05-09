package test2.adapter;

public class HdmiOutput implements AbstractHdmiOutput {
    @Override
    public void getVideoSignal() {
        System.out.println("Image in HDMI!");
    }
}
