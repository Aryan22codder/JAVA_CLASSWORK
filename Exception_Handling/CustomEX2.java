package Anudip;
import java.util.*;

public class CustomEX2 {
	int age;
	String name;
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter your Name : ");
		name=sc.nextLine();
		System.out.println("Enter your Age : ");
		age=sc.nextInt();
	}
	public void validate() 
	{
		if(age>=3)
		{
			System.out.println("You have grown to up to take education");
		}
		else
		{
			throw new ArithmeticException("You are lucky!!! Enjoy your childhood!!");
		}
		
	}
	public static void main(String[] args) {
		CustomEX2 obj=new CustomEX2();
		obj.accept();
		obj.validate();
	}

}
