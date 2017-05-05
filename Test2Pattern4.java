package payilagam;

public class Test2Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =7; //the max number to be displayed in the row
		int c=a*2;
		
		//Printing the ascending order triangle of values (decreasing numbers)
		for (int j=1; j <=a; j++)
		{
			int k = j;
			for (int l = 1;l<=j;l++)
				{
					System.out.print(" ");
				}
			for (int i = 1; i<c; i++)
			{
				if (i == 1 || i%2 != 0)
				   {
					if (k <= a)
					{
						System.out.print(k + " ");
						k++;	
					}
				}
			}	
			System.out.println();
		}

		//Printing the descending order of triangle of values (increasing numbers)
		for (int j=(a-1);j>=1;j--)
		{
			int k=j;
			for (int l=j;l>=1;l--)
			{
				System.out.print(" ");
			}
			for (int i=(c-1);i>=1;i--)
			{
				if (i == 1 || i%2 != 0)
				   {
					if (k <= a)
					{
						System.out.print(k + " ");
						k++;	
					}
				   }
			}	
			System.out.println();
			}
				
		

	}
}
