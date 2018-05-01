package testpack;

public class BaseClass {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		b.nagamani();
		b.raghu();

	}

	public void ganesh() {

	}

	public void nagamani()

	{
		String str = "nagamani";

		char[] s = str.toCharArray();

		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]);
		}

	}

	public void raghu() {
		
		String str = "Java and Selenium";
		char ch[] = new char[str.length()];
		System.out.println("\nNormal string : " + str);

		for (int i = 0; i < str.length(); i++) 
			ch[i] = str.charAt(i);
		
		System.out.print("\nReversed String : ");
		for (int j = str.length() - 1; j >= 0; j--) 
			System.out.print(ch[j]);
		

	}
}
