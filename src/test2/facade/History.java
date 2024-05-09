package test2.facade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class History {
    public LocalDateTime lastVisit;

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit() {
        this.lastVisit = LocalDateTime.now();
        System.out.println("Last visit was on: " + lastVisit);
    }
}
