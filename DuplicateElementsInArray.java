package payilagam;

import java.lang.reflect.Array;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] base = {'a','a','b','b','c','d','d'};
		char [] result = {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0' };
		
		// Using the below for loop, all the duplicate elements are captured in the array result
		for (int i=0;i<Array.getLength(base);i++)
		{
			for (int j=0;j<Array.getLength(base);j++)
			{
				if (base[i] == base[j] && i != j)
				{
					result [i] = base [j];
				}	
			}
		}
		
		//Using this array the duplicate elements with the array result, which are present more than once are removed 
		for (int i=0;i<Array.getLength(result);i++)
		{
			for (int j=0;j<Array.getLength(result);j++)
			{
				if (result[i]==result[j] && i != j)
				{
					result[j]='0';
				}
			}
			
		}
		
		//Final output is displayed to the end user
		for (int i=0;i<Array.getLength(result);i++)
				{
					if (result[i] != '0')
					{
						System.out.println(result[i] + " is a duplicate element");
					}
				}
	}

}
