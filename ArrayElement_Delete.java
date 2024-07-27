package myQuestions;

import java.util.*;

public class ArrayElement_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size; 
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size=input.nextInt();
		int arr1[]=new int[size];
		for(int i=0; i<size; i++) 
		{
			System.out.println("Enter Element of Array");
			arr1[i]= input.nextInt();
			
		}
		System.out.println("You Entered Array");
		for(int j=0; j<size; j++)
		{
			System.out.println(arr1[j]+" ");
		}
		
		//DELETE ELEMENT 0F ARRAY
		int arr2[]=new int[size-1];
		
		
		System.out.println("Enter index of Array which you want to delete");
		int Del=input.nextInt();
		
		for(int i=0; i<size-1;i++) {
			if(i<Del)
			{
				arr2[i]=arr1[i];
			}
		
			else
			{
				arr2[i]=arr1[i+1];
		
			}	
									}
			System.out.println("Required Array is ");
			for(int i=0; i<size-1; i++)
		{
			System.out.print(arr2[i]+" ");
		}
}
	}
