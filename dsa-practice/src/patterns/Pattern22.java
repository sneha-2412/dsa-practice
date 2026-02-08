package patterns;

import java.util.Scanner;

public class Pattern22 {
	public void printPattern(int n) {
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				int top=i;
				int left=j;
				int bottom=(2*n-2)-i;
				int right=(2*n-2)-j;
				int minDist=Math.min(Math.min(right, bottom),Math.min(top,left));
				System.out.print((n-minDist)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern22 obj=new Pattern22();
		obj.printPattern(n);
		sc.close();
	}
}
