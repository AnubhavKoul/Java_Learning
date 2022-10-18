package JavaBasics;

public class ReverseString {

	public static void main(String[] args) {
		String originalString = "Hello Sir";
		String rev = "" ;
		for (int i=originalString.length()-1;i>=0;i--)
		{
			rev=rev+originalString.charAt(i);
		}
		System.out.println("Original String is \n"+originalString);
		System.out.println("Reversed String is \n"+rev);
	}
}
