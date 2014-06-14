import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMonotonousList {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true,
				MonotonousList.monotonous(Arrays.asList(1, 2, 3, 4, 5, 6)));
		assertEquals(false,
				MonotonousList.monotonous(Arrays.asList(2, 67, 3, 88, 1, 0)));

	}
}
