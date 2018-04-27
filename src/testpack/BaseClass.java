package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();

	}
	
	public void ganesh(){
		
	}
public void bharathi() {
	String original,reverse ="";
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter a String to reverse");
	   original =s.nextLine();
	   int length=original.length();
	   for(int i=length-1;i>=0;i--) 
		   reverse=reverse+original.charAt(i);
		   System.out.println("Reversed of entered String is:" +reverse);
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
	public static void main1(String[] args) {
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
