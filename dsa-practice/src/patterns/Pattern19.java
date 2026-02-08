package patterns;

import java.util.Scanner;

public class Pattern19 {
	public void printPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print("*");
			for(int j=0;j<2*i;j++)
				System.out.print(" ");
			for(int j=i;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<n;i++)
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern19 obj=new Pattern19();
		obj.printPattern(n);
		sc.close();
	}
}
