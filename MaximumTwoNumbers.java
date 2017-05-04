package payilagam;

import java.lang.reflect.Array;

public class MaximumTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max1=0, max2=0;
		int [] NumberArray = {1,100,1001,2,3,4,98,100,5,6,7,8,9,100}; //Array from which the maximum two numbers are verified
		
		for (int i=0;i<Array.getLength(NumberArray);i++)
		{
			if (NumberArray[i]>max1) //The array element is compared with highest number
			{
				max2=max1; //The maximum value is moved to the second maximum variable once above condition is met
				max1=NumberArray[i]; //Array element is assigned to the maximum variable  				
			}
			else if (NumberArray[i]>max2)
			{
				max2=NumberArray[i]; //The array element is assigned to the second maximum variable once above condition is met
			}
		}
		System.out.println("The top two maximum numbers in the array are " + max1 + " and " + max2 + " respectively");
	}
}
