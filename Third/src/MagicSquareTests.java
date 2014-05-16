import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MagicSquareTests {

	@Test
	public void noMatrix() {
		boolean expected = false;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		Boolean actual = new Boolean(MagicSquare.magic_square(matrix));
		expected = actual;

	}

}
