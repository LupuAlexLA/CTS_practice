package _99_My_Examples._02_structurale._01_Adapter._01_UsbAToUsbC;

public class UsbA implements IUsbA {
    private int transferSpeed = 100;
    private int actualSpeed = 0;
    @Override
    public void getData() {
        if (actualSpeed < transferSpeed) {
            System.out.println("geting data...");
        }
    }
}
