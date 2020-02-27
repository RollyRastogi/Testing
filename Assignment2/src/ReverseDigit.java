import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		int var;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a no.");
		var=sc.nextInt();
		int newnum=0;
		while (var!=0)
		{
			newnum=newnum*10;
			newnum=newnum+var%10;
			var=var/10;
		}
		System.out.println(newnum);
	}

}
