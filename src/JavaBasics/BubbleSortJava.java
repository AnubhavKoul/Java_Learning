package JavaBasics;

import java.util.*;

public class BubbleSortJava {

	public static void main(String[] args) {
		int[] arr = new int[] {5,2,4,1,4,3,6,8,9,7};
		
		System.out.println("Before Bubble SOrt"+Arrays.toString(arr));
		
		/*To sort the array using bubble sort. Sorting is done on a couple of elements as a bubble */
		int size = arr.length;
		for (int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Bubble Sort"+Arrays.toString(arr));

	}

}
