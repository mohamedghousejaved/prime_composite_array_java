import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[] numbers = new int[numberOfValues];
        for (int i = 0; i < numberOfValues; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] primes = new int[numberOfValues];
        int[] composites = new int[numberOfValues];
        int primeCount = 0;
        int compositeCount = 0;

        for (int i = 0; i < numberOfValues; i++) {
            if (isPrime(numbers[i])) {
                primes[primeCount++] = numbers[i];
            } else {
                composites[compositeCount++] = numbers[i];
            }
        }

        System.out.println("\nPrime numbers:");
        for (int i = 0; i < primeCount; i++) {
            System.out.println(primes[i]);
        }

        System.out.println("\nComposite numbers:");
        for (int i = 0; i < compositeCount; i++) {
            System.out.println(composites[i]);
        }

        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
