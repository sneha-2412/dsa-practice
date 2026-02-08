package patterns;

import java.util.Scanner;

public class Pattern20 {
	public void printPattern(int n) {
		for(int i=0;i<2*n-1;i++)
		{
			if(i>=n)
			{
				for(int j=2*n-i-1;j>0;j--)
					System.out.print("*");
				for(int j=0;j<2*i-2*n+2;j++)
					System.out.print(" ");
				for(int j=2*n-i-1;j>0;j--)
					System.out.print("*");
				System.out.println();
			}
			else
			{
				for(int j=0;j<i+1;j++)
					System.out.print("*");
				for(int j=0;j<2*n-2*i-2;j++)
					System.out.print(" ");
				for(int j=0;j<i+1;j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
	public void printPattern1(int n)
	{
		int spaces=2*n-2;
		for(int i=1;i<=2*n-1;i++)
		{
			int stars=i;
			if(i>n) stars=2*n-i;
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
			if(i<n) spaces-=2;
			else spaces+=2;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern20 obj=new Pattern20();
		obj.printPattern1(n);
		sc.close();
	}
}
