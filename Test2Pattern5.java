package payilagam;

public class Test2Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6; //This is the number of columns of number needed
		
		for (int i=0;i<=a;i++)
		{
			for (int j=0;j<=a;j++)
			{
				if (i == j)
				{
					System.out.print(i);	
				}
				else 
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
