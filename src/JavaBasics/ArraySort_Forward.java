package JavaBasics;
/* sorting an array by checking forward elements */
public class ArraySort_Forward {

	public static void main(String[] args) {
		int[] arr = {9,39,4,2,6,7,5,3};
        int temp=0;
        for (int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }		
	}

}
