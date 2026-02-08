package basicmaths;

public class PalindromeNumber {
	public String palindromeNumber(int n)
	{
		int temp=n,rev=0;
		while(n>0) {
			int dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(temp==rev)
			return "Palindrome Number";
		else
			return "Not a Palindrome Number";
			
	}
	public static void main(String[] args) {
		PalindromeNumber rn=new PalindromeNumber();
		System.out.println(rn.palindromeNumber(123241));
	}
}
