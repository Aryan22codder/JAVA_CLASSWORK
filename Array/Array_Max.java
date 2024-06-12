package Anudip;

import java.util.Scanner;

public class Array_Max {public static void main(String[] args) {
	//TODO Auto-generated method stub
	
	//initialization of an array
	int arr[] =new int[5];
	int i,j,temp;
	Scanner sc = new Scanner(System.in); 
		System.out.println("Enter five numbers:");
		
		for(i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();
		}
	
	for(i=0;i<5;i++) {
		for(j=i+1;j<5;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		} 
	 
	 }
	 for(i=0;i<5;i++) {
		 System.out.println(arr[i]);
		 }
	 }

}
