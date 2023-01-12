package JavaBasics;

/* Output:
    *
   ***
  *****
 *******
 */

public class StarPattern3_Pyramid {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++)
		{
			for (int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
