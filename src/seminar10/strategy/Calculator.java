package seminar10.strategy;

import java.util.List;

public class Calculator {
    private Operation operation;

    // fac ctor injecection cand depend e obligatorie
    // injectare prin setter (setter injection):
        // 1. dependenta nu e obligatorie
        // 2. cand depend se poate schimba pe timpul de durata de viata a obiectului
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double compute(Integer... values) throws OperationNotSetException { // in spate values e un array
        List<Integer> list = List.of(values); // s-a transformat din array in lista
        if(this.operation != null) {
            return this.operation.doOperation(list);
        }
        else {
            throw new OperationNotSetException();
        }
    }
}
