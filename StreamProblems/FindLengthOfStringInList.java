package StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLengthOfStringInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Saurabh","Chavan","AdityaNarayan","StringsOfJava");
     List<Integer> l=list.stream()
    		    .map(String::length)
    		    .collect(Collectors.toList());
     System.out.println(l);
    		 
    		 
	}

}
