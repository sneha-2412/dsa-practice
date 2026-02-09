package basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
	public List<Integer> getdivisors(int n)
	{
		List<Integer> res = new ArrayList<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0)
				res.add(i);
			if(i!=n/i)
				res.add(n/i);
		}
		return res;
	}
	public static void main(String[] args) {
		Divisors div = new Divisors();
		List<Integer> result=div.getdivisors(30);
		System.out.print("Divisors of 30 : ");
		Collections.sort(result);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
	}
}
