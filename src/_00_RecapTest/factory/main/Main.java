package _00_RecapTest.factory.main;

import _00_RecapTest.factory.classes.AbstractOptionFactory;
import _00_RecapTest.factory.classes.OptionFactory;
import _00_RecapTest.factory.classes.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Subscription> subscriptions = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        AbstractOptionFactory factory = new OptionFactory();


        System.out.println("Cate abonam?");
        int nrAb = scanner.nextInt();

        for(int i = 0; i < nrAb; i++) {
            System.out.println("ce optiune vrei?");
            String optiune = scanner.nextLine();

            Subscription subscription = factory.createOption(optiune);
            subscriptions.add(subscription);
        }

        subscriptions.forEach(s -> s.totalCosts(12));
    }
}
