package payilagam;

public class PrimeNumberVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, i, c=0; //Declaration. Variable 'c' is used as counter for status in future if condition
		a=997; //Initialization. Enter the number to be checked in this line
		
		for (i=2;i<a;i++)
		{
			/* For Prime numbers, the reminder in division will not be zero when quotient is 
			 * any number apart from one or the number it self */
			if (a%i == 0)  
			{
				c=1; //This counter is set to 1 to denote it is a prime number
			}	
		}
		
		if (c == 1)
		{
			System.out.println("The number you entered was " + a + ". It is a composite number");	
		}
		else 
		{
			System.out.println("The number you entered was " + a + ". It is a prime number");
		}
	}
}
