import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int number = scan.nextInt();
        int reverse = 0;

        for (; number != 0; ) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The Reverse of input number is " + reverse);
    }
}
