import java.util.Scanner;

public class WordInStr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string....");
		String str=sc.nextLine();
		
		str=str.replaceAll(" +"," ");
		
		String[] strarr=str.split(" ");
		
		if (strarr.length>1) 
		{
			System.out.println("There are " + strarr.length + " words in the string.");
		}
		else 
		{	
			System.out.println("There is only one word in the string.");	
		}
	}

}
