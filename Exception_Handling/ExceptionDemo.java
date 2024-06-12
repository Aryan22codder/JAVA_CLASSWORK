package Anudip;

public class ExceptionDemo {
	public static void main(String[] args) {
		//TODO Auto generated method stub
		try 
		{
			int a[] = new int[5];   //Array Declaration
			int c = 23/0;
			a[5]=50/5;
			System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("You can divide by zero");
			
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
		finally {
			System.out.println("I Am only concern about the fundamnetals!!!!");
		}
	}

}
