import java.util.ArrayList;

public class MagicSquare {
	public static Boolean magic_square(ArrayList<ArrayList<Integer>> matrix) {

		ArrayList<Integer> columbs = new ArrayList<Integer>();
		ArrayList<Integer> columbSum = new ArrayList<Integer>();
		ArrayList<Integer> rowSum = new ArrayList<Integer>();
		int mainDiagonal = 0;
		int backDiagonal = 0;
		boolean result = false;
		boolean rowIsEqualsToColumb = false;
		boolean equalDiagonals = false;
		for (int i = 0; i < matrix.size(); i++) {
			int rows = 0;
			int sum = 0;
			int counter = 0;
			columbSum.clear();
			for (int j = 0; j < matrix.size(); j++) {
				rows += matrix.get(i).get(j);
				columbSum.add(counter, matrix.get(i).get(j));
				counter++;

				if (i == j) {
					backDiagonal += matrix.get(i).get((matrix.size() - 1) - j);
					mainDiagonal += matrix.get(i).get(j);
				}

			}
			rowSum.add(i, rows);
			for (int k = 0; k < matrix.size(); k++) {
				sum += columbSum.get(k);
			}
			columbs.add(i, sum);

		}
		for (int p = 0; p < matrix.size(); p++) {
			if (columbs.get(p) == rowSum.get(p)) {
				rowIsEqualsToColumb = true;
			}

		}
		if (mainDiagonal == backDiagonal) {
			equalDiagonals = true;
		}
		if ((equalDiagonals) && (rowIsEqualsToColumb)
				&& (mainDiagonal == rowSum.get(0))) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		a.add(4);
		a.add(9);
		a.add(2);
		b.add(3);
		b.add(5);
		b.add(7);
		c.add(8);
		c.add(1);
		c.add(6);
		m.add(a);
		m.add(b);
		m.add(c);
		System.out.println(magic_square(m));

	}

}
