package jdk.example.stringOperations;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println("Duplicate character: " + charArray[i]);
				}
			}
		}
	}
}
