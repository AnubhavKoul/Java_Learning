package JavaBasics;
import java.util.*;

public class SumOfDigitsinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number: \n");
		int num = sc.nextInt();
		int sum = 0;
		while (num>0) {
			sum = sum+num%10;
			num=num/10;		
		}
		System.out.println(String.format("The Sum of digits of number is %d : ", sum));
	}

}
