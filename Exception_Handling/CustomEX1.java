package Anudip;
import java.util.Scanner;

public class CustomEX1 {
	public static void check(int age) {
		if(age<18)
		{
			throw new ArithmeticException("Your not elligible for voting");
		}
		else
		{
			System.out.println("You have right to vote");
		}
	}
	public static void main(String[] args) {
		CustomEX1 obj=new CustomEX1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		obj.check(age);
	
		
	}

}
