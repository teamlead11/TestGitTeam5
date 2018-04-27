package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();
		b.praveenMethod();

	}
	
	public void ganesh(){
		
	}

	public void nagamani()

	{
		String str = "nagamani";
		 
		char[] s = str.toCharArray();
		 
		for (int i = s.length - 1; i >= 0; i--)
		{
		    System.out.print(s[i]);    
		}

		
		
	

	}
	public void praveenMethod() {
	 
		String Str=new String();

		String reverse="";

		Scanner in=new Scanner(System.in);

		Str=in.nextLine();

		int len=Str.length();

		for(int i=(len-1);i>=0;i--){

		reverse+=Str.charAt(i);

		}

		System.out.println(reverse);

		}
	}

