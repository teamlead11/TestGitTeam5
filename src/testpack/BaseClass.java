package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
}
