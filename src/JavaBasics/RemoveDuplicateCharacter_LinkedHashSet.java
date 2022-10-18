package JavaBasics;

import java.util.LinkedHashSet;
import java.util.Set;

//To remove duplicated char in the string using Set(LinkedHashSet)
public class RemoveDuplicateCharacter_LinkedHashSet {

	public static void main(String[] args) {
		String S1 = "This is the most J beautiful part of my Jorney"; 
        Set<Character> s2 = new LinkedHashSet();
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = S1.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            s2.add(arr[i]);
        }
        for (char c : s2)
        {
            sb.append(c);
        }
        System.out.println(sb);

	}

}
