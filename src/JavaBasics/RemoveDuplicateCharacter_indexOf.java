package JavaBasics;

//To remove duplicated char in the string using indexOf() string method

public class RemoveDuplicateCharacter_indexOf {
	public static void main(String[] args) {
		
		String mixed = new String("This is Mumbai meri jaan");
		
		StringBuilder uniqueString = new StringBuilder();
		
		for (int index = 0; index < mixed.length(); index++) {
			
			char ch = mixed.charAt(index);
			int strInd = mixed.indexOf(ch, index + 1);
			if (strInd == -1) {
				uniqueString.append(ch);
				
			}
		}
		System.out.println("String that is unique: " + uniqueString);
	}

}
