package com.hackbulgaria.corejava;

public class FaultyProblem3 {

	public String reverseEveryWordInString(String sentence) {
		String[] words = sentence.split(" ");
		String finalString = "";
		int i = 0;
		for (String word : words) {

			finalString += words[i].replace(word, reverse(word)) + " ";
			i++;
		}
		String finalSentence = "";
		finalSentence = finalString.substring(0, finalString.length() - 1);
		return finalSentence;
	}

	private CharSequence reverse(String word) {
		return Utils.reverseMe(word);
	}
}
