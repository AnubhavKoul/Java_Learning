package JavaBasics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease eneter String to reverse");
		String originalString = sc.nextLine();
		String s2 = "";
		char[] newString = originalString.toCharArray();
		for (int i = newString.length - 1; i >= 0; i--) {
			s2 = s2 + newString[i];
		}
		if (originalString.equals(s2)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		//System.out.println(s2);

	}

}
