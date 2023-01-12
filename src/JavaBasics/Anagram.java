package JavaBasics;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "Care";
		String s2 = "Race";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if (s1.length() != s2.length()) {
			System.out.println("The strings are not an anagram 01");
		} else {
			char[] arrS1 = s1.toCharArray();
			char[] arrS2 = s2.toCharArray();
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			System.out.println(Arrays.toString(arrS2));
			System.out.println(Arrays.toString(arrS1));

			if (Arrays.equals(arrS1, arrS2))
				System.out.println("Strings are Anagram");
			else
			System.out.println("Strings are not Anagram");
		}
	}

}
