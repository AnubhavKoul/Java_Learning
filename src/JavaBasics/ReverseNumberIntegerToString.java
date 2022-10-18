package JavaBasics;

import java.util.Scanner;

public class ReverseNumberIntegerToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int number = sc.nextInt();
		StringBuilder s1 = new StringBuilder(Integer.toString(number));
		s1 = s1.reverse();
		System.out.println("Reversed number is \n" + s1);
	}
}
