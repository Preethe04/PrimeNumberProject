public class PrimeNumber {
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        int number = 7;
        System.out.println(number + (obj.isPrime(number) ? " is Prime" : " is Not Prime"));
    }
}
