import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestReverseList {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> expected = new ArrayList<>(Arrays.asList(3, 2, 1));
		actual = (ArrayList<Integer>) ReverseList.reverse(actual);
		assertTrue(actual.equals(expected));

	}

	@Test
	public void falseTest() {
		List<Integer> actual = new ArrayList<>(Arrays.asList(55, 33, 44));
		List<Integer> expected = new ArrayList<>(Arrays.asList(22, 55, 44));
		actual = (ArrayList<Integer>) ReverseList.reverse(actual);
		assertFalse(actual.equals(expected));
	}

	@Test
	public void compareToNullList() {
		List<Integer> actual = new ArrayList<>(
				Arrays.asList(2, 7, 33, 6, 0, 69));
		List<Integer> emptyList = new ArrayList<>();
		actual = (ArrayList<Integer>) ReverseList.reverse(actual);
		assertFalse(actual.equals(emptyList));

	}

}
