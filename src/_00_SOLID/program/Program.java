package _00_SOLID.program;

import _00_SOLID.classes.ConsolePrinter;
import _00_SOLID.classes.ConsoleReader;
import _00_SOLID.classes.ProductCalculator;
import _00_SOLID.exceptions.InvalidListException;
import _00_SOLID.interfaces.Computable;
import _00_SOLID.interfaces.Printable;
import _00_SOLID.interfaces.Readable;

import java.util.ArrayList;
import java.util.List;

public class Program {
    // vers 1
    /*public void execute() throws InvalidListException {
        ConsoleReader consoleReader = new ConsoleReader();
        Computable computable = new ProductCalculator();
        ConsolePrinter consolePrinter = new ConsolePrinter();

        List<Integer> list = consoleReader.readValues();
        double result = computable.computeResult(list);
        consolePrinter.printResult(result);
    }*/

    // vers 2
    private Readable readable;
    private Computable computable;
    private Printable printable;

    public Program(Readable readable, Computable computable, Printable printable) {
        this.readable = readable;
        this.computable = computable;
        this.printable = printable;
    }

    // setter
    public void setComputable(Computable computable) {
        this.computable = computable;
    }

    public void execute() throws InvalidListException {
        List<Integer> list = readable.readValues();
        double result = computable.computeResult(list);
        printable.printResult(result);
    }
}
