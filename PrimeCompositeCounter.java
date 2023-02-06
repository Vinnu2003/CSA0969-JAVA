import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to enter: ");
        int count = scanner.nextInt();
        int primeCount = 0;
        int compositeCount = 0;
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();
            
            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        
        System.out.println("Number of prime numbers: " + primeCount);
        System.out.println("Number of composite numbers: " + compositeCount);
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
