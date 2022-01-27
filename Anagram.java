package week1.day2.assignments3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1 == text2) {
			char[] name1 = text1.toCharArray();
			char[] name2 = text2.toCharArray();
			Arrays.sort(name1);
			Arrays.sort(name2);
			if (Arrays.equals(name1, name2)) {
				System.out.println("string is anagram");

			} else {
				System.out.println("string is anagram");

			}
		}

	}
}
		


