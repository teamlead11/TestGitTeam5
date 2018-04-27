package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();
		b.saravanan();

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
	
	public void saravanan() {
		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = s.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
		reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);

	}
}
