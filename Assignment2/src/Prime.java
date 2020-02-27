import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a no");
		int varno=sc.nextInt();
		boolean IsPrime = true;
		
		for (int i=2; i<=varno/2;i++)
		{
			if(varno%i==0)
			{
				IsPrime=false;
				break;
			}			
		}
		if (IsPrime==false) 
			{
			System.out.println("its not a prime no");	
			}
		else 
		{
			System.out.println("its  a prime no");			
		}
	////////////////////////////////////////////////////
		IsPrime=true;
		for(int j=2;j<=varno; j++)
		{
			for(int k=2; k<j;k++) 
			{
				if(j%k==0)
				{
					IsPrime=false;
					break;
				}				
			}
		if (IsPrime!=false) 
			System.out.print(j + " ");	
			
	    IsPrime=true;
		}
	}

}