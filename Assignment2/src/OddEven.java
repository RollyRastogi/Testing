import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a no...");
		int varno=sc.nextInt();
		
		if(varno%2==0)
		{
			System.out.println(varno+ " is a even no.");
		}
		else
		{
			System.out.println(varno+ " is a odd no.");
		}
	}

}
