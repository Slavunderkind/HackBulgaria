import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReverseList {

	public static List<Integer> reverse (List<Integer> list){
		List<Integer> reverseList = new ArrayList<Integer>(list);
		Collections.reverse(reverseList);
		return reverseList;

		
	}
	
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test);
		System.out.println(reverse(test));
		
		
	}
}

