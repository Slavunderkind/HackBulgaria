import java.util.ArrayList;

import org.junit.Test;

public class MagicSquareTests {

	@Test
	public void noMatrix() {
		boolean expected = false;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		Boolean actual = new Boolean(MagicSquare.magic_square(matrix));
		if (expected == actual) {
			assert (true);
		} else
			assert (false);

	}

	@Test
	public void onesMatrix() {
		boolean expected = false;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(1);
		a.add(0);
		a.add(0);
		b.add(0);
		b.add(1);
		b.add(0);
		c.add(0);
		c.add(0);
		c.add(1);
		matrix.add(a);
		matrix.add(b);
		matrix.add(c);
		Boolean actual = new Boolean(MagicSquare.magic_square(matrix));
		if (expected == actual) {
			assert (true);
		} else
			assert (false);

	}

	@Test
	public void mustBeFalse() {
		boolean expected = false;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(3);
		a.add(6);
		a.add(6);
		b.add(0);
		b.add(1);
		b.add(2);
		c.add(8);
		c.add(5);
		c.add(1);
		matrix.add(a);
		matrix.add(b);
		matrix.add(c);
		Boolean actual = new Boolean(MagicSquare.magic_square(matrix));
		if (expected == actual) {
			assert (true);
		}
		assert (false);

	}

	@Test
	public void mustBeTrue() {
		boolean expected = true;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(23);
		a.add(28);
		a.add(21);
		b.add(22);
		b.add(24);
		b.add(26);
		c.add(27);
		c.add(20);
		c.add(25);
		matrix.add(a);
		matrix.add(b);
		matrix.add(c);
		Boolean actual = new Boolean(MagicSquare.magic_square(matrix));
		if (expected == actual) {
			assert (true);
		} else
			assert (false);
	}

}
