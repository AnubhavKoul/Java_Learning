package JavaBasics;

public class RemoveWhiteSpaces_String {

	public static void main(String[] args) {
		String a = "yeh  hai  mumbai    meri   jaan";
		a= a.replaceAll("\\s", "");
		System.out.println(a);
	}

}
