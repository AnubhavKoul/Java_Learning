package JavaBasics;

import java.util.Scanner;

public class ReverseNumberStringValueOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int number = sc.nextInt();
		StringBuilder s1= new StringBuilder(String.valueOf(number));
		s1=s1.reverse();
		System.out.println("Number after reverse is "+s1);
	}

}
