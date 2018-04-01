package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();

		b.praveenMethod();


		b.shalu();

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
	


	public void shalu() {
		String original,reverse ="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = s.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		System.out.println("Reverse of Enter a string is:" + reverse);
	}
}

