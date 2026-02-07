package patterns;

import java.util.Scanner;

public class Pattern8 {
	public void printPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i-1;j++)
				System.out.print("  ");
			for(int j=0;j<2*n-(2*i-1);j++)
				System.out.print("* ");
			for(int j=0;j<i-1;j++)
				System.out.print("  ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern8 obj=new Pattern8();
		obj.printPattern(n);
		sc.close();
	}
}
