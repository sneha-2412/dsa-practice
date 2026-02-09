package basicmaths;
class Solution {
    public boolean checkPrime(int n) {
        int cnt = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i) {
                    cnt++;
                }
            }
        }

        return cnt == 2;
    }
}

public class Prime {
    public static void main(String[] args) {
        int n = 1483;
        Solution obj = new Solution();
        boolean isPrime = obj.checkPrime(n);

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

