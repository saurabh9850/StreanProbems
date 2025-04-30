package StreamProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(12,76,987,65,56);
		
		int min=list.stream()
				.min(Integer::compare)
				.orElseThrow();
		System.out.println(min);
		int max=list.stream()
				.max(Integer::compare)
				.orElseThrow();
		System.out.println(max);
		

	}

}
