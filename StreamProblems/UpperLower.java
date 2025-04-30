package StreamProblems;

import java.util.Arrays;
import java.util.List;

public class UpperLower {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("saurabh", "chavan", "ajay");

        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
