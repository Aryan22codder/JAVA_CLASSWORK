package Anudip;
import java.util.*;

public class Array_Example {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//initialization of an array
		int arr[] =new int[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		
		for(i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("You have entered: ");
		
		for(i=0;i<5;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	}
}
