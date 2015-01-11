package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {
	public static void main(String[] args) {
		Problems2Impl some = new Problems2Impl();
		System.out.println(some.kthFac(1, 0));
	}

	@Override
	public boolean areAnagrams(String A, String B) {
		boolean result = false;
		if (A.length() == B.length()) {
			for (int i = 0; i < A.length(); i++) {
				for (int j = 0; j < A.length(); j++) {
					if (A.charAt(i) != B.charAt(j)) {
						result = false;
					} else {
						result = true;
					}
				}
				if (result) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean canBalance(int[] array) {
		int elem = 0;
		int leftSum = 0;
		int rightSum = 0;
		while (elem < array.length) {
			for (int i = 0; i < elem; i++) {
				leftSum += array[i];
			}
			for (int j = elem; j < array.length; j++) {
				rightSum += array[j];
			}
			if (leftSum == rightSum) {
				return true;
			}
			leftSum = 0;
			rightSum = 0;

			elem++;
		}

		return false;
	}

	@Override
	public String copyEveryChar(String input, int k) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			int counter = 0;

			while (counter < k) {
				output.append(input.charAt(i));
				counter++;
			}

		}
		return output.toString();
	}

	@Override
	public int countOcurrences(String needle, String haystack) {
		int count = 0;
		int index = 0;
		while (index + 1 < haystack.length() - 1) {
			if (needle.matches(haystack.substring(index,
					(needle.length() + index)))) {
				count++;
				index++;
			}
			index++;
		}
		return count;
	}

	@Override
	public String decodeURL(String input) {
		String output = new String();
		output = input.replaceAll("%20", " ");
		output = output.replaceAll("%3A", ":");
		output = output.replaceAll("%3D", "?");
		output = output.replaceAll("%2F", "/");
		return output;
	}

	@Override
	public long doubleFac(int n) {
		int number = n * (n - 1);
		long result = 1;
		for (int i = number; i > 1; i--) {
			result = result * i;
		}
		return result;
	}

	@Override
	public float getAverage(int[] array) {
		float result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result / array.length;
	}

	@Override
	public long getLargestPalindrome(long N) {
		long result = N;
		while (result > 0) {
			if (isPalindrome((int) result)) {
				return result;
			}
			result--;
		}
		return 0;
	}

	@Override
	public int getOddOccurrence(int[] array) {
		int counter = 1;
		int index = 0;
		int result = 0;
		Arrays.sort(array);
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] == array[i]) {
				counter += 1;

				if (isOdd(counter)) {
					index = i;
				}
			} else {
				counter = 1;
			}

			if ((isOdd(counter))) {
				result = array[index];
			}
		}
		return result;
	}

	@Override
	public int getPalindromeLength(String input) {
		StringBuilder beforeStar = new StringBuilder();
		StringBuilder afterStar = new StringBuilder();
		int starIndex = input.indexOf('*');
		int k = 0;
		int counter = 0;

		for (int i = 0; i < starIndex; i++) {
			beforeStar.append(input.charAt(i));
		}
		for (int j = starIndex + 1; j < input.length(); j++) {
			afterStar.append(input.charAt(j));
		}
		int end = beforeStar.length();
		afterStar.reverse();
		while (k < end) {
			if (beforeStar.charAt(k) == afterStar.charAt(k)) {
				counter++;
			} else {
				counter = 0;
			}
			k++;
		}
		return counter;
	}

	@Override
	public long getSmallestMultiple(int upperBound) {
		long rightNum = 0;
		long num = upperBound;
		boolean ans = true;
		for (int i = upperBound; i >= 1; i--) {
			if (num % i == 0) {
				ans = true;
				rightNum = num;
			} else {
				ans = false;
			}
			num++;
		}
		return rightNum;
	}

	@Override
	public boolean hasAnagramOf(String string, String string2) {
		boolean result = false;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (string.charAt(i) == string2.charAt(j)) {
					result = true;
				}
			}
			if (result) {
				return true;
			}
		}
		return result;
	}

	@Override
	public int[] histogram(short[][] image) {
		int row = image.length;
		int column = image[0].length;
		int[] result = new int[row * column + 1];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				result[image[i][j]]++;
			}
		}
		return result;
	}

	@Override
	public boolean isOdd(int number) {
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isPalindrome(int number) {
		String numbers = "" + number;
		if ((reverseMe(numbers)).equals(numbers)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isPalindrome(String argument) {
		if (argument.compareTo(reverseMe(argument)) == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0 || number == 1) {
				return false;
			}
		}
		return true;
	}

	@Override
	public long kthFac(int k, int n) {
		long result = n;
		if (k == 1) {
			for (int i = 1; i < n; i++) {
				result *= i;
			}
		} else {
			System.out.println("You want too much from me");
		}

		return result;
	}

	@Override
	public int kthMin(int k, int[] array) {
		Arrays.sort(array);
		return array[k - 1];
	}

	@Override
	public long maximalScalarSum(int[] a, int[] b) {
		int size = (int) kthFac(1, a.length);
		int[] sums = new int[size];
		long maximalSum;
		int helper;
		maximalSum = sums[0];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum += a[j] * b[j];
				if (sums[j] > maximalSum) {
					maximalSum = sums[j];
				}
			}
			sums[i] = sum;
			if (i + 1 < a.length) {
				helper = a[i + 1];
				a[i + 1] = a[i];
				a[i] = helper;
			}
		}
		for (int s = 0; s < size; s++) {
		}
		return maximalSum;
	}

	@Override
	public int maxSpan(int[] array) {
		int result = array[0] + array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - i) {
				if (result < (array[i] + array[(array.length - 1) - i])) {
					result = array[i] + array[(array.length - 1) - i];
				}
			}

		}
		return result;
	}

	@Override
	public int min(int... array) {
		int minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (minimum > array[i]) {
				minimum = array[i];
			}

		}
		return minimum;
	}

	@Override
	public long pow(int a, int b) {
		long result = a;
		if (b == 0) {
			result = 1;
		}
		for (int i = 1; i < b; i++) {
			result = result * a;

		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int[][] rescale(int[][] original, int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseEveryWord(String arg) {
		String[] str = arg.split(" ");
		StringBuilder output = new StringBuilder();
		for (int k = 0; k < str.length; k++) {
			output.append(reverseMe(str[k]));
			if (k < str.length - 1) {
				output.append(" ");
			}
		}
		return output.toString();
	}

	@Override
	public String reverseMe(String argument) {
		StringBuilder sb = new StringBuilder();
		for (int i = argument.length() - 1; i >= 0; i--) {
			sb.append(argument.charAt(i));
		}
		return sb.toString();
	}

	@Override
	public int sumOfNumbers(String input) {
		String numbers = input.replaceAll("[a-zA-Z _]+", "");
		int sum = 0;
		String string;
		for (int i = 0; i < numbers.length(); i++) {
			string = "" + numbers.charAt(i);
			sum += Integer.parseInt(string);
		}
		return sum;

	}
}
