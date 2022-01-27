package week1.day2.assignments3;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		char[] myArray=str.toCharArray();
		for (int i = myArray.length- 1; i >= 0; i--)
		{
			reverse +=str.charAt(i);
		
		}
		if (str.equals(reverse)) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");

		}
	}

}
