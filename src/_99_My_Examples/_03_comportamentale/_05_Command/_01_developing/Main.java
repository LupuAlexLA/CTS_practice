package _99_My_Examples._03_comportamentale._05_Command._01_developing;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Discord discord = new Discord();

        discord.takeTask(new BackendOrder(developer));
        discord.takeTask(new FrontendOrder(developer));

        discord.sendTasks();
    }
}
