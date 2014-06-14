import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,1,2));
		List<Integer> actual = new ArrayList<Integer>(Arrays.asList(2,1,0));
		actualList = (ArrayList<>) SortList.sort(actual));
		assertTrue (actualList.equals(expected));
	}
	@Test
	public void isTheSameSize(){
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(5,5,2));
		List<Integer> actual = new ArrayList<Integer>(Arrays.asList(2,5,5));
		actualList = (ArrayList<>) SortList.sort(actual));
		assertTrue (actualList.size().equals(expected.size()));
		
	}
}
