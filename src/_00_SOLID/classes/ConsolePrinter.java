package _00_SOLID.classes;

import _00_SOLID.interfaces.Printable;

public class ConsolePrinter implements Printable {
    @Override
    public void printResult(double result) {
        System.out.println("Result is " + result);
    }
}
