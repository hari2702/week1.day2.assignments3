package week1.day2.assignments3;

import java.util.Iterator;

public class FindTypes {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < test.length(); i++) {
			char[] ch = test.toCharArray();
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;

			} else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}
}

			
		



