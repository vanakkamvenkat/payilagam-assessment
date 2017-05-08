package payilagam;

public class Test3Option2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cnt = "Missippii"; //String in which the characters will be displayed
		int counter = 0;
		char check = 's'; //Character which has to be checked
		
		for (int i=0; i<cnt.length(); i++)
		{
			if (cnt.charAt(i) == check) 
			{
				counter++;
			}
		}
		
		System.out.println("The character " + check + " is present " + counter + " times in the string " + cnt );
	}

}
