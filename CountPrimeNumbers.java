package logical.question.array.day2;

import java.util.Scanner;

/*Write a program to count how many elements in an array
{2, 3, 4, 5, 6, 7, 8, 9, 10} are prime numbers.
Example: 2, 3, 5, and 7 are prime.*/

public class CountPrimeNumbers {
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		countPrimeNumber(nums);;
		
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
	
	public static void countPrimeNumber(int []arr) {
		int elementCount=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<=arr[i];j++) {
				
				if(arr[i]%j==0) {
					count++;
				}
				if(arr[i]<=1) {
					count=0;
				}
			}
			if(count==2) {
				elementCount++;
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("no Elements are prime");
		}
		System.out.println("the number of elements which are prime are: "+elementCount);
	}

}
