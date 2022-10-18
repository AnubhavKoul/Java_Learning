package JavaBasics;
//To Count Even and Odd numbers in a number
import java.util.Scanner;

public class CountEvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number\n");
		int number = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int temp=0;
		while(number>0)
		{
			temp = number%10;
			if(temp % 2==0)
			{
				evenCount++;
			}
			else
				oddCount++;
			number = number/10;
		}
		
		/*
		 * System.out.println(evenCount); System.out.println(oddCount);
		 */
		System.out.println(String.format("Even count is :%d, Odd Count is :%d", evenCount,oddCount));

	}

}
