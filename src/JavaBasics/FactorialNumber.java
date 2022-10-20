package JavaBasics;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial can be found in 2 ways, 1 to the number loop. 2nd is number to the 1 loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to find factorial: ");
		int num = sc.nextInt();
		
		long fact = 1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		
		System.out.println("Factorial of the number you enterd is : "+ fact);
	}

}
