package Anudip;

public class Exception1 {
	public static void main(String[] args) {
		//TODO Auto generated stub
		int a=15,b=5,ans;
		int arr[] = new int[5];
		
		try 
		{
			ans=a/b;
			System.out.println("The divison is "+ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("This is some exception");
			
		}
	}

}
