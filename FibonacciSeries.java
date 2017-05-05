package payilagam;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int a =500;//The last number in fibonacci series to be displayed
		
		System.out.println("The fibonacci series upto the number " + a + " is as displayed below");
		System.out.println(0);
		
		for (int j=1;j<=a;j=k+j )
		{
			System.out.println(j);
			k=k+j;
			if (k<=a)
			{
				System.out.println(k);	
			}
						
		}
		
	}

}
