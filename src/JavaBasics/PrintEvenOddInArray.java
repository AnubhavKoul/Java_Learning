package JavaBasics;

public class PrintEvenOddInArray {

	public static void main(String[] args) {
		
		int[] num = new int[]{2,4,6,2,3,4,6,67,76,5,3};
		for (int val:num)
		{
			if(val%2==0)
				System.out.println(val +" is Even \n");
			else
				System.out.println(val +" is Odd \n");
		}

	}

}
