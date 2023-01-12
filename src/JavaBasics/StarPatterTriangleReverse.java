package JavaBasics;
/*output: 
***
**
*
*/

public class StarPatterTriangleReverse {

	public static void main(String[] args) {
		for (int i=0;i<=2;i++)
		{
			for(int j =2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
