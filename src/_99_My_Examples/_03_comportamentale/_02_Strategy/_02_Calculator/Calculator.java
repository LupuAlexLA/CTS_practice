package _99_My_Examples._03_comportamentale._02_Strategy._02_Calculator;

import java.util.List;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void compute(List<Integer> numbers) throws OperationNotSetEx {
        if (operation != null){
            operation.doOperation(numbers);
        }
        else {
            throw new OperationNotSetEx();
        }
    }
}
