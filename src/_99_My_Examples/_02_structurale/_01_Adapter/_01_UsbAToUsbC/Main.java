package _99_My_Examples._02_structurale._01_Adapter._01_UsbAToUsbC;

public class Main {
    public static void main(String[] args) {
        IUsbA usbA = new UsbA();
        usbA.getData();

        IUsbC usbC = new UsbC();
        usbC.transferData(500, 2);

        UsbAToUsbCObjAdapter objAdapter = new UsbAToUsbCObjAdapter(usbA);
        objAdapter.transferData(300, 1);

        UsbAToUsbCClsAdapter clsAdapter = new UsbAToUsbCClsAdapter();
        clsAdapter.transferData(200, 1);
    }
}
