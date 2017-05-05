package payilagam;

public class Test2Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20; //customising the pattern by using this variable
		
		for (int i=1;i<=a;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j + " "); //Using just 'print' instead of println to cursor in same line while printing
			}
			System.out.println();
		}
		
		for (int i=(a-1);i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
