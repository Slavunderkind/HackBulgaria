import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSortList {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = new ArrayList<Integer>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		actual.add(2);
		actual.add(1);
		actual.add(0);
		actualList = (ArrayList<>) SortList.sort(actual));
		assertTrue (actualList.equals(expected));
	}
	
	
}
