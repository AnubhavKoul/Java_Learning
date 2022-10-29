package JavaBasics;
//To count the occurrence of a character in a string.
public class CountOccurrencesOfCharacter_String {

	public static void main(String[] args) {
		String Str = "anubhav Koul dot com is a website with great content try it out anubhavkoul.com";
		
		int countFullString = Str.length();
		
		Str = Str.replace("a", "");
		
		int countAlteredString = Str.length();
		
		int charCount = countFullString - countAlteredString;
		
		System.out.println(charCount);

	}

}
