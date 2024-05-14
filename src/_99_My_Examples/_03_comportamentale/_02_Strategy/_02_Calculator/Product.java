package _99_My_Examples._03_comportamentale._02_Strategy._02_Calculator;

import java.util.List;

public class Product implements Operation {
    @Override
    public void doOperation(List<Integer> numbers) {
        int product = 1;
        for (Integer i : numbers) {
            product *= i;
        }
        System.out.println(product);
    }
}
