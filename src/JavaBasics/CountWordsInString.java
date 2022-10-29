package JavaBasics;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "anubhav koul is my name.";
		int count = 0;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("The total number of words in string are "+count);

	}

}
/*Output:
 * The total number of words in string are 4
 * */