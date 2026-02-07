package patterns;

import java.util.Scanner;

public class Pattern18 {
	public void printPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(char j=(char)('A'+n-1-i);j<=(char)('A'+n-1);j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern18 obj=new Pattern18();
		obj.printPattern(n);
		sc.close();
	}
}
