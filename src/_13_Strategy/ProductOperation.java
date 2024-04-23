package _13_Strategy;

import java.util.List;

public class ProductOperation implements Operation {
    @Override
    public double doOperation(List<Integer> numbers) {
        double product = 1;
        for(Integer x : numbers) {
            product *= x;
        }
        return product;
    }
}
