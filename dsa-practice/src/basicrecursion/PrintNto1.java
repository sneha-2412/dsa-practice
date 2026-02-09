package basicrecursion;

public class PrintNto1 {
	public void printnum(int n)
	{
		if(n==0)
			return;
		System.out.print(n+" ");
		printnum(n-1);
		//System.out.print(n+" ");
	}
	public static void main(String[] args) {
		int n=25;
		PrintNto1 obj=new PrintNto1();
		obj.printnum(n);
	}
}
