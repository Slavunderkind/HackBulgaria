import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static List<Integer> sort(List<Integer> list) {
		List<Integer> sortList = new ArrayList<Integer>(list);
		Collections.sort(sortList);
		return sortList;
	}

}
