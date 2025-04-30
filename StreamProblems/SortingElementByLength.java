package StreamProblems;
import java.util.*;
import java.util.stream.Collectors;

public class SortingElementByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,767,98654,88776,9876);
		List<Integer> l=list.stream()
				        .sorted(Comparator.comparingInt(num-> String.valueOf(num).length()))
				        .collect(Collectors.toList());
		System.out.println(l);
				

	}

}
