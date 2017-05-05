package payilagam;

public class Test2Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8; //number of rows of stars needed
		int c=a*2; //count reference for column
		
		for (int j=1;j<=a;j++)
		{			
			for (int i = 1;i<c;i++)
			{
				if ((i==(a-(j-1)) || (i==(a+(j-1))))) //this check will print the outer layer of stars
				{
					System.out.print('*');
				}
				else 
				{
					System.out.print(" ");
				}
				
				if (j-2 > 0) //this check will print the inner layer of stars
				{ 
					for (int k = 1; k<=(j-2); k++)
					{
						if (i == (a-j+(k*2)))
						{
							System.out.print('*');
						}	 	
					}
				}
				
			}
			System.out.println();
		}		
	}
}
