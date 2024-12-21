package logical.question.array.day2;

import java.util.Scanner;

/*Count Elements Greater than Average.
Write a program to count how many elements in the array
{10, 20, 30, 40, 50}
are greater than the average of all the elements.*/


public class CountElementGreaterThanAverage {
	
   public static void main(String[] args)
   {
		
		int []nums=createArray();
		printArray(nums);
		int avg=average(nums);
		countElementGreaterThanAverage(nums, avg);
		
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
	
	public static int average(int []arr)
	{
		int sum=0;
		for(int x:arr) {
			sum=sum+x;
		}
		System.out.println("average is:"+(sum/arr.length));
		return sum/arr.length;
	}
	
	public static void countElementGreaterThanAverage(int []arr,int avg)
	{
		int count=0;
		for(int x:arr) {
			String z=(x>avg)?" "+count++ :" No element greater than avg";
		}
		System.out.println("Number of elements Greater than average are: "+count );
	}
	
	
}
