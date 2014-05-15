import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GoldBachTests {

	@Test
	public void numberIsNull() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> actual = new ArrayList<ArrayList<Integer>>(
				GoldbachConjecture.goldbach(0));
		if (actual.equals(expected))
			;
	}

	@Test
	public void numberIsOne() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> actual = new ArrayList<ArrayList<Integer>>(
				GoldbachConjecture.goldbach(1));
		if (actual.equals(expected))
			;

	}

	@Test
	public void numberIsTen() {
		ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> current = new ArrayList<Integer>();
		current.add(3);
		current.add(7);
		expected.add(current);
		ArrayList<Integer> second = new ArrayList<Integer>();
		second.add(5);
		second.add(5);
		expected.add(second);
		ArrayList<ArrayList<Integer>> actual = new ArrayList<ArrayList<Integer>>();
		actual = GoldbachConjecture.goldbach(10);
		if (expected.equals(actual))
			;

	}

	@Test
	public void primeNumber() {

		if (GoldbachConjecture.isPrime(13))
			;
		if (GoldbachConjecture.isPrime(100))
			;

	}

}
