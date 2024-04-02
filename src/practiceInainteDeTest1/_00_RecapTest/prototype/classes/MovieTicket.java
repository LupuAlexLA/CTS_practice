package practiceInainteDeTest1._00_RecapTest.prototype.classes;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MovieTicket implements Ticket, Cloneable {
    private String titlu;
    private String[] actori;
    private String productie;

    private LocalDateTime timeStamp;
    private String[] seats;

    public MovieTicket(String titlu, String[] actori, String productie,
                       LocalDateTime timeStamp, String[] seats) {
        System.out.println("The ticket is loading!...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.titlu = titlu;
        this.actori = actori;
        this.productie = productie;
        this.timeStamp = timeStamp;
        this.seats = seats;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String[] getActori() {
        return actori;
    }

    public void setActori(String[] actori) {
        this.actori = actori;
    }

    public String getProductie() {
        return productie;
    }

    public void setProductie(String productie) {
        this.productie = productie;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String[] getSeats() {
        return seats;
    }

    public void setSeats(String[] seats) {
        this.seats = seats;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MovieTicket copy = (MovieTicket) super.clone();
        copy.timeStamp = timeStamp;
        copy.seats = seats;
        return copy;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "titlu='" + titlu + '\'' +
                ", actori=" + Arrays.toString(actori) +
                ", productie='" + productie + '\'' +
                ", timeStamp=" + timeStamp +
                ", seats=" + Arrays.toString(seats) +
                '}';
    }

    @Override
    public String print() {
        return "This is your ticket!" +
                "date: " + timeStamp +
                "seats: " + seats[0] + ", " + seats[1];
    }
}
