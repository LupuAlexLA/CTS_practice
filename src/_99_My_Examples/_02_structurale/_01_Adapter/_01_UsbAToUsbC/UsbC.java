package _99_My_Examples._02_structurale._01_Adapter._01_UsbAToUsbC;

public class UsbC implements IUsbC {
    private int size = 1000;
    private int second = 5;
    @Override
    public void transferData(int sizeLimit, int time) {
        if(sizeLimit <= size && time <= second) {
            System.out.println("The transfer was done in " + time + " seconds, contains " + sizeLimit + " mb");
        }
    }
}
