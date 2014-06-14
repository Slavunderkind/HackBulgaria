import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonotonousList {
	public static boolean monotonous(List<Integer> list) {
		return SortList.sort(list).equals(list)
				|| ReverseList.reverse(SortList.sort(list)).equals(list);

	}

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 8));
		boolean result = true;
		System.out.println(MonotonousList.monotonous(test));
		System.out.println(result);
	}
}
