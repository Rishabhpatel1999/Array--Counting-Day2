package logical.question.array.day2;

import java.util.Scanner;

/*Count Elements Appearing Exactly k Times.

Write a program to count how many elements appear exactly 2 times
in an array {1, 2, 2, 3, 4, 4, 5, 5}.
Example: 2, 4, and 5 each appear exactly twice.
If k time elements are not found then print "No element found".*/

public class CountElementAppearingExactlyKtimes {
	
	final static Scanner sc =new Scanner(System.in);
	
public static void main(String[] args) {
		
	
		int []nums=createArray();
		printArray(nums);
		countElementAppearingExactlyKtimes(nums);
	}
	
	public static int[] createArray() {
		
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//sc.close();
		return arr ;
	}
	
	public static void printArray(int []arr) {
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	/* here we are seeing that the particular element is already counted or not*/
	
	public static boolean isAvailable(int []arr,int element,int index) {
		for(int i=0;i<index;i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		return false;
	}
	
	
	
		public static void countElementAppearingExactlyKtimes(int []arr) {
			int elementCount=0;
			System.out.println("Exactly how many times the number should be present:");
			int k=sc.nextInt();
			boolean flag=false;
			for(int i=0;i<arr.length;i++) {
				int count =1 ;
				if( isAvailable(arr,arr[i],i)) {
					continue;
				}
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count==k) {
					System.out.println("the element which are occuring "+k+" times is: "+arr[i]);
					elementCount++;
					flag=true;
				}
			}
			
			System.out.println("The number of elements which occer "+ k + " times are:"+ elementCount);
			if(!flag) {
				System.out.println("No elements found");
			}
			
		}
	
	}


