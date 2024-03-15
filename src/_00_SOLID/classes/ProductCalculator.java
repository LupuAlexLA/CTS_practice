package _00_SOLID.classes;

import _00_SOLID.exceptions.InvalidListException;
import _00_SOLID.interfaces.Computable;

import java.util.List;

public class ProductCalculator implements Computable {
    @Override
    public double computeResult(List<Integer> list) throws InvalidListException {
        double product = 1;
        for(int i : list) {
            product *= i;
        }
        return product;
    }
}
