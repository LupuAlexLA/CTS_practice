package _00_Examene._01_Creationale.T05_factoryMethod.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Subscription> subscriptions = new ArrayList<>();
    public static void main(String[] args) {
        System.out.print("Introduceti nr de abonamente: ");
        int nrAbonamente = scanner.nextInt();
        scanner.nextLine();

        SubscriptionFactory factory = new SubscriptionFactory();

        int count = nrAbonamente;
        while (count > 0) {
            System.out.print("Introduceti tipul de abonament dorit (X, Y, Z): ");
            String tipAbonament = scanner.nextLine();
            try {
                Subscription subscription = factory.createSubscription(tipAbonament);
                subscriptions.add(subscription);
            } catch (InvalidSubscriptionException e) {
                throw new RuntimeException(e);
            }
            count--;
        }

        subscriptions.forEach(s -> System.out.println(s.totalCosts(12)));

    }
}
