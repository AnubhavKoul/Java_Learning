package JavaBasics;

/* Remove duplicate character in a string using chars() stream */

public class RemoveDuplicateCharacter_Streamchars {

	public static void main(String[] args) {
		
		String str = "This is a new world Anubhav";

		StringBuilder uniqueString = new StringBuilder();

		str.chars().distinct().forEach(s -> uniqueString.append((char) s));
		System.out.println(uniqueString);

	}

}
