package practiceInainteDeTest1._00_RecapTest.prototype.classes;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] actori = new String[] {"A1", "A2"};
        String[] seats = new String[] {"S1_20", "S1_21"};

        MovieTicket ticket = new MovieTicket("Predators", actori,
                "Marvel", LocalDateTime.now(), seats);

        MovieTicket clone1 = (MovieTicket) ticket.clone();
        MovieTicket clone2 = (MovieTicket) ticket.clone();
        MovieTicket clone3 = (MovieTicket) ticket.clone();

        String[] seatsC1 = new String[] {"X1_20", "X1_21"};
        String[] seatsC2 = new String[] {"Y1_20", "Y1_21"};
        String[] seatsC3 = new String[] {"Z1_20", "Z1_21"};

        clone1.setSeats(seatsC1);
        clone2.setSeats(seatsC2);
        clone3.setSeats(seatsC3);

        System.out.println(clone1.print());
        System.out.println(clone2.print());
        System.out.println(clone3.print());
    }
}
