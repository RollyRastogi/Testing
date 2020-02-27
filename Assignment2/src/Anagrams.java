import java.util.*;

public class Anagrams {
	public static void main(String[] args) {
		
		String str1="Mother In Law";
		String str2="Hitler Woman";
		String newstr1, newstr2;
		String str6[]=str1.split(" ");
		//System.out.println(str6[0]);
		newstr1=str1.replaceAll(" ", "");
		newstr2=str2.replaceAll(" ", "");
		newstr1=newstr1.toLowerCase();
		newstr2=newstr2.toLowerCase();
		char arrstr1[] =new char[newstr1.length()];
		char arrstr2[] =new char[newstr2.length()];
		
		for (int i=0; i<newstr1.length(); i++)
		{
			arrstr1[i] =newstr1.charAt(i);
		}
		for (int j=0; j<newstr2.length(); j++)
		{
			arrstr2[j] =newstr2.charAt(j);
		}
		if (arrstr1.length==arrstr2.length) 
		{
			Arrays.sort(arrstr1);
			Arrays.sort(arrstr2);
			
			if ( Arrays.equals(arrstr1, arrstr2))
			{
				System.out.println(" Its a anagram.");
			}
			else
			{
				System.out.println("Its not a anagram.");
			}
		}
		else
		{
			System.out.println("Its not a anagram.");
		}
	}

}
