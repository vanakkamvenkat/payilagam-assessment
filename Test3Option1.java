package payilagam;

public class Test3Option1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org = "Liverpool"; //String which has to be reversed is mentioned here
		
		//Creating character array to check each string character individually in for loop
		char [] orgc = org.toCharArray(); 
		int len = org.length(); 
		
		String rev = org; //Placeholder string in which the original string which has to be reversed is mentioned
		char [] revc = rev.toCharArray();
		
		//This function is used to append all the characters to the reversed string
		StringBuilder revsb = new StringBuilder(); 
		
		/*For loop is designed such that the last character of original string is stored in the first character of 
		 reverse string and so on.*/
		
		for (int j=0;j<org.length();j++)
		{
			revc[j]=orgc[(len-1)-j];	
			revsb.append(revc[j]);
		}
		
		rev = revsb.toString();
		
		System.out.println("The original string is " + org + ". It's reversal is " +rev);
		
	}

}
