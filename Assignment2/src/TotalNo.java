import java.util.Scanner;

public class TotalNo {

	public static void main(String[] args) {
		//String myword, newword = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string....");
		String str=sc.nextLine();
		
		int charcount=0;
		int intcount=0;
		int lowCount=0;
		int Uppcount=0;
		int Splcharcount=0;
		int Wordcount=0;
		
		String newword;
		String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
		
		String[] mywords=str.split(" ");
		Wordcount=mywords.length;
		
		for (int i=0;i<mywords.length; i++) 
		{
			newword=mywords[i];

			for(int j=0;j<newword.length();j++) 
			{
				if (Character.isDigit(newword.charAt(j)))
				{
					intcount=intcount+1;
				}
				else if(Character.isAlphabetic(newword.charAt(j))) 
				{
					charcount=charcount+1;	
					if(Character.isLowerCase(newword.charAt(j))) 
					{
						lowCount=lowCount+1;	
					}
					else if (Character.isUpperCase(newword.charAt(j)))
					{
						Uppcount=Uppcount+1;
					}
				}
				else if (specialCharacters.contains(Character.toString(newword.charAt(j)))) {
					 Splcharcount=Splcharcount+1;
				}				
			}		
		}
		System.out.println("Total no of words in given string are " + Wordcount);
		System.out.println("Total no of integers in given string are " + intcount );
		System.out.println("Total no of characters in given string are " + charcount );
		System.out.println("Total no of lower case characters in given string are " + lowCount );
		System.out.println("Total no of upper case characters in given string are " + Uppcount );
		System.out.println("Total no of special characters in given string are " + Splcharcount );	
	}

}
