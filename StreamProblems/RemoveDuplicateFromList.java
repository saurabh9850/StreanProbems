package StreamProblems;
import java.util.*;
public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(23,65,78,65,89,87,23);
		List<Integer> l=list.stream().
				  distinct().toList();
		System.out.println(l);
				        
				

	}

}
