package patterns;

import java.util.Scanner;

public class Pattern14 {
	public void printPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern14 obj=new Pattern14();
		obj.printPattern(n);
		sc.close();
	}
}
