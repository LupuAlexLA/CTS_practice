package _00_SOLID.main;

import _00_SOLID.classes.ConsolePrinter;
import _00_SOLID.classes.ConsoleReader;
import _00_SOLID.classes.ProductCalculator;
import _00_SOLID.classes.SumCalculator;
import _00_SOLID.exceptions.InvalidListException;
import _00_SOLID.interfaces.Computable;
import _00_SOLID.program.Program;

public class Main {
    public static void main(String[] args) throws InvalidListException {
        // vers1
        /*Program program = new Program();
        program.execute();*/

        // vers2
        Program program = new Program(new ConsoleReader(), new ProductCalculator(), new ConsolePrinter());
        program.execute();

        program.setComputable(new SumCalculator());
        program.execute();
    }
}
