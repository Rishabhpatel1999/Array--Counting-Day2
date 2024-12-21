package logical.question.array.day2;

import java.util.Scanner;

/*Count and Print Distinct Elements.
Write a program to count the number of distinct/unique/non repeated
elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique
elements.*/


public class DistinctElements {
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		distinctNumber(nums);

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
	
	public static boolean isAvailable(int[]arr,int element,int index) {
		for(int i=0;i<index;i++) {
			if(arr[i]==element) {
				return true;
			}
		}
		return false;
	}
	
	public static void distinctNumber(int []arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(isAvailable(arr,arr[i],i)) {
				continue;
			}
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("Unique elements are: "+ arr[i]);
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("No unique elements found");
		}
	}

}
