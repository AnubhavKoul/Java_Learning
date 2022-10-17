import java.util.Random;
/* Sorting an Array by comparing the previous elements. */
public class ArraySort_Rev {
	public static void main(String[] args) {
		//Random rand = new Random();
		int[] arr = { 2, 3, 4, 5, 7, 6, 4, 1, 7, 3, 5, 2 };

		System.out.println("---------");
		for (int i = 1; i < arr.length; i++) {
			int currentValue = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > currentValue) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentValue;
		}
		for (int element : arr)
			System.out.println(element);

	}

}
