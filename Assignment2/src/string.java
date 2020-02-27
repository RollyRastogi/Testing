import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String myword, newword = "";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string....");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		String[] strarr=str.split(" ");
		
		for (int j=0; j<strarr.length; j++) {
			myword=strarr[j];
			for(int i=myword.length()-1;i>=0; i-- ) {
				newword=newword+ myword.charAt(i);
			}
			newword=newword+ " ";
		}
		System.out.println(newword);
	}

}
