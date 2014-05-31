package com.hackbulgaria.corejava;


public class FaultyProblem4 {
	public static boolean areEqual(Integer e, Integer k) {
		return e.equals(k);
	}

	public static boolean areEqual(float a, float b) {
		int check = Float.compare(a, b);
		if (check == 0) {
			return true;
		} else { 
			return false;
		}
	}

	public static boolean haveEqualSubstrings(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			String substringA = a.substring(i, a.length() - 1);
			String substringB = b.substring(i, a.length() - 1);
			if (substringA.equals(substringB)) {
				return true;
			}
		}
		return false;
	}
}
