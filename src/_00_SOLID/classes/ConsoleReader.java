package _00_SOLID.classes;

import _00_SOLID.interfaces.Readable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements Readable {
    public static int NO_OF_VALUES = 5;
    @Override
    public List<Integer> readValues() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.printf("Enter %d values!", NO_OF_VALUES);
        for(int i = 0; i < NO_OF_VALUES; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
