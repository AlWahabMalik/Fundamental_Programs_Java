import java.util.Scanner;
public class ArrayInsertion {

		public static void main(String[] args) {
		
			int size;
			
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter Array Size");
				size=input.nextInt();
				int arr1[]=new int[size];
				
				System.out.print("Enter Array Elements");
				for(int i=0; i<size;i++) {
					arr1[i]=input.nextInt();
				}
					//DISPLAY ELEMENTS
					System.out.println("Array Elements Entered by User");
					for(int j=0; j<arr1.length;j++)
					{
						System.out.println(arr1[j]+" ");
					}
					
				
					int arr2[]=new int[size+1];
					System.out.println("Enter index of new value ");
					int index=input.nextInt();
					
					System.out.println("Enter value which You want to insert ");
					int value=input.nextInt();
					
					for(int k=0;k<size+1;k++) {
						if(k<index) {
							arr2[k]=arr1[k];
						}
						
						else if(k==index) {
							arr2[k]=value;
						}
						else
						{
							arr2[k]=arr1[k-1];
						}
					}
					
					
					for(int m=0; m<size+1; m++) {
						System.out.println(arr2[m]);
					}
			}
				
				
			}
		}