package testpack;



public class BaseClass {

	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.nagamani();
		b.deepak();

	}
	
	public void ganesh(){
		
	}
	
	public void deepak() {
		String s="@@@sygolonhcetsneerg@@@";
		char[] c = s.toCharArray();
		    for (int i = c.length-1; i>=0; i--)
	          System.out.print(c[i]);
		
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
}
