package JavaBasics;

import java.util.*;

//To print fibonacci series 
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of fibonacci series you want to print: ");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print("Fibonacci Series is as below: \n"+n1+" "+n2);
		for (int i=2;i<n;i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		

	}

}
