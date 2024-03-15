package _00_SOLID.classes;

import _00_SOLID.exceptions.InvalidListException;
import _00_SOLID.interfaces.Computable;

import java.util.List;

public class SumCalculator implements Computable {
    @Override
    public double computeResult(List<Integer> list) throws InvalidListException {
        double sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}
