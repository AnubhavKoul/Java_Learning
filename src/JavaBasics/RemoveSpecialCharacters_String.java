package JavaBasics;

public class RemoveSpecialCharacters_String {

	public static void main(String[] args) {
		String a = "This is a string %$^%$%@%$#&^^(*&*)&(^*& *%&^%&^$^%%$#$@! with special characters";
		
		a = a.replaceAll("[^a-zA-Z0-9]", "");//To remove everything other than a-zA-Z0-9.
		
		System.out.println(a);

	}

}
