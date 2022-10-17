package JavaBasics;
//To count the digits in a number

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int number = 1234567894;
		int count = 0;
		while(number>0)
		{
			number = number/10;
			count++;
		}
		System.out.println(count);

	}

}
