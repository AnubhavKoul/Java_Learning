package JavaBasics;
//To remove duplicated char in the string using array element comparison.
//capital letters and normal letters are considered different.
public class RemoveDuplicateCharacter_ArrayElementComparison {

	public static void main(String[] args) {
		String original = "This is the most beautiful part of my journey";
		char[] ch = original.toCharArray();
		//StringBuilder newString = new StringBuilder(); use either string builder or normal string.
		String s2 = new String();
		for (int index = 0; index<ch.length; index++)
		{
			boolean duplicate = false;
			for (int index2 = index+1; index2<ch.length; index2++)
			{
				if(ch[index]==ch[index2])
					duplicate = true;
			}
			if(!duplicate)
			{
				//newString.append(ch[index]);
				s2 = s2+ch[index];
			}
		}
		//System.out.println(newString);
		System.out.println(s2);

	}

}
