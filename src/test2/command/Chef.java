package test2.command;
// executantul comenzilor
public class Chef {
    public void cookPizza() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The pizza is ready!");
    }

    public void cookBurgers() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The burger is ready!");
    }

    public void cookPasta() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The pasta is ready!");
    }
}
