package logical.question.array.day2;

import java.util.Scanner;


/*Find the Majority element.
Print the Element which appeared More than n/2 Times.
[n is length of the array]

Write a program to find an element in an array
{3, 3, 4, 2, 4, 4, 2, 4, 4}
that appears more than n/2 times. If no such element exists,
display "No majority element."
*/

public class MajorityElementsMoreThanHalfOfLength{
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		elementsWhichAppearMoreThanHalfTheLength(nums);
	}
	
	public static int[] createArray() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr ;
	}
	
	public static void printArray(int []arr) {
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void elementsWhichAppearMoreThanHalfTheLength(int []arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
			  System.out.println("Element is: "+arr[i]);
			  flag=true;
			 }
			   
		}
		if(!flag) {
	    	System.out.println("No Such Elements Found");
	    }
	}
}
