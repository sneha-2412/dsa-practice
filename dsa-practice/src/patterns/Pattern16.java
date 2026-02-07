package patterns;

import java.util.Scanner;

public class Pattern16 {
	public void printPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern16 obj=new Pattern16();
		obj.printPattern(n);
		sc.close();
	}
}
