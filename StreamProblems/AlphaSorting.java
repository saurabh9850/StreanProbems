package StreamProblems;

import java.util.Arrays;
import java.util.List;

public class AlphaSorting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("saurabh", "sarvesh", "chetan", "dinesh");

      
        words.stream().sorted().forEach(System.out::println);
             
            

        words.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
             
             
    }
}

