package logical.question.array.day2;

import java.util.Scanner;


/*Count Odd and Even Numbers
Given an array {1, 2, 3, 4, 5, 6}, write a program to count how many
elements are odd and how many are even*/

public class CountOddAndEvenNumber {

	public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		countOddAndEvenNumber(nums);
		
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
	
	public static void countOddAndEvenNumber(int []arr) {
		int ecount=0;
		int ocount=0;
		for(int x:arr) {
			int z=(x % 2 == 0) ? ecount++ : ocount++;
		}
		System.out.println("even elements count are:"+ecount);
		System.out.println("odd elements count are:"+ocount);
	}

}
