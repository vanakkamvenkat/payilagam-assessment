package payilagam;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1;
		int facnumber = 4; //The number whose factorial is going to be calculated
		
		for (int num = facnumber;num>0;num--)
		{
			result = result * num;
		}
		
		System.out.println("The result of " + facnumber + "! is " + result);
	}

}
