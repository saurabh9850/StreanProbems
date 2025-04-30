package StreamProblems;

import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();

        System.out.println("Even: " + evenSum);
        System.out.println("Odd : " + oddSum);
    }
}
