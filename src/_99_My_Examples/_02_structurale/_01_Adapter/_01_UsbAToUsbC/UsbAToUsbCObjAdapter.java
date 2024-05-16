package _99_My_Examples._02_structurale._01_Adapter._01_UsbAToUsbC;

public class UsbAToUsbCObjAdapter implements IUsbC {
    private IUsbA usbA;

    public UsbAToUsbCObjAdapter(IUsbA usbA) {
        this.usbA = usbA;
    }

    @Override
    public void transferData(int sizeLimit, int time) {
        usbA.getData();
    }
}
