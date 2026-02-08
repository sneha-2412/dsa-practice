package basicmaths;

public class GCD {
	public void bruteforce(int n1,int n2) {
		int gcd=1;
		for(int i=1;i<=Math.min(n1,n2);i++)
			if(n1%i==0 && n2%i==0)
				gcd=i;
		System.out.println(gcd);
	}
	
	public void better(int n1,int n2) {
		int gcd=1;
		for(int i=Math.min(n1,n2);i>0;i--)
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
				break;
			}
	}

	public int optimal(int a,int b) {
		while(a>0 && b>0)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		if(a==0)
			return b;
		return a;
	}
	public static void main(String[] args) {
		GCD gcd=new GCD();
		gcd.bruteforce(9,12);
		gcd.better(9,12);
		System.out.println(gcd.optimal(9,12));
	}

}
