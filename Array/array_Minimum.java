package Anudip;
import java.util.*;

public class array_Minimum {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//initialization of an array
		int arr[] =new int[5];
		int i,min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		
		for(i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		min=arr[0];
		for(i=0;i<5;i++)
		{
			if(arr[i]<min) {
				min =arr[i];
			}
				
			
						
		}
		

}
