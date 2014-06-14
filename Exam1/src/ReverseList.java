import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static List<Integer> reverse(List<Integer> list) {
		List<Integer> reverseList = new ArrayList<Integer>(list);
		Collections.reverse(reverseList);
		return reverseList;

	}

}
