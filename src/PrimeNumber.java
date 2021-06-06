import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check ");
        int number = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is PRIME");
        } else {
            System.out.println(number + " is NOT PRIME");
        }
    }
}
