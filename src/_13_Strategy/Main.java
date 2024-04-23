package _13_Strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation operation = new SumOperation();
        calculator.setOperation(operation);
        try {
            System.out.println(calculator.compute(1, 2, 3, 4, 5));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }

        operation = new ProductOperation();
        calculator.setOperation(operation);
        try {
            System.out.println(calculator.compute(1, 2, 3, 4, 5));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }

        // orice clasa care acc ca param o metoda lambda e de fapt o implementare de strategy
        calculator.setOperation(l -> {
            double result = l.get(0);
            for(int i = 1; i < l.size(); i++)
                result = Math.pow(result, l.get(i));
            return result;
        });
        try {
            System.out.println(calculator.compute(2, 3, 4));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
