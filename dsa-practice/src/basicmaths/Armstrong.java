package basicmaths;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int dc=(int)(Math.log10(n)+1);
		//dc = String.valueOf(n).length();
		int temp=n,arm=0;
		while(n>0)
		{
			int dig=n%10;
			arm+=Math.pow(dig,dc);
			n=n/10;
		}
		if(temp==arm)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		sc.close();
	}
}
