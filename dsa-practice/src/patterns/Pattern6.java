package patterns;

import java.util.Scanner;

public class Pattern6 {
	public void printPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern6 obj=new Pattern6();
		obj.printPattern(n);
		sc.close();
	}
}
