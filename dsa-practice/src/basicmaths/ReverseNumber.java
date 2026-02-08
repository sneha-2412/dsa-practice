package basicmaths;

import java.util.Scanner;

public class ReverseNumber {
	public int revnum(int n)
	{
		int dig=0,rev=0;
		while(n>0) {
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ReverseNumber rn=new ReverseNumber();
		int res=rn.revnum(n);
		System.out.println(res);
		sc.close();
	}
}
