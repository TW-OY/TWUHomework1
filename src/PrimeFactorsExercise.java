import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
        System.out.print(generate(30));
    }

    public static ArrayList generate(int n) {
        ArrayList factors = new ArrayList();
        for(int i = 2; i <= n ;i++) {
            if(n % i == 0) {
                if (isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
