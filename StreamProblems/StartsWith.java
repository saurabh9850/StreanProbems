package StreamProblems;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aplication", "ball", "all", "cat");

        long count = words.stream().filter(word -> word.startsWith("a")).count();
                
                          

        System.out.println (count);
    }
}
