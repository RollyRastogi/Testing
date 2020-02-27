import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a word.");
		String MyWord=sc.next();
		int WordLen=MyWord.length();
		String str ="";
		MyWord=MyWord.toLowerCase();
		
		for(int i=0 ;i<WordLen/2 ;i++) 
		{
			if (MyWord.charAt(i)==MyWord.charAt(WordLen-1-i)) {
				str="Yes";
			}
			else {
				str="No";
				break;
			}
		}
		if (str=="Yes") {
			System.out.println("Its a Palindrome.");
		}
		else {
			System.out.println("Its not a Palindrome.");
		}
			
		}
	}

