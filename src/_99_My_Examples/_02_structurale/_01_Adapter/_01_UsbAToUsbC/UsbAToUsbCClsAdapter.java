package _99_My_Examples._02_structurale._01_Adapter._01_UsbAToUsbC;

public class UsbAToUsbCClsAdapter extends UsbA implements IUsbC {
    @Override
    public void transferData(int sizeLimit, int time) {
        super.getData();
    }
}
