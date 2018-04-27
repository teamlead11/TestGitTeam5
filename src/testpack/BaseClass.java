package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();
		b.selvakumar();

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
	public void selvakumar(){
		
		String text="First Geeg";
		StringBuilder reversableText=new StringBuilder();
		
		//Append a given string into Stringbuilder(reversableText)
		reversableText.append(text);
		
		//Reverse Given String by Using in built method(stringbuilder.reverse())
		reversableText=reversableText.reverse();
		
		System.out.println("Your Reversed String is:\t"+reversableText);
	}
	public static void main(String[] args) {
		String original,reverse ="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		System.out.println("Reverse of Enter a string is:" + reverse);
	}
}
