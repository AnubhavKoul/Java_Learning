package JavaBasics;

/*To find the duplicate element in the array either by using array traverse or
by using hash set, add elements in hashset using hashset.add and only unique elements will be added.*/
public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		String[] st = { "Anubhav", "Pooja", "Sumegha", "Anubhav" };
		boolean duplicate = false;
		for (int index = 0; index < st.length; index++) {
			for (int jindex = index + 1; jindex < st.length; jindex++) {
				if (st[index] == st[jindex]) {
					System.out.println("The duplicate element is " + st[index]);
					duplicate = true;
				}
			}
		}
		if (duplicate == false)
			System.out.println("There are no duplicate elements found in the array");
	}

}
