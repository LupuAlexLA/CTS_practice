package test2_something_else.observer;

public class Main {
    public static void main(String[] args) {
        HartaRadiatiei hartaRadiatiei = new HartaRadiatiei("Militari");

        Membru m1 = new Membru();
        Membru m2 = new Membru();

        hartaRadiatiei.aboneaza(m1);
        hartaRadiatiei.aboneaza(m2);

        hartaRadiatiei.sendNotifications("Peak: 3 V/m; Average: 3000 uW/m2");

        hartaRadiatiei.dezaboneaza(m2);

        hartaRadiatiei.sendNotifications("Peak: 5 V/m; Average: 6000 uW/m2");
    }
}
