import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	

	public static List<Integer> sort(List<Integer> list) {
		List<Integer> justList = new ArrayList<Integer>(list);
		List<Integer> sortList = new ArrayList<Integer>(list);
		for (int i = 0; i < list.size(); i++) {
			sortList.add(justList.get(i));
		}
		Collections.sort(sortList);
		return sortList;
	}

	
}
