package StreamProblems;

import java.util.Arrays;

public class ArraySortingByStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,45,39,76,98};
		
		int b[]=Arrays.stream(a)
				.sorted()
				.toArray();
	            
		System.out.println(Arrays.toString(b));
				

	}

}
