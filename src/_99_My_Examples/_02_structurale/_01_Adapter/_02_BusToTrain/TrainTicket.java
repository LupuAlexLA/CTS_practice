package _99_My_Examples._02_structurale._01_Adapter._02_BusToTrain;

public class TrainTicket implements ITrainTicket {
    private int wagonNo = 5;
    private int seatNo = 100;

    @Override
    public void buyTicket(int wagonNo, int seatNo) {
        if(wagonNo <= this.wagonNo && seatNo <= this.seatNo) {
            System.out.println("your ticket: wagon " + wagonNo + " seat " + seatNo);
        }
    }
}
