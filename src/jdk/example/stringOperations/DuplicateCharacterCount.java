package jdk.example.stringOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		char[] charArray = input.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		charMap.forEach((k, v) -> System.out.println(k + " is " + charMap.get(k) + " times"));
	}
}
