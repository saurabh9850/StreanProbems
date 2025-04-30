package StreamProblems;
import java.util.*;
import java.util.stream.Collectors;

public class SortingList {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			int a=i*i;
			list.add(a);
		}
		List<Integer> z=list.stream()
				.limit(2)
				.collect(Collectors.toList());
		System.out.println(z);
				

	}

}
