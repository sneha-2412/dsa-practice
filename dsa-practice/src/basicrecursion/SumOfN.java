package basicrecursion;

public class SumOfN {
	public int nSum(int i)
	{
		if(i==1)
			return 1;
		return i+nSum(i-1);
	}
	public static void main(String[] args) {
		int n=5;
		SumOfN obj=new SumOfN();
		System.out.print("Sum :"+obj.nSum(n));
	}
}
