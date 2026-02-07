package patterns;

import java.util.Scanner;

public class Pattern7 {
	public void printPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
				System.out.print("  ");
			for(int j=0;j<2*i-1;j++)
				System.out.print("* ");
			for(int j=0;j<n-i;j++)
				System.out.print("  ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern7 obj=new Pattern7();
		obj.printPattern(n);
		sc.close();
	}
}
