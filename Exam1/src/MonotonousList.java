import java.util.List;

public class MonotonousList {
	public static boolean monotonous(List<Integer> list) {
		return SortList.sort(list).equals(list)
				|| ReverseList.reverse(SortList.sort(list)).equals(list);

	}


}
