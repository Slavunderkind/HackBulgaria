import java.util.LinkedList;

public class GoldbachConjecture {
	public static Boolean IsPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static LinkedList<Integer> goldbach(int number) {
		LinkedList<Integer> primeNumbers = new LinkedList<Integer>();
		for (int i = 2; i < number; i++) {
			if (IsPrime(i)) {
				primeNumbers.add(i);
			}
		}
		System.out.println(primeNumbers.size());

		for (int j = 0; j < primeNumbers.size(); j++) {
			for (int k = 0; k < primeNumbers.size(); k++) {
				if ((primeNumbers.get(j) + primeNumbers.get(k)) == number) {

				}

			}
			if ((primeNumbers.get(j) + primeNumbers.get(j + 1)) == number)
				;

		}
		return primeNumbers;

	}

	public static void main(String[] args) {

		System.out.println(goldbach(6));
	}

}
