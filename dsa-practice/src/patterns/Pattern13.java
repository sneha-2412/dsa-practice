package patterns;

import java.util.Scanner;

public class Pattern13 {
	public void printPattern(int n) {
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern13 obj=new Pattern13();
		obj.printPattern(n);
		sc.close();
	}
}
