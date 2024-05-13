package test2_something_else.command;

public class Mecanic {
    public void reparaMotor() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Motorul s-a reparat! Ai infundat injectoarele!");
    }

    public void reparaTurbina() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Turbina s-a reparat! Avea span si am schimbat si conductele!");
    }

    public void schimbaConsumabile() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Uleiul si filtrele s-au schimbat!");
    }
}
