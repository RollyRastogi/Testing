import java.util.Scanner;

public class BiggestNo {

	public static void main(String[] args) {
		Scanner MyNo1=new Scanner(System.in);
		System.out.println("Please enter first integer no: ");
		int MyFirstNo=MyNo1.nextInt();
		System.out.println("Please enter second integer no: ");
		int MySecNo=MyNo1.nextInt();
		System.out.println("Please enter third integer no: ");
		int MyThirdNo=MyNo1.nextInt();

		if ((MyFirstNo>MySecNo) && (MyFirstNo>MyThirdNo)) 
		{
			System.out.println("Biggest No is : " +MyFirstNo);
		}
		else if ((MySecNo>MyFirstNo) && (MySecNo>MyThirdNo))
		{
			System.out.println("Biggest No is : " +MySecNo);
		}
		else{
			System.out.println("Biggest No is : " +MyThirdNo);
		}
	}

}
