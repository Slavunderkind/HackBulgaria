import static org.junit.Assert.*;
import org.junit.Test;

public class PathTests {

	@Test
	public void manySlashes() {
		String actual = new String(Path.reduce_file_path("//////////////"));
		String expected = new String("/");
		assertEquals(expected, actual);
	}

	@Test
	public void onlyOneSlash() {
		String actual = new String(Path.reduce_file_path("/"));
		String expected = new String("/");
		assertEquals(expected, actual);

	}

	@Test
	public void emptyList() {
		String actual = Path.reduce_file_path("");
		String expected = "";
		assertEquals(expected, actual);

	}

	@Test
	public void addAllPathWithoutLastSlash() {
		String actual = new String(Path.reduce_file_path("/path/slav/"));
		String expected = new String("/path/slav");
		assertEquals(expected, actual);

	}

	@Test
	public void removeSlashes() {
		String actual = new String(
				Path.reduce_file_path("/path/bla//////bla////bla/slav////////"));
		String expected = new String("/path/bla/bla/bla/slav");
		assertEquals(expected, actual);

	}

	@Test
	public void oneDirectoryBack() {
		String actual = new String(
				Path.reduce_file_path("/home/Pictures/MyPictures/../"));
		String expected = new String("/home/Pictures");
		assertEquals(expected, actual);

	}

	@Test
	public void sameDirectory() {
		String actual = new String(Path.reduce_file_path("/home/Pictures/././"));
		String expected = new String("/home/Pictures");
		assertEquals(expected, actual);

	}

	@Test
	public void missingSlashError() {
		String path = new String(Path.reduce_file_path("bla/bla"));
		String firstSymbol = "";
		firstSymbol = String.valueOf(path.charAt(0));
		if (firstSymbol != "/") {
			assert (true);
			System.out.println("ERROR! WRONG INPUT");
		} else
			assert (false);

	}

}
