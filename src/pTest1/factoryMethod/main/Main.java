package pTest1.factoryMethod.main;

import pTest1.factoryMethod.classes.AbstractFactory;
import pTest1.factoryMethod.classes.Factory;
import pTest1.factoryMethod.classes.Sport;
import pTest1.factoryMethod.classes.SportType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("Ce categorie de sport doresti?");
            String categorie = scanner.nextLine();
            System.out.println("Cum se numeste echipa gazda?");
            String homeTeam = scanner.nextLine();
            System.out.println("Cum se numeste echipa oaspete?");
            String awayTeam = scanner.nextLine();

            Sport sport = factory.createSport(SportType.valueOf(categorie), homeTeam, awayTeam);
            System.out.println("Categorie: " + categorie + " echipa gazda: " + homeTeam + " echipa oaspete: " + awayTeam);
        }
    }
}
