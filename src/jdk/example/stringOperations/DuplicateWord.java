package jdk.example.stringOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWord {
	public static void main(String[] args) {
		System.out.println("Enter any String");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] dupWord = input.split(" ");

		Map<String, String> wordMap = new HashMap<>();
		for (String word : dupWord) {
			word.toUpperCase();
			if (wordMap.get(word) != null) {
				System.out.println("Duplicate word: " + word);
			} else {
				wordMap.put(word, word);
			}
		}
		wordMap.forEach((k, v) -> System.out.print(v + " "));
	}
}
