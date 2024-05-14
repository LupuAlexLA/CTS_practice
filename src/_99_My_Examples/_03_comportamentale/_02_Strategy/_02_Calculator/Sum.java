package _99_My_Examples._03_comportamentale._02_Strategy._02_Calculator;

import java.util.List;

public class Sum implements Operation {
    @Override
    public void doOperation(List<Integer> numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
