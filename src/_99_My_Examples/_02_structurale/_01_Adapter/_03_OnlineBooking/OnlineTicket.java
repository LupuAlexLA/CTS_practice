package _99_My_Examples._02_structurale._01_Adapter._03_OnlineBooking;

public class OnlineTicket implements OnlineBooking {
    @Override
    public String showOrderDetails() {
        return "The movie started!";
    }
}
