import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class GoldbachConjecture {
	public static Boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static ArrayList<ArrayList<Integer>> goldbach(int number) {
		LinkedList<Integer> primeNumbers = new LinkedList<Integer>();
		for (int i = 2; i < number; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		System.out.println(primeNumbers.size());
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int j = 0; j < primeNumbers.size(); j++) {
			for (int k = j; k < primeNumbers.size(); k++) {
				if ((primeNumbers.get(j) + primeNumbers.get(k)) == number) {
					ArrayList<Integer> temporary = new ArrayList<Integer>();
					temporary.add(primeNumbers.get(j));
					temporary.add(primeNumbers.get(k));

					result.add(temporary);
				}

			}

		}
		return result;

	}

	public static void main(String[] args) {

		System.out.println(goldbach(10));
		System.out.println(goldbach(500));
	}

}
