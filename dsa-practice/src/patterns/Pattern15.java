package patterns;

import java.util.Scanner;

public class Pattern15 {
	public void printPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern15 obj=new Pattern15();
		obj.printPattern(n);
		sc.close();
	}
}
