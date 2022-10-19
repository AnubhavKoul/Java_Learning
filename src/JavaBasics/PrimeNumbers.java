package JavaBasics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number to check if prime or not: ");
		int num = sc.nextInt();
		int count = 0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if (num%i==0)
				{
					++count;
				}
			}
		}
		if(count==2)
		{
			System.out.println("Number is a Prime Number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}

	}

}
