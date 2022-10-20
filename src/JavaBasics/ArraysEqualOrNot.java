package JavaBasics;

public class ArraysEqualOrNot {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5,6};
		int[] arr2 = new int[] {1,2,3,4,5,6};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		boolean status = true;
		
		if(len1!=len2)
			status = false;
		else
		{
			for(int i=0;i<len1;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					status=false;
				}
				else
				{
					status=true;
				}
			}
		}
		
		if (status==true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}

}
