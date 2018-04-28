package testpack;

<<<<<<< HEAD
public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

=======
import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();
		b.shalu();
>>>>>>> de869ed5f8f97ad9513f00df8d728c0fbe1e252a
	}
	
	public void ganesh(){
		
	}
<<<<<<< HEAD
public void TeenaPreethi() {
String s = "welcome";
String x = "";
for (int i = s.length(); i >= 0; i--) {
	x=x+s.charAt(i);
}
System.out.println(x);
}
=======

	public void nagamani()

	{
		String str = "nagamani";
		 
		char[] s = str.toCharArray();
		 
		for (int i = s.length - 1; i >= 0; i--)
		{
		    System.out.print(s[i]);    
		}

		
		
	

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
>>>>>>> de869ed5f8f97ad9513f00df8d728c0fbe1e252a
}
