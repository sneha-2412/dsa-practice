package basicrecursion;

public class Print1toN {
	public void printnum(int current,int n)
	{
		if(current>n)
			return;
		System.out.println(current+" ");
		printnum(current+1,n);
	}
	public static void main(String[] args) {
		int n=20;
		Print1toN pr=new Print1toN();
		pr.printnum(1,n);
	}
}
