package _00_ChatGPT_sameProblems._03_FactoryMethod.ex2;

import java.time.LocalDateTime;

public interface HealthActivityReport {
    LocalDateTime getTimestamp();
    String getActivityType();
    int getDurationMinutes();
    String getDetails();
}
