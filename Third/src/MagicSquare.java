import java.util.ArrayList;

public class MagicSquare {
	public static Boolean magic_square(ArrayList<ArrayList<Integer>> matrix) {

		int rows = 0;
		int columbs = 0;
		int rowSum = 0;
		int columbSum = 0;
		int mainDiagonal = 0;
		int backDiagonal = 0;
		int diagonalSum = 0;

		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.size(); j++) {
				rows += matrix.get(i).get(j);
				rowSum += matrix.get(i).get(j);
				columbs += matrix.get(i).get(j);
				columbSum += matrix.get(j).get(i);
				if (i == j) {
					backDiagonal += matrix.get(i).get((matrix.size() - 1) - j);
					mainDiagonal += matrix.get(i).get(j);
				}
			}
			if (rows == rowSum) {
				rows = 0;
			}

		}

		diagonalSum = mainDiagonal + backDiagonal;
		System.out.println(rowSum);
		System.out.println(columbSum);
		System.out.println(mainDiagonal);
		System.out.println(backDiagonal);

		return ((rowSum == columbSum) && (columbSum == diagonalSum) && (diagonalSum == rowSum));
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> columbList = new ArrayList<Integer>();
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
