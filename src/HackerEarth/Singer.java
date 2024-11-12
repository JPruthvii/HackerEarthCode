package HackerEarth;

import java.util.Scanner;

public class Singer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Interger Value");
		int N=sc.nextInt();
		System.out.println("Enter the Interger Values");

		int[]arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int counter=0;
		int value=0;
		for(int j=0;j<arr.length;j++)
		{
			int count=0;

			for(int k=0;k<arr.length;k++)
			{
				if(arr[j]==arr[k])
				{
					count++;
				}
			}
			if(counter<count)
			{
				counter=count;
				value=arr[j];
			}
		}
		System.out.println(value);
	}
}
