public class Pair {
	Object a;
	Object b;

	public Pair(Object a, Object b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Pair) {
			Pair oth = (Pair) other;
			return oth.a.equals(a) && oth.b.equals(b);

		}

		return false;

	}

	public static void main(String[] args) {
		Pair first = new Pair(55.3, 69);
		Pair second = new Pair(53, 69);
		Boolean result;
		result = first.equals(second);
		System.out.println(result);

	}
}