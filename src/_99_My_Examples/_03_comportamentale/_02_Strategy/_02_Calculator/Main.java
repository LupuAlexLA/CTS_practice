package _99_My_Examples._03_comportamentale._02_Strategy._02_Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation operation = new Sum();
        calculator.setOperation(operation);
        List<Integer> numbers = List.of(1, 2, 3, 4);
        try {
            calculator.compute(numbers);
        } catch (OperationNotSetEx e) {
            throw new RuntimeException(e);
        }

        operation = new Product();
        calculator.setOperation(operation);
        try {
            calculator.compute(numbers);
        } catch (OperationNotSetEx e) {
            throw new RuntimeException(e);
        }
    }
}
