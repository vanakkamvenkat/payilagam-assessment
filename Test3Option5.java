package payilagam;

public class Test3Option5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mystery = "Coutinho"; //String for whom the length is to be found without using length function
		
		mystery=mystery+'#';
		
		int len = mystery.indexOf('#');
		
		System.out.println("The length of the string " + mystery.substring(0, len) + " is " + len);
		
	}

}
