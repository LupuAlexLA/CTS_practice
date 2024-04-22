package seminar10.strategy;

import java.util.List;

public class SumOperation implements Operation {
    @Override
    public double doOperation(List<Integer> numbers) {

//        int sum = 0;
//        for(Integer x : numbers) {
//            sum += x;
//        }
//        return sum;

        // varianta cu stream
        return numbers.stream().mapToInt(x -> x).sum(); // x -> x pt ca din Integer in int se face automat
    }
}
