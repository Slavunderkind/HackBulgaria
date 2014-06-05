import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class TimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		@SuppressWarnings("deprecation")
		Date today = new Date("Jun 5 2044, 22:00:34");
		Time time = new Time(today);
		String expected = "10:00:34 05.06.44";
		assertTrue(expected.equals(time.toString()));

	}

}
