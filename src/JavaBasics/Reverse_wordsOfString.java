package JavaBasics;

import java.util.Arrays;

public class Reverse_wordsOfString {

	public static void main(String[] args) {
		String s = "My Name is Anubhav. Website is anubhavkoul.com";
		String[] sa = s.split("\\s");
		System.out.println(Arrays.toString(sa));//to print array directly.
		
		String reverseString="";
		for(String ss:sa)
		{
			String reverseWord = "";
			for(int i=ss.length()-1;i>=0;i--)
			{
				reverseWord = reverseWord+ ss.charAt(i);
			}
			
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println("The Reverse words in a string "+reverseString);

	}

}
