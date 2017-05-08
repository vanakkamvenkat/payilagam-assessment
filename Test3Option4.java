package payilagam;

public class Test3Option4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vowel = "SAMEaLILOHEiULL"; //String in which vowel has to be replaced
		System.out.println("The original string is " + vowel);
		char [] vowelc = vowel.toCharArray();
		StringBuilder vowelsb = new StringBuilder();
		
		for (int i=0; i<vowel.length();i++)			
		{
			if (vowelc[i] == 'A' || vowelc[i] == 'E' || vowelc[i] == 'I' || vowelc[i] == 'O' || vowelc[i] == 'U')
			{
				vowelc[i] = ' ';
			}
			vowelsb.append(vowelc[i]);
		}
		vowel = vowelsb.toString();
		System.out.println("The revised string is  " + vowel);
	}
}
