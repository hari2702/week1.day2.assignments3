package week1.day2.assignments3;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] myArray = str.toCharArray();
		str.length();
		for (int i = 0; i < myArray.length; i++) {
			char b = str.charAt(i);
			if ((b == 'e')) {
				count++;
				System.out.println("CharOccurance in str is" + count + "times");

			} else {
				System.out.println("Total CharOccurance" + count);

			}

		}

	}

}


