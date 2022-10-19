package JavaBasics;
//largest of three using ternary operators.
import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the First Number\n");
		int num1 = sc.nextInt();
		System.out.println("Please Enter the Second Number\n");
		int num2 = sc.nextInt();
		System.out.println("Please Enter the Third Number\n");
		int num3 = sc.nextInt();
		
		int result = num3>(num1>num2? num1:num2)?num3:(num1>num2? num1:num2);
		System.out.println("The largest number is :"+result);
		

	}

}
