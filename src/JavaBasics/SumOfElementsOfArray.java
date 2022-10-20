package JavaBasics;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int[] num = {2,3,4,5,6,7,8,9,1};
		int numlen = num.length;
		int sum = 0;
		/*
		 * for (int i=0;i<numlen;i++) //you can also use enhanced for loop. {
		 * sum=sum+num[i]; }
		 * 
		 * System.out.println(sum);
		 */
		
		for(int val : num)
			sum=sum+val;
		System.err.println(sum);

	}

}
