package basicmaths;

import java.util.Scanner;

public class DigitCount {
	DigitCount(int n)
	{
		int count=0;
		while(n>0) {
			count+=1;
			n=n/10;
		}
		//int count=(int)(Math.log10(n))+1;
		System.out.print("Count of digits:"+count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		new DigitCount(n);
		sc.close();
	}
}
